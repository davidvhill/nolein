(ns nolein.runner
  (:require [nolein.docker :as d]))

(defn run
  [opts]
  (println "I am running, without lein")
  (println "Docker's id is:" d/id))
