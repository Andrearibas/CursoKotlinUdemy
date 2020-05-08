package com.example.cursokotlin.classes

//Erro!! Kotlin: Val (constante) não pode ser reatribuida
//fun porReferencia(velocidade: Int){
//    velocidade++
//}

data class Carro(var carro: String, var marca: String, var velocidade: Int = 3)

fun porReferencia(carro: Carro){
    carro.velocidade++
}

fun main() {
    var carro1 = Carro("Ford", "Fusion")

    var carro2 = carro1
    carro2.marca = "GM"
    println(carro1)

    carro1 = Carro("Audi", "A4")
    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++
    println(a === b)
    println(a)
    println(b)
}