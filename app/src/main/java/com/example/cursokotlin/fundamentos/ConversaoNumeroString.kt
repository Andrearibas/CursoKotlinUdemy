package com.example.cursokotlin.fundamentos

fun main() {
    var a = 1

    // Convertendo numero para String
    println(a.toString())

    //Convertendo String para Número
    println("1.9".toDouble() + 3)
    println("Texto".toIntOrNull())
    println("Texto".toIntOrNull() ?: 0)
    println("1".toInt() + 3)
}