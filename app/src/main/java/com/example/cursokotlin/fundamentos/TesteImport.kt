package com.example.cursokotlin.fundamentos

import com.example.cursokotlin.fundamentos.pacoteA.Coisa
import com.example.cursokotlin.fundamentos.pacoteA.FaceMoeda
import com.example.cursokotlin.fundamentos.pacoteB.subtracao
import com.example.cursokotlin.fundamentos.pacoteA.simplesFuncao as funcaoSimples

fun main() {
    println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(FaceMoeda.COROA)

    println("A soma é ${soma(2,3)} e a subtração é ${subtracao(4,6)}")
}
