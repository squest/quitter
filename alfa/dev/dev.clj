(ns dev
  (:require [clojure.tools.namespace.repl :refer [refresh refresh-all]]
            [alfa.system :refer :all]))

(defn go []
  (init)
  (start))

(defn reset []
  (stop)
  (refresh :after 'alfa.system/go))
