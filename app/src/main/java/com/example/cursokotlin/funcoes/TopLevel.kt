package com.example.cursokotlin.funcoes

fun min(valorA: Int, valorB: Int): Int = if (valorA < valorB) valorA else valorB

fun main() {
    println("O valor menor é ${min(4,5)}")
}