(ns alfa.system
  (:require
    [com.stuartsierra.component :as component]
    [alfa.routes :as routes]
    [alfa.server :as server]
    [alfa.service :as service]
    [alfa.databases.core :as database]))

(def conf (read-string (slurp "config.edn")))

(defn init-system
  [conf]
  (component/system-map
    :routes (routes/make-routes-map)

    :service (component/using
               (service/make-service-map)
               [:routes])
    :web-server (component/using
                  (server/make-web-server)
                  [:service])
    :database (database/make-database (get conf :database))))

(defn init-mock-system
  [conf]
  (component/system-map
    :routes (routes/make-routes-map)

    :service (component/using
               (service/make-service-map)
               [:routes])
    :web-server (component/using
                  (server/make-web-server)
                  [:service])))

(def dev-system nil)

(defn init
  ([]
   (alter-var-root #'dev-system
                   (constantly (init-system conf))))
  ([mode]
   (alter-var-root #'dev-system
                   (constantly (init-mock-system conf)))))


(defn start []
  (alter-var-root #'dev-system component/start))


(defn stop []
  (alter-var-root #'dev-system
                  (fn [s] (when s (component/stop s)))))
