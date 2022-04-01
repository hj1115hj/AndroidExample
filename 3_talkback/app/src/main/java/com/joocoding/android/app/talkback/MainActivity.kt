package com.joocoding.android.app.talkback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private val onBtnClickListener = View.OnClickListener {
        Log.i(TAG, "onClick()")
    }
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val crimePhotoImageView = findViewById<ImageView>(R.id.crime_photo)
        //crimePhotoImageView.setOnClickListener(onBtnClickListener)
    }

    companion object{
        const val TAG = "MainActivity"

    }

}