(ns alfa.databases.core
  (:require [com.stuartsierra.component :as component]))

;;Feel free to change things

(declare make)

(defrecord Database [db-uri part]
  component/Lifecycle
  (start [this])
  (stop [this]))

(defn make
  [db-uri part mode]
  (map->Database {:db-uri db-uri
                  :part   part}))
