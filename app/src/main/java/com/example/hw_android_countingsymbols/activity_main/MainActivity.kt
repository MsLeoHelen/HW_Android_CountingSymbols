package com.example.hw_android_countingsymbols.activity_main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.hw_android_countingsymbols.R
import com.example.hw_android_countingsymbols.activity_text.TextActivity
import com.example.hw_android_countingsymbols.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainViewModel = ViewModelProviders.of(this)
            .get(MainViewModel::class.java)

        DataBindingUtil.setContentView<ActivityMainBinding>(
            this, R.layout.activity_main
        ).apply {
            this.setLifecycleOwner(this@MainActivity)
            this.viewmodel = mainViewModel
        }

        mainViewModel.editTextContent.observe(this, Observer {
            mainViewModel.changeCurrentText()
        })

        imageView.setOnClickListener {
            openTextActivity()
        }
    }

    fun openTextActivity() {
        val text = editText.text.toString()
        val newIntent = Intent(this, TextActivity::class.java)
        startActivity(newIntent.putExtra("TEXT_STRING", text))
    }
}
