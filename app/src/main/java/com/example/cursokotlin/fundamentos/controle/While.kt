package com.example.cursokotlin.fundamentos.controle

fun main() {
    var opcao: Int = 0

    println("Digite um numero para opçao:")

    // Estrutura de repetição sem quantidade determinada.
    while (opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao .")
    }
    println("Até a proxima")
}