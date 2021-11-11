package com.example.pokemon.mvp

interface MainInterface {

    interface View {
        fun showResultSum(result: Int)
    }

    interface Presenter {
        fun sumNumbers(a: Int, b: Int)
    }
}