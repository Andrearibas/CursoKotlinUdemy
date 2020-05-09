package com.example.cursokotlin.collection

fun main() {
    //Na estrutura MAP temos duas colunas (Chave e Valor)
    //Diferente do List e Set o Map utiliza o put ao inves de add, sendo que é feito a
    // substituiçao quando a chave já existe dentro dessa lista
    val map = HashMap<Long, String>()
    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    map.put(60070080090, "Pedro Filho") // Substituira o pedro, pois a cheve é igual

    for(par in map){println(par)} // Imprimi a chave e o valor

    for (nome in map.values){ println(nome)} // imprimi apenas o valor (nome)

    for (cpf in map.keys){println(cpf)} // imprimi apenas a chave (cpf)

    for ((cpf, nome) in map){println("Nome: $nome - CPF: $cpf")} // imprimi a lista personalizado

    map.size.print() // imprimi o tamando da lista
    map.get(30040050060)?.print() // imprimi o valor dessa chave
    map[30040050060]?.print()// mesmo metodo de cima
    map.contains(30040050060).print() // verifica se existe essa chave
    map.remove(30040050060)?.print()// remove esse elemento
    map.clear() // limpa a lista
    map.isEmpty().print()// verifica se a lista é vazia
}

