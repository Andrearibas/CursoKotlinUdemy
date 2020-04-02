package com.example.cursokotlin.funcoes

fun imprimirMaior(a: Int, b: Int){
    println(Math.max(a,b))
}

fun imprimiMaior2(a: Int, b: Int): Unit {
    println(Math.max(a,b))
}

fun imprimiMaior3(a: Int, b: Int): Unit {
    println(Math.max(a,b))
    return
}

fun imprimirMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimirMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main() {
    imprimirMaior(3,5)
    imprimiMaior2(3,5)
    imprimiMaior3(3,5)
    imprimirMaior4(3,5)
    imprimirMaior5(3,5)

    //O retorno Unit pode encadear algumas chamadas
    imprimirMaior5(3,5).run { 5 > 3 }.run { println("Resultado: $this") }
}



