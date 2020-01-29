package com.example.cursokotlin.fundamentos.controle

fun main() {
    var opcao: Int = 0

    // Estrutura de repetição sem quantidade determinada.
    while (opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao .")
    }

    println("Até a proxima")
}