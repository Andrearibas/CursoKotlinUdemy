package com.example.cursokotlin.oo.heranca

fun main() {
    val carro = Ferrari()
    carro.acelerar() // +25
    println(carro) // A velocidade atual é 25 km/h.

    carro.ligarTurbo()
    carro.acelerar() // +50
    println(carro) // A velocidade atual é 75 km/h.

    carro.frear() // -25
    carro.frear() // -25
    println(carro) // A velocidade atual é 25 km/h.
}


