(ns alfa.pages.frontend.quiz
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]
    [alfa.pages.frontend.components :as components]))

(def prob-navigation

  )

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
           [:div {:class "content-wrap"}]                   ;[:div {:class "container clear-bottommargin clearfix"} [:div {:class "row clearfix"}]]
           ]]


         [:section {:id "content"} "\n\n\t\t"
          :div {:class "content-wrap"} "\n\n\t\t\t"
          ]

          "<!-- Footer Scripts\n\t============================================= -->" "\n\t"
          [:script {:src "../js/functions.js", :type "text/javascript"}]])))
