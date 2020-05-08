package com.example.cursokotlin.lambda

data class Casa(var endereco: String = "", var num: Int = 0 )

fun main() {
    val casa = Casa()

    casa.run {
        endereco = "Rua ABC"
        num = 42
    }
    println(casa)
}

