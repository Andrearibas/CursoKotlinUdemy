package com.example.cursokotlin.fundamentos.controles

fun main() {
    var opcao: Int = -1

    println("Digite um numero:")

    //Essa funçao executa primeiro o bloco para poder consultar a expressão(parametros)
    do{
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    }while (opcao != -1)
    println("Até a proxima!")
}