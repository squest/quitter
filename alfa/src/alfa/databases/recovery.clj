(ns alfa.databases.recovery
  (:require [datomic.api :as d]))

(defn reset-database
  []
  (let [{:keys [db-uri part]} (-> "./config.edn"
                                  slurp
                                  read-string
                                  (get :database))
        schema (read-string (slurp "./resources/schema/schema.edn"))]
    (d/delete-database db-uri)
    (d/create-database db-uri)
    @(d/transact (d/connect db-uri) schema)))
