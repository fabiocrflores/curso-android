package com.example.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.pokemon.mvp.MainInterface
import com.example.pokemon.mvp.MainPresenter

class MainActivity : AppCompatActivity(), MainInterface.View {

    private lateinit var textTexto: TextView

    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTexto = findViewById(R.id.tv_text)

        mainPresenter = MainPresenter(this)

//        mustShowError()
        mainPresenter.sumNumbers(2, 2)
    }

    override fun showMessage() {
        Toast.makeText(this, "Erro exibido", Toast.LENGTH_LONG).show()
    }

    override fun showResultSum(result: Int) {
        textTexto.text = "Resultado da soma $result"
    }

    override fun loadCharacters(characters: List<String>) {
        Toast.makeText(this, characters.toString(), Toast.LENGTH_LONG).show()
    }

    private fun mustShowError() {
        mainPresenter.checkHasError(2)
    }
}