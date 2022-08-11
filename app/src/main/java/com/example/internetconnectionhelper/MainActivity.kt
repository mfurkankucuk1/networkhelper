package com.example.internetconnectionhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (NetworkHelper.hasInternetConnection(this)){
            // there is an internet connection do something
        }else{
            // no Internet connection do something
        }


    }
}