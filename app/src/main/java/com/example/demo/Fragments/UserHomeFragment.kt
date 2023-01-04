package com.example.demo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demo.Activities.User.HomeUser
import com.example.demo.R
import com.example.demo.databinding.FragmentUserHomeBinding

class UserHomeFragment : Fragment() {
    lateinit var mBinding:FragmentUserHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        mBinding= FragmentUserHomeBinding.inflate(inflater, container, false)

        (requireActivity() as HomeUser).mBinding.imgEdit.visibility=View.INVISIBLE
        (requireActivity() as HomeUser).mBinding.btnSave.visibility=View.INVISIBLE
        (requireActivity() as HomeUser).mBinding.bottomBar.visibility = View.VISIBLE


        return mBinding.root
    }
}