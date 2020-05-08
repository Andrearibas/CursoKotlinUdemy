package com.example.cursokotlin.classes

var desconto = 0.0

class ItemDePedido(val nome: String, val preco: Double) {
    companion object{
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        //@JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV 50 Polegadas", 2549.99)
    val item2 = ItemDePedido("Liquidificador", 349.50)
    desconto = 0.50

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}