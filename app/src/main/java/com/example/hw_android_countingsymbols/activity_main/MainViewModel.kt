package com.example.hw_android_countingsymbols.activity_main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw_android_countingsymbols.addEndOfWord

class MainViewModel : ViewModel() {

    private val _currentText = MutableLiveData<String>()
    val currentText: LiveData<String>
        get() = _currentText

    val editTextContent = MutableLiveData<String>()


    init {
        _currentText.value = countingSymbols()
    }

    fun countingSymbols(): String {
        val num = if (editTextContent.value != null)
            editTextContent.value.toString().length
        else 0
        return "Вы ввели $num символ" + addEndOfWord(num)
    }

    fun changeCurrentText() {
        _currentText.value = countingSymbols()
    }
}