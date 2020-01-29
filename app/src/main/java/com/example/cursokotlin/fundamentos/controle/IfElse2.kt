package com.example.cursokotlin.fundamentos.controle

fun main() {
    val num1: Int = 7
    val num2: Int = 10

    //Usando if como expressão/estrutura no valor (logica completa)
    val maiorValor = if(num1 > num2){
        println("Processando if...")
        num1
    }else {
        println("Processando else...")
        num2
    }
    println("O maior valor é $maiorValor .")

    //Usando if como expressão/estrutura no valor (logica simplificada)
    val menorValor = if(num1<num2) num1 else num2
    println("O menor valor é $menorValor")
}