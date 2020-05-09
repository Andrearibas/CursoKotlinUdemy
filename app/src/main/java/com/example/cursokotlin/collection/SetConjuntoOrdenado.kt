package com.example.cursokotlin.collection

fun main() {
    val listaAprovados = hashSetOf("João", "Pedro", "Maria", "Ana", "Joana")
    //listaAprovados.add(1) Erro pois a lista é do tipo String
    println("Sem Ordem...")
    listaAprovados.forEach({alunos -> alunos.print()}) //Joana, João, Pedro, Maria, Ana

    val aprovadosNaOrdem1 = linkedSetOf("Pedro", "Maria", "Fernando", "Andrea")
    println("\nLinked... Ordem de insercao")
    for (aprovados in aprovadosNaOrdem1){ aprovados.print() } //Pedro, Maria, Fernando, Andrea

    val aprovadosNaOrdem2 = sortedSetOf("Pedro", "Maria", "Fernando", "Andrea")
    println("\nSorted... Ordem Alfabetica")
    for (aprovados in aprovadosNaOrdem2){ aprovados.print() } //Andrea, Fernando, Maria, Pedro

    //Ordem maluca
    println("\nOrdem pela segunda letro do nome")
    listaAprovados.sortedBy { it.substring(1) }.print() //Maria, Pedro, Ana, Joana, João
}

