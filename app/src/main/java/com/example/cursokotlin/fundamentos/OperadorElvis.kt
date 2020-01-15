package com.example.cursokotlin.fundamentos

fun main() {
    val opcional: String? = null
    val obrigatoria: String = opcional ?: "Valor padrão"

    println(obrigatoria)
}