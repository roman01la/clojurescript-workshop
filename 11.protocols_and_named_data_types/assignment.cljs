;; Develop Clojure's data to JSON converter
;; which handles strings, numbers, booleans, keywords and vectors
;; using protocols

;; test
(to-json [:keyword "string" 1 true false [:nested [:vector]]])
;; "[\"keyword\", \"string\", 1, true, false, [\"nested\", [\"vector\"]]]"
