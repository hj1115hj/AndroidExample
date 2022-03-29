package com.joocoding.android.app.queryintentactivity

import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent("hyejin.intent.action.TEST")
        intent.addCategory(Intent.CATEGORY_DEFAULT)
        val info: ResolveInfo? = packageManager.resolveActivity(intent, 0)
        Log.d(TAG, "1) : " + info)

        val intent2 = Intent("hyejin.intent.action.TEST")
        intent2.addCategory(Intent.CATEGORY_DEFAULT)
        intent2.addCategory(Intent.CATEGORY_APP_BROWSER)
        val list: List<ResolveInfo> = packageManager.queryIntentActivities(intent2,0)
        for (i in list.indices) {
            Log.d(TAG,"2) query $i= ${list[i]}")
        }
        val info2: ResolveInfo? = packageManager.resolveActivity(intent2, 0)
        Log.d(TAG, "2) : " + info2)
        //startActivity(intent2)

        val intent3 = Intent("hyejin.intent.action.TEST")
        intent3.addCategory(Intent.CATEGORY_DEFAULT)
        intent3.addCategory(Intent.CATEGORY_APP_BROWSER)
        intent3.addCategory(Intent.CATEGORY_APP_CONTACTS)
        val info3: ResolveInfo? = packageManager.resolveActivity(intent3, 0)
        Log.d(TAG, "3) : " + info3)
        startActivity(intent3)

    }

    companion object{
        private val TAG = "MainActivity"
    }
}