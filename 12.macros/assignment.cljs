;; Create `fast-mapv` macro which expands to `loop`
;; which performs mapping as usual `mapv` functions

;; test
(fast-mapv inc [1 2 3]) ;; [2 3 4]
