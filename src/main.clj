(ns main
    (:use [ask.routes :only [app]]
          [org.httpkit.server :only [run-server]]))

(defonce server (atom nil))

(defn -main [& args]
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (reset! server (run-server #'app {:port port}))
    (println "Running server on port" port)))
