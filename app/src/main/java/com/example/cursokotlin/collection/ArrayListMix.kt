package com.example.cursokotlin.collection

fun main() {
    val listaMix = arrayListOf("Carlos", true, 1, 3.14, "p")

    //Pelo fato da listaMix ser do tipo Any, precisou fazer um smart cast para
    //alterar para maiscula os elementos em String
    for (item in listaMix){
        if (item is String){
            println(item.toUpperCase())
        }else{
            println(item)
        }
    }
}