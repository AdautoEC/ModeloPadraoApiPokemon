package com.adauto.storage.dao

import android.content.SharedPreferences

open class BaseDAO(sharedPreferences: SharedPreferences) {
    protected val edit: SharedPreferences.Editor = sharedPreferences.edit()
}