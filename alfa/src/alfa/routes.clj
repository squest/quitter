(ns alfa.routes
  (:require [com.stuartsierra.component :as component]
            [io.pedestal.http :as bootstrap]
            [io.pedestal.http.route :as route]
            [io.pedestal.http.body-params :as body-params]
            [io.pedestal.http.route.definition :refer [defroutes expand-routes]]
            [io.pedestal.interceptor :refer [interceptor]]
            [io.pedestal.http.ring-middlewares :as middlewares]
            [io.pedestal.test :as ptest]
            [io.pedestal.http.csrf :as csrf]
            [ring.util.response :as ring-resp]
            [alfa.pages.frontend.landing :as planding]
            [alfa.pages.frontend.quiz :as pquiz]
            [alfa.pages.frontend.probleminput :as pprobin]
            [alfa.pages.frontend.problemsdirectory :as pprobdir]))


;; (def nuthin
;;   (interceptor
;;    {:name ::nuthin
;;     :enter (fn [ctx]
;;              (assoc ctx :response (handle-dump ctx)))}))

;; (def sumthin
;;   (interceptor
;;    {:name ::sumthin
;;     :enter (fn [ctx] (assoc ctx :response (handle-dump ctx)))}))

(def interctx
  (interceptor
   {:name ::interctx
    :enter (fn [ctx]
             (assoc ctx :response
                    (ring-resp/response (str ctx))))}))
(def intereq
  (interceptor
   {:name ::intereq
    :enter (fn [ctx]
             (assoc ctx :response
                    (ring-resp/response (str (:request ctx)))))}))

(def hello
  (interceptor
   {:name ::hello
    :enter (fn [ctx]
             (assoc ctx :response
                    (ring-resp/response (str "hello world"))))}))

(def page-home
  (interceptor
   {:name ::page-home
    :enter (fn [ctx]
             (assoc ctx :response
                    (-> (ring-resp/response (planding/home))
                        (ring-resp/content-type "text/html; charset=utf-8"))))}))

(def page-problem-input
  (interceptor
   {:name ::page-problem-input
    :enter (fn [ctx]
             (assoc ctx :response
                    (-> (ring-resp/response (pprobin/input-problem))
                        (ring-resp/content-type "text/html; charset=utf-8"))))}))

(def page-problems-directory
  (interceptor
   {:name ::page-problems-directory
    :enter (fn [ctx]
             (assoc ctx :response
                    (-> (ring-resp/response (pprobdir/prob-directory))
                        (ring-resp/content-type "text/html; charset=utf-8"))))}))

(def page-quiz
  (interceptor
   {:name ::page-quiz
    :enter (fn [ctx]
             (assoc ctx :response
                    (-> (ring-resp/response (pquiz/do-quiz))
                        (ring-resp/content-type "text/html; charset=utf-8"))))}))

(defn routes
  []
  ;; Defines "/" and "/about" routes with their associated :get handlers.
  ;; The interceptors defined after the verb map (e.g., {:get home-page}
  ;; apply to / and its children (/about).
  [[["/"
     ^:interceptors [(csrf/anti-forgery)
                     (body-params/body-params)
                     (middlewares/params)]
     {:get page-home}
     ["/problem-input" {:get page-problem-input}]
     ["/problems-directory" {:get page-problems-directory}]
     ["/a" {:any intereq}]            
     ["/ctx" {:any interctx}]
     ["/quiz" {:get page-quiz}]]
]])

;; #_(defn hello-world [req] {:status 200 :body "Hello World!"})
;; #_(defn macaca [req]
;;   {:status 200 :body "ratata"})

;; #_(def route-table
;;   (expand-routes '[[["/" ^:interceptors
;;                      [(csrf/anti-forgery)
;;                       (body-params/body-params)
;;                       (middlewares/params)
;;                       nuthin]
;;                      {:any macaca}
;;                      ["/hello-world" {:any hello-world}]]]]))

(defn make-routes
  []
  (expand-routes (routes)))

(defrecord RoutesMap [routes mail]
  component/Lifecycle
  (start [this]
    (let [routes (make-routes)]
      (assoc this :routes routes)))
  (stop [component]
    (dissoc component :routes)))

(defn make-routes-map
  []
  (map->RoutesMap {}))
