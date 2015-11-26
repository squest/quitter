(ns alfa.alltest
  (:require
    [clojure.test :refer :all]))

(deftest test-test
  (testing "Some unimportant feature"
    (is (= 2 (+ 1 1)))
    (is (= [1,2,3] (range 1 4)))))

(defn all [f]
  (test-test))

(use-fixtures :once all)


