(ns alfa.applogic.user
  (:require [schema.core :as s]
            [datomic.api :as d]))

;;User Schema

(def AddUser
  "Schema for user to sign-up"
  {:username s/Str
   :email    s/Str
   :password s/Str
   :cingcong s/Str})

(defn add-user!
  "Add user... duh!!"
  [dbconn user-map])

(defn set-user!
  "To change user profile"
  [])

(defn set-password!
  "To change user password"
  [])

(defn valid-user?
  "Probably for login stuff"
  [])