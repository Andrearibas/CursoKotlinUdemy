package com.example.cursokotlin.fundamentos

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    println(soma(10))
    println(soma(5,3))
}