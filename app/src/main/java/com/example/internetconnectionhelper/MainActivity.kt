package com.example.internetconnectionhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (NetworkHelper.hasInternetConnection(this)){
            // Have internet connection make something
        }else{
            // No Have internet connection make something
        }
    }
}