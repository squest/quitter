(ns alfa.applogic.core
  (:require [schema.core :as s]))

;;Dummy schema

(def UserFull
  "Schema for full user-map query"
  {:username s/Str
   :password s/Str})

(def AddUser
  "Schema for user to sign-up"
  {:username s/Str
   :password s/Str})

(def SetUser
  "Schema for user to update profile"
  {:username s/Str})

;;Feel free to change things