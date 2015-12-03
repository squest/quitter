(ns alfa.pages.frontend.components
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]))

(def links
  (list [:meta {:content "text/html; charset=utf-8", :http-equiv "content-type"}]
        [:meta {:content "SemiColonWeb", :name "author"}]))

(def style
  (list [:link {:type "text/css", :rel "stylesheet", :href "http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700|Roboto:300,400,500,700"}]
        [:link {:type "text/css", :href "../css/bootstrap.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "../style.css", :rel "stylesheet"}]

        [:link {:type "text/css", :href "../css/dark.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "../css/font-icons.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "css/et-line.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "../css/animate.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "../css/magnific-popup.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "css/fonts.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "../css/responsive.css", :rel "stylesheet"}]
        [:meta {:content "width=device-width, initial-scale=1", :name "viewport"}]

        "<!-- One Page Module Specific Stylesheet -->"
        [:link {:type "text/css", :href "onepage.css", :rel "stylesheet"}]

        "<!--[if lt IE 9]>
        <script src=\"http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js\"></script>"))

(def javascript
  (list [:script {:src "../js/jquery.js", :type "text/javascript"}]
        [:script {:src "../js/plugins.js", :type "text/javascript"}]))

(def logo-header
  [:div {:id "logo"}
   [:a {:data-dark-logo "images/performance.png", :class "standard-logo", :href "index.html"}
    [:img {:src "images/performance.png"}]]])

(def navigation-header
  [:nav {:id "primary-menu"}
   [:ul {:class "one-page-menu"}
    [:li {:class "current"} [:a {:data-href "#section-home", :href "#"}
                             [:div "Home"]]]
    [:li [:a {:data-href "#section-features", :href "#"}
          [:div "Directory"]]]
    [:li [:a {:data-href "#section-pricing", :href "#"}
          [:div "Profile"]]]]
   [:div {:id "top-search"}
    [:a {:id "top-search-trigger", :href "#"}
     [:i {:class "icon-search3"}]
     [:i {:class "icon-line-cross"}]]
    [:form {:method "get", :action "search.html"}
     [:input {:type "text", :placeholder "Type & Hit Enter..", :class "form-control", :name "q"}]]]])

(def header-user
  [:header {:data-sticky-offset "0", :class "full-header static-sticky", :id "header"}
   [:div {:id "header-wrap"}
    [:div {:class "container clearfix"}
     [:div {:id "primary-menu-trigger"}
      [:i {:class "icon-reorder"}]]

     logo-header
     navigation-header]]])

(defn has-side-panel [& content]
  (list [:div {:class "body-overlay"}]
        [:div {:class "dark", :id "side-panel"}
         [:div {:class "side-panel-trigger", :id "side-panel-trigger-close"}
          [:a {:href "#"} [:i {:class "icon-line-cross"}]]]
         [:div {:class "side-panel-wrap"}
          content]]))


(defn open-sider [name icon & button-style]
  [:section {:id "content"}
   [:div {:class "container"}
    [:a {:class (str "button button-rounded side-panel-trigger button-reveal" " " (first button-style)), :href "#"}
     [:i {:class icon}]
     [:span name]]]])

