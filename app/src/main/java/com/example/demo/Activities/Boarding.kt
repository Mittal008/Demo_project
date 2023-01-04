package com.example.demo.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demo.R
import com.example.demo.databinding.ActivityBoardingBinding

class Boarding : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnAction()


    }

    private fun btnAction() {
        binding.btnContinue.setOnClickListener(this)
        binding.tvLogin.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.btnContinue->{
//                var intent = Intent(this@Boarding, Login::class.java)
//                startActivity(intent)
            } R.id.tvLogin->{
                var intent = Intent(this@Boarding, Login::class.java)
                startActivity(intent)
            }
        }

    }
}