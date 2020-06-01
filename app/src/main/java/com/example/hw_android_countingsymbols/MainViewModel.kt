package com.example.hw_android_countingsymbols

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _currentText = MutableLiveData<String>()
    val currentText: LiveData<String>
        get() = _currentText

    fun onChangeRandomFruitClick() = changeCurrentText()

    val editTextContent = MutableLiveData<String>()


    init {
        _currentText.value = "Вы ничего не ввели"
    }

    fun countingSymbols(): String{
        return "Вы что-то ввели"
    }

    fun changeCurrentText() {
        _currentText.value = countingSymbols()
    }

}