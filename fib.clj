(defn fib
  ([] (concat [0 1] (fib 0 1)))
  ([a b] (lazy-cons (+ a b) (fib b (+ a b)))))

(println (take 20 (fib)))