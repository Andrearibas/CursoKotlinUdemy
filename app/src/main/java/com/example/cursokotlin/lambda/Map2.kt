package com.example.cursokotlin.lambda

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
        Produto("Fichario Esolar", 32.45),
        Produto("Lapis", 8.50),
        Produto("Regua", 3.20),
        Produto("Apontador", 1.80),
        Produto("Borracha", 0.95)
)

fun main() {
    val totalizador = {total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizador)

    println("O preço médio dos produtos é R$ ${precoTotal / materialEscolar.size}")
}

