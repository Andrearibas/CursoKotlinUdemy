package com.example.cursokotlin.fundamentos.controles

fun main() {
    for (i in 1..10){
        if (i == 5){
            break // O break interrompe o processo, saindo da estrutura de repetiçao
        }
        println("Atual é: $i")
    }
    println("Fim")
}