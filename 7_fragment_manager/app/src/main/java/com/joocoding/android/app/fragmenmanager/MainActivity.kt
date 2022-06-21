package com.joocoding.android.app.fragmenmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate: ")
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            val fragmentTransition : FragmentTransaction =
                supportFragmentManager.beginTransaction()
            fragmentTransition
                .add(R.id.fragment_container, FirstFragment())
                .add(R.id.fragment_container, SecondFragment())
                .commit()

        }
    }


    companion object{
        const val TAG = "MainActivity"
    }
}