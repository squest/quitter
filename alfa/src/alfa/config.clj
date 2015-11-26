(ns alfa.config)

(defn config
  []
  {:database {:db-uri "datomic:free://localhost:4334/quitter"
              :part   :db.part/app}})