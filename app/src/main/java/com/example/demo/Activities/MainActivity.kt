@file:Suppress("DEPRECATION")

package com.example.demo.Activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(Runnable {
            val i = Intent(this@MainActivity, Boarding::class.java)
            startActivity(i)
            finish()
        }, 2000)



    }
}