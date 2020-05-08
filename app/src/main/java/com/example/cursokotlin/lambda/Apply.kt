package com.example.cursokotlin.lambda

class Calculadora2{
    var resultado = 0

    fun soma(valor1: Int, valor2: Int){
        resultado += valor1 + valor2
    }

    fun add(valor: Int){
        resultado += valor
    }
}

fun main() {
    val calculadora = Calculadora2()
    //Utilizando o apply em uma unica linha encadeando outras funcoes
    calculadora.apply { soma(5,3) }.apply { add(5) }.apply { println(resultado) }

    //Utilizando o apply de outra forma, abrindo o bloco
    calculadora.apply {
        soma(5,3)
        add(5)
        println(resultado)
    }
    // Funçao Inline = Parecida com o exemplo acima
    with(calculadora){
        soma(5,3)
        add(5)
        println(resultado)
    }
}
