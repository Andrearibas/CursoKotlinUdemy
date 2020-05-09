package com.example.cursokotlin.avancado

import java.lang.IllegalArgumentException

fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num -1)
    else -> throw IllegalArgumentException ("Numero Negativo")
}

fun main() {
    println("O Resultado é ${fatorial(8)}")
}

