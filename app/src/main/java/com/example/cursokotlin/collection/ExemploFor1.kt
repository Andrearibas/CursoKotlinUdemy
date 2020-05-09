package com.example.cursokotlin.collection

fun main() {
    val listAlunos = arrayListOf("Andre", "Bernardo", "Carlos", "Jose")
    //Usando o for simples
    for (alunos in listAlunos){
        println(alunos)
    }

    //Usando o destructury para percorrer a lista
    for ((indice, nome) in listAlunos.withIndex()){
        println("${indice + 1} - $nome")
    }
}

