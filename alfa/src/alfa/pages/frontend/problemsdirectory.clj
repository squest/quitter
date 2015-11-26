(ns alfa.pages.frontend.problemsdirectory
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(defn prob-directory
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
           [:div {:class "content-wrap"}]]]

         "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
         [:script {:src "../js/functions.js", :type "text/javascript"}]])))
