package com.example.pokemon.mvvm

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    lateinit var sumResult: MutableLiveData<Int>

    fun sumNumbers(a: Int, b: Int) {
        val result = a + b
        sumResult.value = result
    }

}