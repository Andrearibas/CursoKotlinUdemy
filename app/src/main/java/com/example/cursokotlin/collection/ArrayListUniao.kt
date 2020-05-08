package com.example.cursokotlin.collection

fun main() {
    val numeros = arrayListOf(1,2,3,4,5)
    val nomes = arrayListOf("Pedro", "Jose", "Maria")
    val uniao = numeros + nomes // utilizando sobrecarga de operadores

    for (item in uniao){
        println(item)
    }
}