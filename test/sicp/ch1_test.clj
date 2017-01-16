(ns sicp.ch1-test
  (:require [clojure.test :refer :all]
            [sicp.ch1 :refer :all]))

(deftest ex-1-3-test
  (testing "With positive numbers"
    (is (= (ex-1-3 1 1 1) 2))
    (is (= (ex-1-3 1 2 3) 13))
    (is (= (ex-1-3 2 1 3) 13))
    (is (= (ex-1-3 2 3 1) 13))
    (is (= (ex-1-3 1 3 2) 13)))
  (testing "With 0"
    (is (= (ex-1-3 0 0 0) 0)))
  (testing "With negative numbers"
    (is (= (ex-1-3 -1 0 0) 0))
    (is (= (ex-1-3 -1 -1 -1) 2))
    (is (= (ex-1-3 -1 -2 -3) 5))
    (is (= (ex-1-3 -2 -1 -3) 5))
    (is (= (ex-1-3 -2 -3 -1) 5))
    (is (= (ex-1-3 -1 -3 -2) 5))))
