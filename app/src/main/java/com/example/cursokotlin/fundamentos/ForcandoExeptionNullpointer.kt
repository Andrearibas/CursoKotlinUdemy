package com.example.cursokotlin.fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc())

    println("Momento do Erro....")
    println(a!!.inc())
}