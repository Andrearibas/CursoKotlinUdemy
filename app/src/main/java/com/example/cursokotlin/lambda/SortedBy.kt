package com.example.cursokotlin.lambda

fun main() {
    val nomes = arrayListOf("Carlos","Jose","Fernanda", "Andrea", "Maria", "Lorena")
    //Ordena a lista de nome em ordem alfabetica
    val ordenados = nomes.sortedBy { it }

    println(ordenados)
}
