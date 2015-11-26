(ns alfa.pages.frontend.quiz
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(def directory
  [:div {:class "widget widget_links clearfix", :id "shortcodes"}
   [:h4 "Problems Directory"]
   [:nav {:class "nav-tree nobottommargin"}
    [:ul
     [:li [:a {:href "#"} [:i {:class "icon-bolt2"}] "Features"]
      [:ul
       [:li [:a {:href "#"} "Sliders"]]
       [:li [:a {:href "#"} "Widgets"]]
       [:li [:a {:href "#"} "Events"]]
       [:li [:a {:href "#"} "Headers"]]]]
     [:li [:a {:href "#"} [:i {:class "icon-briefcase"}] "Portfolio"]
      [:ul
       [:li [:a {:href "#"} "Grid"]
        [:ul
         [:li [:a {:href "#"} "3 Columns"]]
         [:li [:a {:href "#"} "4 Columns"]]
         [:li [:a {:href "#"} "5 Columns"]]]]
       [:li [:a {:href "#"} "Masonry"]]
       [:li [:a {:href "#"} "Loading Styles"]]
       [:li [:a {:href "#"} "Single"]]]]
     [:li [:a {:href "#"} [:i {:class "icon-file-text"}] "About"]
      [:ul
       [:li [:a {:href "#"} "Company"]]
       [:li [:a {:href "#"} "Team"]]
       [:li [:a {:href "#"} "Services"]]
       [:li [:a {:href "#"} "FAQs"]]]] ]]])

(def rec-learning
  [:div {:class "widget clearfix", :id "w-video"}
   [:h4 {:class "highlight-me"} "Recommended Learning"]
   [:iframe {:width "500", :height "250", :src "http://player.vimeo.com/video/103927232"}]])

(def prob-title
  [:div {:class "entry-content"}
   [:h2 {:class "highlight-me"} "Title of Problem"]])

(def prob-image
  [:div {:class "entry-image"}
   [:a {:href "#"}
    [:img {:alt "Image", :src "images/Banana.jpg"}]]])

(def prob-question
  [:div {:class "entry-content"}
   [:p "This is where you ask the questions. And below are the options. For example, what is the colour of your nail?
   Not of the banana, but your nail."]])

(def prob-option
  [:ul {:class "nav nav-pills nav-stacked"}
   [:li [:a {:href "#"} "Red"]]
   [:li [:a {:href "#"} "Blue"]]
   [:li [:a {:href "#"} "Yellow"]]
   [:li {:class "active"} [:a {:href "#"} "Black"]]
   [:li [:a {:href "#"} "Sorry I'm colour blind"]]])

(def problem
  [:div {:class "widget clearfix", :id "text"}
   prob-title
   [:div {:class "col-md-12"}
    [:div {:class "col-md-5"} prob-image]
    [:div {:class "col-md-7"} prob-question]]
   [:div {:class "col-md-12"}
    [:form {:class "notopmargin nobottommargin", :role "form", :action "#"}
     prob-option
     [:span {:class "input-group-btn topmargin center"}
      [:button {:type "submit", :class "button button-small button-dark button-rounded", :href "#"}
       [:i {:class "icon-ok-right"}] "Submit answer"]]
     [:div {:class "center"}
      [:a {:class "button button-rounded button-3d button-large button-reveal button-large button-light button-bright-yellow tright", :href "#"}
       [:i {:class "icon-signal"}]
       [:span "RECOMMENDED LEARNING"]]]]]])

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

         [:body {:class "stretched side-panel-left"}

          [:div {:class "clearfix", :id "wrapper"}
           components/header-user
           [:title "Quiz | Quitter"]]

          (components/has-side-panel rec-learning directory )

          [:section {:id "content"}
           [:div {:class "content-wrap", :style "padding-top: 40px; padding-bottom: 20px;"}                    ;[:div {:class "container clear-bottommargin clearfix"} [:div {:class "row clearfix"}]]

            [:div {:class "col-md-2 bottommargin"}
             (components/open-sider "Recommended learning" "icon-signal" "button-yellow button-light button-mini")
             (components/open-sider "Directory" "" "button-leaf button-light button-mini")

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

            [:div {:class "col-md-10 bottommargin"}
             [:div {:class "col-md-11 bottommargin"}
              problem]
             [:div {:class "col-md-1 bottommargin"}
              [:br social]]]]]]

         "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
         [:script {:src "../js/functions.js", :type "text/javascript"}]])))
