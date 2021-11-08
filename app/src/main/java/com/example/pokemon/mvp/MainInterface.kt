package com.example.pokemon.mvp

interface MainInterface {

    interface View {
        fun showMessage()
        fun showResultSum(result: Int)
        fun loadCharacters(characters: List<String>)
    }

    interface Presenter {
        fun checkHasError(number: Int)
        fun sumNumbers(a: Int, b: Int)
        fun fetchCharacters()
    }
}