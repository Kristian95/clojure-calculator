(ns clojure-calculator.core
  (:gen-class))

(def operations #{"add" "devide" "multiply" "subtraction"})

(defn print-age [age]
	(println "Your age is: " age))

(defn is-small [age]
  (if (< age 5) (throw (IllegalArgumentException. "Age should be 6 or higher")) (println "All good")))

(defn can-calculate? []
	(println "Enter your age")
	(let [age (read-line)]
	(print-age age)
	(is-small (Integer/parseInt age))))

(defn process []
	(println "Enter operation")
		(let [operation (read-line)]
		(if (contains? operations operation) (println "All good.. continue") (throw (IllegalArgumentException. "Invalid operation")))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (can-calculate?)
  (process))
