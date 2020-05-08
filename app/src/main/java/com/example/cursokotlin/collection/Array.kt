package com.example.cursokotlin.collection

fun main() {
    val numeros = Array<Int>(10) {i -> i * 10}

    for(num in numeros){
        println(num)
    }
    //Get retornar o valor do indice
    println(numeros.get(1))
    println(numeros[1])

    //Set edita o valor do indice
    numeros.set(1,345)
    numeros[2] = 456
    println(numeros[1])
    println(numeros[2])
}

