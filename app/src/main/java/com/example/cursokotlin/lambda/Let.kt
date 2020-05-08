package com.example.cursokotlin.lambda

fun main() {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null, "D")

    for (item in listWithNulls){
        item?.let {
            println(it)
        }
    }
}