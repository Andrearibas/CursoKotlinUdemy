package com.example.cursokotlin.fundamentos.controle

fun main() {
    val num1: Int = 2
    val num2: Int = 5

    val maiorValor = if (num1 > num2){
        println("Processando if...")
        num1
    }else {
        println("Processando else")
        num2
    }
     println("O maior valor é $maiorValor .")


    //Usando if como expressão/estrutura no valor (logica simplificada)
    val maiorValor2 = if (num1>num2) num1 else num2
    println("O maior valor2 é $maiorValor2")

    val menorValor = if(num1<num2) num1 else num2
    println("O menor valor é $menorValor")
}