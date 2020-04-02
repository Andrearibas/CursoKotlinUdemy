package com.example.cursokotlin.funcoes

fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this.get(1) else null

fun main() {
    val list = listOf("João", "Maria", "José")

    println(list.secondOrNull())
}

// Foi criado um metodo na classe List, sendo possivel estender para utiliza-la em suas instancias

