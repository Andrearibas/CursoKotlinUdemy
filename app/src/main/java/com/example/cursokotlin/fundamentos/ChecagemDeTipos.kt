package com.example.cursokotlin.fundamentos

fun main() {
    var valor = "abc"

    if (valor is String){
        println("O Valor $valor é uma String")
    }else{
        println("Não é do Tipo String")
    }


    //O Any é generico, podendo ser de qualquer tipo
    var valor2: Any = 123

    if (valor2 is String){
        println("O tipo $valor2 é uma String")
    }else{
        println("O valor $valor2 não é do Tipo String")
    }
}