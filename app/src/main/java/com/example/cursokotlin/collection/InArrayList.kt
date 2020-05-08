package com.example.cursokotlin.collection

fun main() {
    val pares = arrayListOf(2,4,6)
    val impares = intArrayOf(1,3,6)

    for (num in impares.union(pares).sorted()){
        print("$num ")
    }
}

