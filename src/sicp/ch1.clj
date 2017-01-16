(ns sicp.ch1
  "Implements nontrivial exercises from the first chapter of SICP")

(defn ex-1-3
  "Returns the sum of the squares of the two greatest arguments"
  [a b c]
  (let [square #(* % %)
        two-greatest (take 2 (reverse (sort [a b c])))]
    (reduce + (map square two-greatest))))
