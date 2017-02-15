(ns cprop-order.core
  (:gen-class)
  (:require [cprop.core :refer [load-config]]))

(defn -main [& args]
  (println "classpath: " (System/getProperty "java.class.path"))
  (println "value: "(:value (load-config))))


