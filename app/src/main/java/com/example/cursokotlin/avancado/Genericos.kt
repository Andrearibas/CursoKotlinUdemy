package com.example.cursokotlin.avancado

class Caixa<T> (val objeto: T){
    private val objetos = ArrayList<T>()

    init{
        adicionar(objeto)
    }

    fun adicionar(objeto: T){
        objetos.add(objeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar = Caixa("Caderno")
    materialEscolar.adicionar("Lapis")
    materialEscolar.adicionar("Borracha")
    materialEscolar.adicionar("Apontador")
    println(materialEscolar)

    val numeros = Caixa(objeto = 1)
    numeros.adicionar(3)
    println(numeros)
}

