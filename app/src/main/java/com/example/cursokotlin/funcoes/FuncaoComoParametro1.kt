package com.example.cursokotlin.funcoes

class Operacoes(){
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int {
    return funcao(a,b)
}

fun main() {
    //Chamando o metodo da Classe Operacoes
    println(calc(2,3, Operacoes()::somar))

    //Chamando o metodo top level
    println(calc(2,3, ::somar))
}

