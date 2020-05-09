package com.example.cursokotlin.collection

data class Fruta(val nome: String, val preco: Double)

fun main() {
    val listaFrutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 1.90))

    for(frutas in listaFrutas){
        println("${frutas.nome} - R$ ${frutas.preco}")
    }
}

