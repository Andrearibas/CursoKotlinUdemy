package com.example.cursokotlin.classes

class Filme2(val nome: String, val anoDeLancamento: Int, val genero: String)

fun main() {
    val filme2 = Filme2("Monstros S.A", 2001, "Comédia")
    println("A ${filme2.genero} ${filme2.nome} foi lançada em ${filme2.anoDeLancamento}.")
}

