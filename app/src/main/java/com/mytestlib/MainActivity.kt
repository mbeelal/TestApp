package com.mytestlib

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val data: Uri? = intent?.data


        if (data == null) {
            ToastHelper.openUrl(this)
        } else {
            val code = data.getQueryParameters("code").first()
            Log.d("DapperOAuth : ", code)
        }

        finish()
    }
}
