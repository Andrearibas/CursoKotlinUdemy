package com.example.cursokotlin.collection

fun main() {
    val map = hashMapOf(1 to "Andrea", 2 to "Lorena", 3 to "Maria")

    for ((id, nome) in map){
        println("ID: $id - Nome: $nome")
    }
}

