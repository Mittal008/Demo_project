package com.example.demo.Utils

interface SharedPref {

    //    For String
    fun put(Key: String, value: String)
    operator fun get(Key: String, value: String): String?

    //    For Int
    fun put(Key: String, value: Int)
    operator fun get(Key: String, value: Int): Int?

    //    For Boolean
    fun put(Key: String, value: Boolean)
    operator fun get(Key: String, value: Boolean): Boolean?

    //    For Float
    fun put(Key: String, value: Float)
    operator fun get(Key: String, value: Float): Float?
}