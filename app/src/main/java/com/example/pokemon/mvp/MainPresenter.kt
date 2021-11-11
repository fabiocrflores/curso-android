package com.example.pokemon.mvp

class MainPresenter(private val mainView: MainInterface.View): MainInterface.Presenter {

    override fun sumNumbers(a: Int, b: Int) {
        val result = a + b
        mainView.showResultSum(result)
    }
}