(ns dev
  (:require [clojure.tools.namespace.repl :refer [refresh refresh-all]]
            [alfa.system :refer :all]))

(defn go []
  (init)
  (start))

(defn reset []
  (stop)
  (refresh :after 'dev/go))

(defn go-mock []
  (init :mock)
  (start))

(defn reset-mock []
  (stop)
  (refresh :after 'dev/go-mock))
