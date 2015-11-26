(ns alfa.pages.beo.cora
    (:require [hiccup.core :refer :all]))

(defn head
  []
  [:html
   [:head
    [:meta {:content "IE=edge"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1 "}]
    [:meta {:charset "utf-8"}]
    [:title "Stupilomogo"]

    ;;CSS
    [:link {:href "css\\bootstrap.css" :rel "stylesheet"}]]]
  )

(defn body
  []
  [:body
   [:nav {:class "navbar navbar-inverse navbar-fixed-top" :role "navigation"}
    [:div {:class "container"}
     [:div {:class "navbar-header"}
      [:button {:type "navbar-toggle" :data-toggle "collapse" :data-target "#bs-example-navbar-collapse-1"}
       [:span {:class "sr-only"} "Toggle Navigation"]
       [:span {:class "icon-bar"} ]
       [:span {:class "icon-bar"} ]
       [:span {:class "icon-bar"} ]]
      [:a {:class "navbar-brand" :href "#"} "Romantika Sabda Zarathusra"]]
     [:div {:class "collapse navbar-collapse" :id "bs-example-navbar-collapse-1"}
      [:ul {:class "nav navbar-nav"}
       [:li
        [:a {:href "#"} "Apa?"]]
       [:li
        [:a {:href "#"} "Siapa?"]]
       [:li
        [:a {:href "#"} "Dia?"]]
       [:li
        [:a {:href "#"} "Di mana?"]]]]]]
   [:div {:class "container"}
    [:header {:class "jumbotron hero-spacer"}
     [:h1 "Salahumba"]
     [:p "sangat disayangkan hidup dalam sanubari kelam yang tak dapat dipungkiri tentang kebenaran yang ilmiah"
      [:br "Kemoche"]]]
    [:hr ]
    [:form
     [:p "Ngentot sama siape :"]
     [:input]
     [:p "anjing"]
     [:textarea {:rows 10 :cols 40}]
     ]]])

(defn home
  []
  (html (head)
        (body)))