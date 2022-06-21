package com.joocoding.android.app.talkback

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.KeyEventDispatcher

class MainActivity : AppCompatActivity() {
    private val onBtnClickListener = View.OnClickListener {
        Log.i(TAG, "onClick()")
    }

    private val nextTestClickListener = View.OnClickListener {
        startActivity(Intent(this,MainActivity2::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextTestButton = findViewById<Button>(R.id.next_test)
        nextTestButton.setOnClickListener(nextTestClickListener)
        val crimePhotoImageView = findViewById<ImageView>(R.id.crime_photo)

        //crimePhotoImageView.setOnClickListener(onBtnClickListener)
    }

    companion object {
        const val TAG = "MainActivity"

    }

}