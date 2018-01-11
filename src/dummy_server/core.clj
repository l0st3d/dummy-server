(ns dummy-server.core
  (:gen-class)
  (:require [clojure.repl :refer :all]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.params :refer [wrap-params]]
            [ring.adapter.jetty :as jetty]))

(defn response []
  {:status 200
   :body "success"
   :headers {"Content-Type" "text/plain"}})

(defroutes handler
  (ANY "/"          []   (response))
  (route/not-found "Page not found"))

(def app
  (wrap-defaults handler (assoc site-defaults :security false)))

(defn start-server []
  (jetty/run-jetty app {:port 8080}))

(defn -main [& args]
  (start-server))
