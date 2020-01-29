package com.example.cursokotlin.fundamentos.controle

fun main() {
    //Estrutura de repetição for com intervalo = crecente
    for (i in 0..100 step 5){
        println(i)
    }

    //Estrutura de repetição for com intervalo = decrecente
    for (i in 100 downTo 0 step 5){
        println(i)
    }
}