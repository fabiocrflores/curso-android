package com.example.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.pokemon.mvp.MainInterface
import com.example.pokemon.mvp.MainPresenter
import com.example.pokemon.mvvm.MainViewModel

class MainActivity : AppCompatActivity(), MainInterface.View {

    private lateinit var textTexto: TextView

//    private lateinit var mainPresenter: MainPresenter
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTexto = findViewById(R.id.tv_text)

//        mainPresenter = MainPresenter(this)
        mainViewModel = MainViewModel()

//        mainPresenter.sumNumbers(2, 2)

        setupObserver()
        mainViewModel.sumNumbers(2,2)

        Thread.sleep(10000)

        mainViewModel.sumNumbers(5,5)
    }

    override fun showResultSum(result: Int) {
        textTexto.text = "Resultado da soma $result"
    }

    private fun setupObserver() {
        mainViewModel.sumResult.observe(this) { result ->
            textTexto.text = "Resultado da soma $result"
        }
    }
}