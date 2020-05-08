package com.example.cursokotlin.collection

fun main() {
    // Na arrayList nao precisa informar qual o tipo, pois já é inferida por causa do valor
    val strings = arrayListOf("Carro", "Moto", "Barco", "Aviao")

    for (item in strings){
        println(item.toUpperCase())
    }
}

