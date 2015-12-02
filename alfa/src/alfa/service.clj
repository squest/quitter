(ns alfa.service
  (:require
    [com.stuartsierra.component :as component]
    [io.pedestal.http :as bootstrap]
    [io.pedestal.http.route :as route]
    [io.pedestal.http.body-params :as body-params]))

(def service
  {:env :prod
   ::bootstrap/resource-path "/public"
   ::bootstrap/enable-csrf {}
   ::bootstrap/enable-session {}
   ::bootstrap/type :jetty
   ;;::bootstrap/host "localhost"
   ::bootstrap/port 3000})

(defonce
  runnable-service
  (-> service ;; start with production configuration
      (merge {:env :dev
              ;; do not block thread that starts web server
              ::bootstrap/join? false
              ;; Routes can be a function that resolve routes,
              ;;  we can use this to set the routes to be reloadable
              ;; all origins are allowed in dev mode
              ::bootstrap/allowed-origins
              {:creds true :allowed-origins (constantly true)}})))

(defrecord ServiceMap [service-data routes]
  component/Lifecycle
  (start [this]
    (let [service-map (assoc service-data
                        ::bootstrap/routes
                        (:routes routes))]
      (assoc this :service-data service-map)))
  (stop [this]
    (update-in this [:service-map ::bootstrap/routes] pop)))

(defn make-service-map
  ""
  []
  (map->ServiceMap {:service-data runnable-service}))
