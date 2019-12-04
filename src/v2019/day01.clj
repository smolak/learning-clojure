(ns v2019.day01)

;; Needed for IO operations
(use 'clojure.java.io)

;; Fuel consumption
(defn fuel-consumption
  [mass]

  (- (Math/floor (/ mass 3)) 2))

;; Read 1 line at a time
(defn read-line-from-file
  [file]

  (with-open [rdr (reader file)]
    (doseq [line (line-seq rdr)]
      (println line " - " (fuel-consumption (Integer/parseInt line))))))

(defn day1
  "I don't do a whole lot."
  [file]
  (read-line-from-file file))

(defn -main
  "Main"
  []
  (day1 "./resources/day1/input.txt"))
