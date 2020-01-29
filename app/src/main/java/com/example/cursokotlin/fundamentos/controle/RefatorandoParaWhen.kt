package com.example.cursokotlin.fundamentos.controle

fun main() {
    val nota = 9

    when(nota){
        10,9 -> println("Fantastico.")
        8,7 -> println("Parabens.")
        6,5,4 -> println("Tem como recuperar.")
        in 0..3 -> println("Te vejo no proximo semestre.")
        else -> println("Nota inválida.")
    }
}