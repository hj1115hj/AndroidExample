package com.joocoding.android.app.newinstance

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BActivity : AppCompatActivity(){
    private lateinit var button: Button
    private val onBtnClickListener = View.OnClickListener {
        Log.d(TAG,"onClick()")
        startNewIntent()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"onCreate")
        setContentView(R.layout.b_activity)
        button = findViewById(R.id.button)
        button.setOnClickListener(onBtnClickListener)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.i(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
    }

    private fun startNewIntent(){
        Log.i(TAG,"startNewIntent()")
        val intent = Intent(this,BActivity::class.java)
        intent.putExtra("test","new intent")
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        val result = intent?.getStringExtra(EXTRA_ON_NEW_INTENT_MODE) ?: null
        Log.i(TAG,"onNewIntent= intent: $result")
    }
    companion object{
        const val TAG = "BActivity"
        const val EXTRA_ON_NEW_INTENT_MODE = "test"
    }

}

