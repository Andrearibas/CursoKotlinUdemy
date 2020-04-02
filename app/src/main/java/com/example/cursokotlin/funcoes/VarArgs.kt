package com.example.cursokotlin.funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(38,3,456,8,33, 1, 51, 43)){
        println("$n")
    }
}

