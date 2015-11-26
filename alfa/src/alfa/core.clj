(ns alfa.core
  (:require [alfa.system :as system]))

(defn -main [& args]
  (system/go))
