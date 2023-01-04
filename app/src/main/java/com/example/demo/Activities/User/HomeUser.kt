package com.example.demo.Activities.User


import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.demo.Fragments.UserHomeFragment
import com.example.demo.Fragments.UserInfoFragment
import com.example.demo.Fragments.UserProfileFragment
import com.example.demo.R
import com.example.demo.databinding.ActivityHomeUserBinding


class HomeUser : AppCompatActivity(), View.OnClickListener {
    lateinit var mBinding: ActivityHomeUserBinding

    lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeUserBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        callFragment(UserHomeFragment())
        onClickFunctionality()

    }

    private fun onClickFunctionality() {
        mBinding.home.setOnClickListener(this)
        mBinding.notification.setOnClickListener(this)
        mBinding.profile.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.home -> {
                changeHeadingText("Dashboard")
                callFragment(UserHomeFragment())
            }
            R.id.notification -> {
                changeHeadingText("Information")
                callFragment(UserInfoFragment())
            }
            R.id.profile -> {
                changeHeadingText("Profile")
                callFragment(UserProfileFragment())
            }
        }
    }



    //    Fragments Calling
    private fun callFragment(fragment: Fragment) {
        var fragManger: FragmentManager = supportFragmentManager
        fragManger.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.user_frame_layout, fragment, null)
            .commit()
    }

    //    Change Home Page Text (DashBoard)
    private fun changeHeadingText(textName: String) {
        mBinding.heading.text = textName
    }

    //  Change Icon Color i.e Current Position
    private fun changeCurrentIconColor(iconColor: Color) {

    }


}