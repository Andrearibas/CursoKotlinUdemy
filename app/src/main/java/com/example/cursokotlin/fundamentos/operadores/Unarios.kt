package com.example.cursokotlin.fundamentos.operadores

fun main() {
    var num1: Int = 1
    var num2: Int = 2

    //Incremento
    num1++
    println("O num1 agora é: $num1")

    //Decremento
    --num1
    println("O num1 agora é: $num1")

    // Cuidado para usar essa expressão, pois o pré-fixado tem precedência
    // e a comparaão vem antes do pos-fixado, resultado será falso.
    println(++num1 == num2--)
}