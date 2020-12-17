# Nolein

Nolein is an example of creating a multi-project with Clojure Tools.

Use of deps and aliases means any function in any library can be a CLI
operation provided the function has an arity that accepts a single map argument.

Available commands (examples):
* clj -X:help
* clj -X:install
* clj -X:test
* clj -X:set-config :key value
* clj -X:get-config :key
* clj -X:configuration > config.edn
* clj -X:check-config
* clj -X:docker build
* clj -X:docker publish
* clj -X:docker deploy :to :marathon
* clj -X:docker deploy :to hostname
* clj -X:docker deploy :to :local
* clj -X:login
* clj -X:logout
* clj -X:users
* clj -X:roles
* clj -X:report :report ccdc-1.1-campaign-status :location s3://bucket/name.csv
* clj -X:http-start :resource :all
* clj -X:http-start :resource :load-balancer
* clj -X:http-start :resource :auth
* clj -X:http-start :resource :hsm
* clj -X:http-start :resource :iwds
* clj -X:http-start :resource /iwds :methods [GET,POST] :fn iwds/http-handler :port 8888
* clj -X:http-stop
* clj -X:http-resources
* clj -X:run :component :something
* clj -X:tiles :grid :ard
* clj -X:tile-to-xy :tile 012003
* clj -X:xy-to-tile :x 1 :y 2
* clj -X:chips :grid :ard :tile 012003 > 012003-chips.edn
* clj -X:download-metadata > metadata.csv
* clj -X:search-metadata :tile 013002
* clj -X:search-inventory :tile 013002
* clj -X:ingest :tile 013002
* clj -X:timeseries :x 1 :y 2 :acquired 1982/2020 :profile :ard > x1_y2_1982_2020_ard.edn
* clj -X:detect :x 1 :y 2 :acquired 1982/2020 :cutoff 2018-01-01 :use-previous_results true
* clj -X:train-xgbooster
* clj -X:classify
* clj -X:change-products
* clj -X:cover-products
* clj -X:raster
* clj -X:bundle
* clj -X:campaign :type :ccdc :version 1.1

