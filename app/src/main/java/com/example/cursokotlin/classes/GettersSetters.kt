package com.example.cursokotlin.classes

class Cliente2{
    constructor(nome: String){
        this.nome = nome
    }

    var nome: String
        //field é o valor atribuido a variavel
        get() = "Meu nome é ${field}"
        // takeif é a logica se é (verdadeiro) caso contrario é nulo
        set(value){
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main() {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("Pedro")
    println(c2.nome)

    c2.nome = "Ana"
    println(c2.nome)
}

