package com.example.demo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demo.R
import com.example.demo.databinding.FragmentAdminProfileBinding

class AdminProfile : Fragment() {

lateinit var mBinding:FragmentAdminProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        mBinding= FragmentAdminProfileBinding.inflate(inflater, container, false)


        return mBinding.root
    }
}