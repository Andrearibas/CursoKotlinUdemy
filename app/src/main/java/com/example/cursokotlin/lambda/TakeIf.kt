package com.example.cursokotlin.lambda

fun main() {
    println("Digite uma mensagem:")

    val entrada = readLine()

    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem Mensagem"

    println(mensagem)
}

