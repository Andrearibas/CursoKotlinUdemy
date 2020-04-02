package com.example.cursokotlin.funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinardo(a) à $chefe"
}

fun main() {
    println(relacaoDeTrabalho("João", "Maria"))

    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria"))
}