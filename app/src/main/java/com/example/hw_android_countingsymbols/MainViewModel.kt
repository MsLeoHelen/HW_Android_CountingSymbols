package com.example.hw_android_countingsymbols

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val currentText: LiveData<String>
        get() = FakeRepository.currentText

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentText()

    val editTextContent = MutableLiveData<String>()

}