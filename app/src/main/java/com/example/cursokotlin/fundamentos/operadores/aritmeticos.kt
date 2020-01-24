package com.example.cursokotlin.fundamentos.operadores

fun main() {

    //Operadores Aritmeticos
    val (v1, v2, v3, v4) = listOf(3,5,1,15)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v4 / v1
    val multiplicacao = v1 * v2
    val modulo = v1 % 2

    println(soma)
    println(subtracao)
    println(divisao)
    println(multiplicacao)
    println(modulo)

}