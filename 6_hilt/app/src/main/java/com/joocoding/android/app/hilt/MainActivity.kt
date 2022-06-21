package com.joocoding.android.app.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// Hilt가 해당 클래스에 Depenency를 제공해 줄 수 있는 Component생성해 줍니다.
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analytics: AnalyticsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}