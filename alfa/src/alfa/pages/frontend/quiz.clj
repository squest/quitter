(ns alfa.pages.frontend.quiz
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(defn do-quiz
  ([] (hp/html5
        [:html {:lang "en-US", :dir "ltr"}
         [:head
          components/links
          components/style
          components/javascript]

         [:body {:class "stretched"}
          [:div {:class "clearfix", :id "wrapper"}
           components/header-user]

          "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
          [:script {:src "../js/functions.js", :type "text/javascript"}]]])))
