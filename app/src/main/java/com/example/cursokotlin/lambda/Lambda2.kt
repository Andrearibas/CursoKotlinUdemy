package com.example.cursokotlin.lambda

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicar: Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    // Funcao para calcular uma soma
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }
    //  Funcao para calcular uma operacao tipo por exemplo Multiplicar
    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a,b)
    }
    // Funcao usando Lambda
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main() {
    val calculadora = Calculadora()

    val resultado1 = calculadora.calcular(2,3)
    val resultado2 = calculadora.calcular(2,3, Multiplicar())

    println("Resultado 1 = $resultado1")
    println("Resultado 2 = $resultado2")

    //Usando a Lambda
    val subtracao = {a: Int, b: Int -> a - b}
    val resultado3 = calculadora.calcular(2,3, subtracao)
    println("Resultado 3 = $resultado3")
}

