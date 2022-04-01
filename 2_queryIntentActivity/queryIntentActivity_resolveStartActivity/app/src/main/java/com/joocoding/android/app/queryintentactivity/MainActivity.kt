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
        /*val intent = Intent("hyejin.intent.action.TEST")
        intent.addCategory(Intent.CATEGORY_DEFAULT)
        val info: ResolveInfo? = packageManager.resolveActivity(intent, 0)
        val list1: List<ResolveInfo> = packageManager.queryIntentActivities(intent,0)
        for (i in list1.indices) {
            Log.d(TAG,"1) query $i= ${list1[i]}")
        }
        Log.d(TAG, "1) : " + info)

        val intent2 = Intent("hyejin.intent.action.TEST")
        intent2.addCategory(Intent.CATEGORY_DEFAULT)
        intent2.addCategory(Intent.CATEGORY_APP_BROWSER)
        val list2: List<ResolveInfo> = packageManager.queryIntentActivities(intent2,0)
        for (i in list2.indices) {
            Log.d(TAG,"2)query $i= ${list2[i]}")
        }
        val info2: ResolveInfo? = packageManager.resolveActivity(intent2, 0)
        Log.d(TAG, "2) : " + info2)
        startActivity(intent2)
*/
        val intent3 = Intent("hyejin.intent.action.TEST")
        intent3.addCategory(Intent.CATEGORY_DEFAULT)
        intent3.addCategory(Intent.CATEGORY_APP_BROWSER)
        intent3.addCategory(Intent.CATEGORY_APP_CALCULATOR)

        val list3: List<ResolveInfo> = packageManager.queryIntentActivities(intent3,0)
        for (i in list3.indices) {
            Log.d(TAG,"3)query $i= ${list3[i]}")
        }
        val info3: ResolveInfo? = packageManager.resolveActivity(intent3, 0)
        Log.d(TAG, "3) : " + info3)
        startActivity(intent3)

    }

    companion object{
        private val TAG = "MainActivity"
    }
}