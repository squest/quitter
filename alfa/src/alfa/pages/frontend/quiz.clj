(ns alfa.pages.frontend.quiz
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(def prob-image
  [:div {:class "widget clearfix", :id "flickr"}
   [:div {:data-lightbox "gallery", :data-type "group", :data-count "16", :data-id "613394@N22", :class "flickr-feed masonry-thumbs", :id "flickr-widget"}]])

(def prob-question
  [:div {:class "widget subscribe-widget clearfix", :id "subscriber"}
   [:h5 "This is where you ask the questions. And below are the options. For example, what is the colour of your nail?"]])

(def prob-option
  [:ul {:style "max-width: 300px;", :class "nav nav-pills nav-stacked"}
   [:li [:a {:href "#"} "Red"]]
   [:li [:a {:href "#"} "Blue"]]
   [:li [:a {:href "#"} "Yellow"]]
   [:li {:class "active"} [:a {:href "#"} "Black"]]
   [:li [:a {:href "#"} "Sorry I'm colour blind"]]])

(def problem
  [:div {:class "widget clearfix", :id "text"}
   [:h3 {:class "highlight-me"} "Title of Problem"]
   prob-image
   [:div {:class "line"}]
   prob-question
   [:div {:class "line"}]
   prob-option])

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
               [:li [:a {:href ""}
                 [:div "Physics"]]]
               [:li [:a {:href ""}
                 [:div "Biology"]]]
               [:li [:a {:href ""}
                 [:div "English"]]]
               [:li [:a {:href ""}
                 [:div "History"]]]]]]

            [:div {:class "col-md-9 bottommargin"}
             problem]]]]



          "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
          [:script {:src "../js/functions.js", :type "text/javascript"}]])))
