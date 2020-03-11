package com.example.cursokotlin.fundamentos

fun somaComRetorno(a: Int, b: Int = 2): Int {
    return a + b
}

fun main() {
    println(somaComRetorno(5,7))
    println(somaComRetorno(5))
}