package com.example.hw_android_countingsymbols.activity_text

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_android_countingsymbols.R
import kotlinx.android.synthetic.main.activity_text.*

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        val activityIntent = intent

        text.text = activityIntent.getStringExtra("TEXT_STRING")

    }
}