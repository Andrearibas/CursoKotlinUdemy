package com.example.cursokotlin.fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    //Operador destructuring: tira alguma coisa de dentro de uma estrututa (Lista, Objeto, etc...)
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca  $modelo")

    val (marido, mulher) = listOf("Joao", "Maria")
    println("$marido  $mulher")

    val (_,_, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar")
}