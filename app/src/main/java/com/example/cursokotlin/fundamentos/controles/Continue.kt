package com.example.cursokotlin.fundamentos.controles

fun main() {
    for (i in 1..10){
        if (i == 5){
            continue // Faz com que a repetiçao pule a condição do if e continua a execuçao do for
        }
        println("Atual : $i")
    }
}