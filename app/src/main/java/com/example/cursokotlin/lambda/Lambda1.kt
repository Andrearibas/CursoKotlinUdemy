package com.example.cursokotlin.lambda

fun main() {
    //Lembrando que a ultima linha de codigo que será retornado
    var soma = {x: Int, y: Int -> x + y}

    println(soma(45, 5))
}

