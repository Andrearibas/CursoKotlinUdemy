package com.example.cursokotlin.funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main() {
    val prod1 = Produto("Ipad", 1300.00)
    val prod2 = Produto(preco = 450.00, nome = "Borracha")
    println(prod1 maisCaroQue prod2)
}

