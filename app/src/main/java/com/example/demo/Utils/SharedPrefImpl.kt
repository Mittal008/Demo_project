package com.example.demo.Utils

import android.content.SharedPreferences

class SharedPrefImpl(private var sharedPreferences:SharedPreferences):SharedPref {


    /*Return String Value*/
    override fun put(Key: String, value: String) {
       sharedPreferences.edit().putString(SharedPrefKey.USER_NAME,"").apply()
    }
    override fun get(Key: String, value: String): String? {
        return sharedPreferences.getString(SharedPrefKey.USER_NAME," ")
    }

    /*Return Int Value*/
    override fun put(Key: String, value: Int) {
    }
    override fun get(Key: String, value: Int): Int? {
        TODO("Not yet implemented")
    }

    /*Return Float Value*/
    override fun put(Key: String, value: Float) {
        TODO("Not yet implemented")
    }
    override fun get(Key: String, value: Float): Float? {
        TODO("Not yet implemented")
    }

    /*Return Boolean Value*/
    override fun put(Key: String, value: Boolean) {
        TODO("Not yet implemented")
    }
    override fun get(Key: String, value: Boolean): Boolean? {
        TODO("Not yet implemented")
    }


}