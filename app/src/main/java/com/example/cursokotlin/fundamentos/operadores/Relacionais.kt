package com.example.cursokotlin.fundamentos.operadores

import java.util.*

fun main() {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val dia1 = Date(0)
    val dia2 = Date(0)

    //Igualdade referencial = Compara o registro da instancia (falso)
    println("Resultado com '===' ${dia1 === dia2}")

    //Igualdade estrutural = Compara o conteudo das duas datas (Verdadeiro)
    println("Resultado com '==' ${dia1 == dia2}")
    println("Resultado com '==' ${dia1.equals(dia2)}")
}