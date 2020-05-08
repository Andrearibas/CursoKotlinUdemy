package com.example.cursokotlin.lambda

fun main() {
    val alunos = arrayListOf("Andrea", "Lorena", "Gilliard", "Maria", "Jose")

    //Lista de alunos, tranformadas em letras maisculas, ordenadas por nome e imprimir no tela
    alunos.map { it.toUpperCase() }.sortedBy { it }.apply { println(this) }
}

