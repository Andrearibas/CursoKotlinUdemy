package com.example.cursokotlin.fundamentos

fun main() {
    //Tipos Numericos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_482_647
    val num4: Long = 9_223_372_036_854_775_807
    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)

    //Tipos Numericos Reais
    val num5: Float = 3.45F
    val num6: Double = 3.4

    //Tipos Caracteres
    val char: Char = '?' //Exemplos: 'a'  '1' ' '

    //Tipos booleano
    val boolean: Boolean = true // ou false

    println(listOf(num1,num2,num3, num4, num5, num6, char, boolean))

    println(2 is Int)

    //Tudo é um objeto
    println(10.dec())
}