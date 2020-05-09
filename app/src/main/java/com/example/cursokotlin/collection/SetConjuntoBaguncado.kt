package com.example.cursokotlin.collection

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf("Amanda", true, 3, 'a', 3.42)

    //conjunto.get() Esse metodo get nao funciona pois as listas SET não sao indexadas

    conjunto.add(3).print() // falso, pois o SET nao aceita elementos repeditos
    conjunto.add(10).print() // true, incluir pois nao tinha o elemento 10 no conjunto
    conjunto.size.print() // 6 elementos, pois foi incluso o 10 no ultimo metodo
    conjunto.remove("a").print() // falso, pois "a" é diferente de 'a'  (String VS char)
    conjunto.remove('a').print() // true, de fato excluiu o elemento
    conjunto.contains("amanda").print() // falso, pois Amanda tem a letra maiscula
    conjunto.contains("Amanda").print() // true, pois Amanda esta exatamento igual

    var nums = setOf(1,2,3) // somente leitura, nao podendo add
    //nums.add(4) não existe

    (conjunto + nums).print() // De fato houve a juncao das duas listas [10, 3, 3.42, Amanda, true, 1, 2]
    (conjunto - nums). print() // retirou os elementos de nums do conjunto

    conjunto.intersect(nums).print() // nao muda o conjunto
    conjunto.retainAll(nums).print() // muda o conjunto
    conjunto.print()

    conjunto.clear() // Limpou o conjunto
    conjunto.isEmpty().print() // retorna true se o conjunto esta vazio
}

