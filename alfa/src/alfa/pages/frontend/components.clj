(ns alfa.pages.frontend.components
  (:require
    [hiccup.core :as hc]
    [hiccup.page :as hp]))

(def links
  (list [:meta {:content "text/html; charset=utf-8", :http-equiv "content-type"}]
        [:meta {:content "SemiColonWeb", :name "author"}]))

(def style
  (list [:link {:type "text/css", :rel "stylesheet", :href "http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic"}]
        [:link {:type "text/css", :href "css/bootstrap.css", :rel "stylesheet"}]
        [:link {:type "text/css", :href "style.css", :rel "stylesheet"}]
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
        "<!-- / -->"

        "<!--[if lt IE 9]>
        <script src=\"http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js\"></script>
        <![endif]-->"))

(def javascript
  (list [:script {:src "../js/jquery.js", :type "text/javascript"}]
        [:script {:src "../js/plugins.js", :type "text/javascript"}]))

(def logo-header
  [:div {:id "logo"}
   [:a {:data-dark-logo "images/performance.png", :class "standard-logo", :href "index.html"}
    [:img {:alt "Canvas Logo", :src "images/ZPlogo.png"}]]])

(def navigation-header
  [:nav {:id "primary-menu"}
   [:ul {:class "one-page-menu"}
    [:li {:class "current"} [:a {:data-href "#section-home", :href "#"}
                             [:div "Home"]]]
    [:li [:a {:data-href "#section-features", :href "#"}
          [:div "Directory"]]]
    [:li [:a {:data-href "#section-pricing", :href "#"}
          [:div "Profile"]]]]])

(def header-user
  [:header {:data-sticky-offset "0", :data-sticky-class "not-dark", :class "full-header dark transparent-header static-sticky", :id "header"}
   [:div {:id "header-wrap"}
    [:div {:class "container clearfix"}
     [:div {:id "primary-menu-trigger"}
      [:i {:class "icon-reorder"}]]

     logo-header
     navigation-header]]])

(def head
  [:nav {:id "primary-menu"}
   [:ul {:class "one-page-menu"}
    [:li {:class "current"} [:a {:data-href "#section-home", :href "#"}
                             [:div "Home"]]]
    [:li [:a {:data-href "#section-features", :href "#"}
          [:div "Directory"]]]
    [:li [:a {:data-href "#section-pricing", :href "#"}
          [:div "Profile"]]]]])