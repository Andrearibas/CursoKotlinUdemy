package com.example.cursokotlin.fundamentos

fun main() {
    val a: Int = 33.dec()
    var b: String = a.toString()

    println("Int: é $a")
    println("O primeiro char da String é ${b.first()}")
}