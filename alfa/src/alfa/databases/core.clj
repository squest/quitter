(ns alfa.databases.core
  (:require
    [com.stuartsierra.component :as component]
    [datomic.api :as d]
    [taoensso.timbre :as log]))

;;Feel free to change things

(declare make init-db)

(defrecord Database [db-uri part]
  component/Lifecycle
  (start [this]
    (if-let [conn (try (d/connect db-uri)
                       (catch Exception e false))]
      (if (get this :conn)
        (do
          (log/info "Datomic connection is already prepared")
          this)
        (do
          (log/info "Database is prepared!")
          (log/info "Making connection to db!")
          (assoc this :conn conn)))
      (do
        (log/info "There is no database. Creating one!")
        (assoc this :conn (init-db db-uri part)))))
  (stop [this]
    (if (get this :conn)
      (do
        (log/info "Removing datomic connection!")
        (dissoc this :conn))
      (do
        (log/info "There is no connection!")
        this))))

(defn make-database
  [{:keys [db-uri part] :as database}]
  (map->Database {:db-uri db-uri
                  :part   part}))

(defn- init-db
  [db-uri part]
  (let [schema (read-string (slurp "./resources/schema/schema.edn"))]
    (d/create-database db-uri)
    (let [conn (d/connect db-uri)]
      @(d/transact conn schema)
      conn)))