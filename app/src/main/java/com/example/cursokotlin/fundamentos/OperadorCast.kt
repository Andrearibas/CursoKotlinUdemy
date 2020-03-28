package com.example.cursokotlin.fundamentos

fun imprimirConceito(nota: Any){
    // Aqui utilizamos o Cast "as" para dizer q a nota será do tipo Int, e o ? para não ocorrer nenhuma erro
    when(nota as? Int ?: 0){
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main() {
    val notas = arrayOf(9.3, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas)
        //Utilizamos o .toInt() para converte as notas caso o tipo não seja Int.
        imprimirConceito(nota.toInt())
}
