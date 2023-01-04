package com.example.demo.Utils

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.CountDownTimer
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.demo.R
import com.google.android.material.snackbar.Snackbar

object Commom {
    private var dialog: Dialog? = null

    /*Show messages*/
    fun getToast(activity: Activity, value: String) {
        Toast.makeText(activity, value, Toast.LENGTH_SHORT).show()
    }

    /*Show messages*/
    fun getSnackBar(activity: Activity, value: String) {
        val snack =
            Snackbar.make(activity.findViewById(android.R.id.content), value, Snackbar.LENGTH_LONG)
        snack.show()
    }

    /*Loading__Screen*/
    fun showLoadingProgress(context: Context) {
        if (dialog != null) {
            dialog!!.dismiss()
            dialog = null
        }
        dialog = Dialog(context)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog!!.setContentView(R.layout.custom_loading_bar)
        dialog!!.setCancelable(false)
        dialog!!.show()
    }

    fun dismissLoadingProgress() {
        if (dialog != null && dialog!!.isShowing) {
            dialog!!.dismiss()
            dialog = null
        }
    }
}