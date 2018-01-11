(defproject dummy-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring "1.6.3"]
                 [ring/ring-defaults "0.3.1"]
                 [compojure "1.4.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler dummy-server.core/app}
  :profiles {:uberjar {:aot :all}}
  :main dummy-server.core)
