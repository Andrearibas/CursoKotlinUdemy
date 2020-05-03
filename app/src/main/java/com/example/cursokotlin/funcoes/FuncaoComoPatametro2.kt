package com.example.cursokotlin.funcoes

fun <ABC> filtrar(lista: List<ABC>, filtro: (ABC) -> Boolean): List<ABC> {
    val listaFiltrada = ArrayList<ABC>()
    for (e in lista){
        if (filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main() {
    val listaNomes = listOf("Bia", "Fernando", "Maria", "Fe", "Gui", "Ana", "Deia")
    println(filtrar(listaNomes, ::comTresLetras))
}