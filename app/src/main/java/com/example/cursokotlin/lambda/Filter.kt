package com.example.cursokotlin.lambda

data class Aluno (val nome: String, val nota: Double)

fun main() {
    val listAlunos = arrayListOf(
            Aluno("Andrea", 8.9),
            Aluno("Fernando", 3.4),
            Aluno("Maria", 9.2),
            Aluno("Jose", 5.6),
            Aluno("Jeferson", 7.1)
    )

    //Ordenando a lista de aprovados com nota maior e igual a 7.0 por ordem alfabetica nome
    val aprovados = listAlunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    println(aprovados)
}
