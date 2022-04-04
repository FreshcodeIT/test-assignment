(ns freshcode.core-test
  (:require
    [clojure.test :refer [deftest testing is]]
    [freshcode.core :as sut]))


(deftest square-test
  (testing "dummy test"
    (is (= 4 (sut/square 2)))))
