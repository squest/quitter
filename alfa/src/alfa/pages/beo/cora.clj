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
    [:link {:href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" :rel "stylesheet"}]]]
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
        [:a {:href "https://en.wikipedia.org/wiki/God_is_dead"} "Siapa?"]]
       [:li
        [:a {:href "https://en.wikipedia.org/wiki/%C3%9Cbermensch"} "Dia?"]]
       [:li
        [:a {:href "#"} "Di mana?"]]]]]]
   [:div {:class "container"}
    [:header {:class "jumbotron hero-spacer"}
     [:h1 {:align "middle"} "Zoroaster"]
     [:p {:align "middle" :style "font-size:17px"}
      [:q "O man, take care!"
       [:br]
       "What does the deep midnight declare?"
       [:br]
       "I was asleep--"
       [:br]
       "From a deep dream I woke and swear:—"
       [:br]
       "The world is deep,"
       [:br]
       "Deeper than day had been aware"
       [:br]
       "Deep is its woe"
       [:br]
       "Joy-- Deeper yet than agony"
       [:br]
       "Woe implores: Go!!"
       [:br]
       "but all joy wants eternity--"
       [:br]
       "Wants deep, Wants deep eternity"]]
     [:hr]]
    ]])

(defn form
  []
  [:form
   [:input {:type "radio" :name "fuck" :value "peler"} "Male"]
   [:br]
   [:input {:type "radio" :name "fuck" :value "meke"} "Female"]])

(defn form1
  []
  [:form {:class "form-horizontal" :role "form"}
   [:div {:class "form-group"}
    [:label {:class "control-label col-sm-2" :for "email"} "Enter your E-fucking-mail:"] [:br]
    [:div {:class " col-sm-10"}]
    [:input {:type "email" :class "form-control" :id "email" :placeholder "Enter Motherfucker"}]]])
(defn home
  []
  (html (head)
        (body)
        (form1)))