(ns app.components.base ;; <-- one-to-one mapping between a namespace name
                        ;;     and the path of the file with respect to source root
  (:require [app.app-utils :as autils] ;; import * as autils from "app/app_utils"
            [app.components.button :refer [button]] ;; import { button } from "app/components/button"
            [my.macros :refer-macros [somem]] ;; ClojureScript <1.8
            [my.macros :refer [somem]]) ;; ClojureScript 1.9>
  (:require-macros [my.macros :as my])) ;; ClojureScript <1.8
