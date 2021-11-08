package com.example.pokemon.mvp

class MainPresenter(private val mainView: MainInterface.View): MainInterface.Presenter {

    override fun checkHasError(number: Int) {
        if (number > 1) {
            mainView.showMessage()
        }
    }

    override fun sumNumbers(a: Int, b: Int) {
        val result = a + b
        mainView.showResultSum(result)
    }

    override fun fetchCharacters() {
        val characters = mutableListOf("Homem Aranha", "Thor")
        mainView.loadCharacters(characters)
    }
}