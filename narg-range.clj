(defn narg-range
  "Named argument version of range, :b begin :e end :s step.
  Defaults are :b 0 :e infinity :s 1. All parameters are optional."
  [& {:keys [b e s]
    :or {b 0 e Double/POSITIVE_INFINITY s 1}}]
  (range b e s))
