package com.example.cursokotlin.fundamentos.controle

fun main() {

    //Navegando dentro de uma lista com indice/ posição
    val listaDeAlunos = arrayListOf("Andrea", "Maria", "Lorena", "Gil", "Mario", "Adriano", "Anderson")
    for ((indice, aluno) in listaDeAlunos.withIndex()){
        println("${indice+1} - $aluno")
    }
    
}