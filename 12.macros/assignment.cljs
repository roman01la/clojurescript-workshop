;; Develop a faster `mapv` implementation
;; by creating a macro `fast-mapv` which expands to `loop`

;; test
(fast-mapv inc [1 2 3]) ;; [2 3 4]
