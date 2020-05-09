package com.example.cursokotlin.collection

fun main() {
    val listaAlunos = arrayListOf("Amanda", "Bernardo", "Felipe", "Cristiane")
    //forEach sinples
    listaAlunos.forEach { println(it) }

    //forEach com outra funcao encadeada
    listaAlunos.forEach { println(it.toUpperCase())}
}

