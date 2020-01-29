package com.example.cursokotlin.fundamentos.controle

fun main() {
    val nota: Double = 3.5

    //usando operador range ..  (intervalo entre dois numeros)
    if (nota in 9..10){
        println("Fantastico.")
    }else if (nota in 7..8){
        println("Parabéns")
    }else if (nota in 4..6){
        println("Tem como recuperar.")
    }else if (nota in 0..3){
        println("Te vejo no proximo semesstre.")
    }else {
        println("Nota inválida")
    }


}