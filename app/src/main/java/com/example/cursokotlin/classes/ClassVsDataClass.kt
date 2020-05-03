package com.example.cursokotlin.classes

//A diferença entre as duas classes é que a dataClass é centrada em dados
//com varias funcionalidades
class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca:String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) // equals

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2) // equals
    println(tv1 === tv2)
    println(tv1.toString()) // toString
    println(tv1.copy()) // copy = Copia da constante para ai sim alterar seu valor
    println(tv1.copy(polegadas = 42))

    //Destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol")
}