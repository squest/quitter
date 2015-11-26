(ns alfa.pages.frontend.probleminput
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(defn input-problem
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

          (components/has-side-panel directory rec-learning)

          [:section {:id "content"}
           [:div {:class "content-wrap", :style "padding-top: 40px; padding-bottom: 20px;"}                    ;[:div {:class "container clear-bottommargin clearfix"} [:div {:class "row clearfix"}]]

            [:div {:class "col-md-2 bottommargin"}
             (components/open-sider "Recommen" "button-yellow button-light")
             (components/open-sider "Recommended learning" "button-yellow button-light")
             [:a {:class "button button-light button-bright-yellow", :href "#"}
              [:span "RECOMMENDED LEARNING"]]]

            [:div {:class "col-md-10 bottommargin"}
             (components/open-sider "Recommen" "button-yellow button-light")
             [:div {:class "col-md-11 bottommargin"}
              "YEAH"]
             [:div {:class "col-md-1 bottommargin"}
              [:br "NO"]]]]]]



         "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
         [:script {:src "../js/functions.js", :type "text/javascript"}]])))

