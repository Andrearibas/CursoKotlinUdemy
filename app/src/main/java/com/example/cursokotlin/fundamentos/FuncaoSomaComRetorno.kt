package com.example.cursokotlin.fundamentos

fun soma(a: Int, b: Int = 2): Int {
    return a + b
}

fun main() {
    println(soma(5,7))
    println(soma(5))
}