package com.example.demo.Fragments

import android.content.SharedPreferences
import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.demo.Activities.User.HomeUser
import com.example.demo.R
import com.example.demo.Utils.SharedPrefImpl
import com.example.demo.databinding.FragmentUserProfileBinding


class UserProfileFragment : Fragment(), View.OnClickListener {

    lateinit var mBinding: FragmentUserProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentUserProfileBinding.inflate(inflater, container, false)

        (requireActivity() as HomeUser).mBinding.imgEdit.visibility = View.VISIBLE



        onClickFunctionality()
        return mBinding.root
    }

    private fun onClickFunctionality() {
        (requireActivity() as HomeUser).mBinding.imgEdit.setOnClickListener(this)
        (requireActivity() as HomeUser).mBinding.btnSave.setOnClickListener(this)
        (requireActivity() as HomeUser).mBinding.iconBack.setOnClickListener(this)
        mBinding.btnLogout.setOnClickListener(this)

    }


    override fun onClick(view: View) {
        when (view.id) {
            R.id.img_edit -> {
                mBinding.layoutEditMode.visibility = View.VISIBLE
                mBinding.layoutNormalMode.visibility = View.GONE
                (requireActivity() as HomeUser).mBinding.imgEdit.visibility = View.GONE
                (requireActivity() as HomeUser).mBinding.btnSave.visibility = View.VISIBLE
                (requireActivity() as HomeUser).mBinding.bottomBar.visibility = View.GONE

            }
            R.id.btnSave -> {

            }
            R.id.icon_back -> {
                activity?.onBackPressed()
            }

        }
    }

}