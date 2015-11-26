(ns alfa.pages.frontend.quiz
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(def prob-image
  [:div {:class "entry-image"}
   [:a {:href "#"}
    [:img {:alt "Image", :src "images/Banana.jpg"}]]])

(def prob-question
  [:div {:class "widget subscribe-widget clearfix", :id "subscriber"}
   [:h5 "This is where you ask the questions. And below are the options. For example, what is the colour of your nail?"]])

(def prob-option
  [:ul {:class "nav nav-pills nav-stacked"}
   [:li [:a {:href "#"} "Red"]]
   [:li [:a {:href "#"} "Blue"]]
   [:li [:a {:href "#"} "Yellow"]]
   [:li {:class "active"} [:a {:href "#"} "Black"]]
   [:li [:a {:href "#"} "Sorry I'm colour blind"]]])

(def problem
  [:div {:class "widget clearfix", :id "text"}
   [:h3 {:class "highlight-me"} "Title of Problem"]
   [:div {:class "col-md-12"}
    [:div {:class "col-md-5"} prob-image]
    [:div {:class "col-md-7"} prob-question]]
   [:div {:class "col-md-12"} prob-option]])

(def social
  [:div {:class "widget quick-contact-widget clearfix", :id "s-icons"}
   [:a {:title "Facebook", :class "social-icon si-colored si-facebook", :href "#"}
    [:i {:class "icon-facebook"}] [:i {:class "icon-facebook"}]]
   [:a {:title "Twitter", :class "social-icon si-colored si-twitter", :href "#"}
    [:i {:class "icon-twitter"}] [:i {:class "icon-twitter"}]]
   [:a {:title "Github", :class "social-icon si-colored si-github", :href "#"}
    [:i {:class "icon-github"}] [:i {:class "icon-github"}]]
   [:a {:title "Google Plus", :class "social-icon si-colored si-gplus", :href "#"}
    [:i {:class "icon-gplus"}] [:i {:class "icon-gplus"}]]
   [:a {:title "Instagram", :class "social-icon si-colored si-instagram", :href "#"}
    [:i {:class "icon-instagram"}] [:i {:class "icon-instagram"}]]])

(defn do-quiz
  ([] (hp/html5
        [:html {:lang "en-US", :dir "ltr"}
         [:head
          components/links
          components/style
          components/javascript]

         [:body {:class "stretched"}
          [:div {:class "clearfix", :id "wrapper"}
           components/header-user
           [:title "Quiz | Quitter"]]

          [:section {:id "content"}
           [:div {:class "content-wrap"}                    ;[:div {:class "container clear-bottommargin clearfix"} [:div {:class "row clearfix"}]]

            [:div {:class "col-md-3 bottommargin"}
             [:div {:class "widget widget_links clearfix", :id "shortcodes"}
              [:h4 {:class "highlight-me"} "Problems Directory"]
              [:ul
               [:li [:a {:href "problems.html"}
                 [:div "Math"]]]
               [:li [:a {:href "#"}
                 [:div "Physics"]]]
               [:li [:a {:href "#"}
                 [:div "Biology"]]]
               [:li [:a {:href "#"}
                 [:div "English"]]]
               [:li [:a {:href "#"}
                 [:div "History"]]]]]]

            [:div {:class "col-md-9 bottommargin"}
             [:div {:class "col-md-11 bottommargin"}
              problem]
             [:div {:class "col-md-1 bottommargin"}
              [:br social]]]]]]



          "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
          [:script {:src "../js/functions.js", :type "text/javascript"}]])))
