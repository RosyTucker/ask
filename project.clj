(defproject ask "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :main main
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.9"]
                 [http-kit "2.1.5"]
                 [de.ubercode.clostache/clostache "1.4.0"]]
  :dev-dependencies [[javax.servlet/servlet-api "2.5"]
                     [ring-mock "0.1.5"]
                     [midje "1.6.3" :exclusions [org.clojure/clojure]]
                     [lein-midje "1.0.10"]]
  :profiles { :production {:dependencies [[javax.servlet/servlet-api "2.5"]]}})
