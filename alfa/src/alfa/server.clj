(ns alfa.server
  (:gen-class) ; for -main method in uberjar
  (:require [com.stuartsierra.component :as component]
            [io.pedestal.http :as server]
            [alfa.service :as service]
            [alfa.routes :as routes]))

;; This is an adapted service map, that can be started and stopped
;; From the REPL you can call server/start and server/stop on this service
(defrecord WebServer [server service]
  component/Lifecycle
  (start [this]
         (if server
           (do
             (println "server udah nyala baoss... lo mau ngerusak ??")
             this)
           (let [server (-> (:service-data service)
                            server/default-interceptors
                            server/dev-interceptors
                            server/create-server)]
             (do
               (server/start server)
               (-> this
                   (assoc :server server))))))
  (stop [this]
        (if-not server
          (do
            (println "server nya udah mateeeeee")
            this)
          (do
            (server/stop server)
            (-> this
                (assoc :server nil))))))

(defn make-web-server []
  (map->WebServer {}))

(defn -main
  "The entry-point for 'lein run'"
  [& args]
  (println "\nCreating your server..."))
