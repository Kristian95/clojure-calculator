(ns clojure-calculator.core
  (:gen-class))

(defn print-age [age]
	(println "Your age is: " age))

(defn is-small [age]
  (if (< age 5) (println "Sorry, too small to use calculator :(") (println "All good")))

(defn can-calculate? []
	(println "Enter your age")
	(let [age (read-line)]
	(print-age age)
	(is-small (Integer/parseInt age))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (can-calculate?))
