(ns alfa.pages.frontend.probleminput
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(def directory
  )

(def rec-learning
  [:div {:class "widget clearfix", :id "w-video"}
   [:h4 {:class "highlight-me"} "Recommended Learning"]
   [:iframe {:width "500", :height "250", :src "http://player.vimeo.com/video/103927232"}]]
  ;{:href "#"}
  )

(def this-page-has-side-panel
  (list [:div {:class "body-overlay"}]
        [:div {:class "dark", :id "side-panel"}
         [:div {:class "side-panel-trigger", :id "side-panel-trigger-close"}
          [:a {:href "#"} [:i {:class "icon-line-cross"}]]]
         [:div {:class "side-panel-wrap"}
          [:div {:class "widget clearfix"}
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
               [:li [:a {:href "#"} "FAQs"]]]] ]]]

          rec-learning]]))

(defn open-sider [name]
  [:section {:id "content"}
   [:div {:class "content-wrap"}
    [:div {:class "container clearfix"}
     [:div {:class "center"}
      [:a {:class "button button-xlarge button-rounded side-panel-trigger bottommargin", :href "#"} name]]]]])

(defn input-problem
  ([] (hp/html5
        [:html {:lang "en-US", :dir "ltr"}
         [:head
          components/links
          components/style
          components/javascript]

         [:body {:class "stretched side-panel-left"}

          this-page-has-side-panel

          [:div {:class "clearfix", :id "wrapper"}
           components/header-user
           [:title "Quiz | Quitter"]]

          (open-sider "Recommen")

          [:section {:id "content"}
           [:div {:class "content-wrap", :style "padding-top: 40px; padding-bottom: 20px;"}                    ;[:div {:class "container clear-bottommargin clearfix"} [:div {:class "row clearfix"}]]

            [:div {:class "col-md-2 bottommargin"}
             [:div {:class "widget widget_links clearfix", :id "shortcodes"}

              ]]

            [:div {:class "col-md-10 bottommargin"}
             [:div {:class "col-md-11 bottommargin"}
              "YEAH"]
             [:div {:class "col-md-1 bottommargin"}
              [:br "NO"]]]]]]



         "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
         [:script {:src "../js/functions.js", :type "text/javascript"}]])))

