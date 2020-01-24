package com.example.cursokotlin.fundamentos.controles

fun main() {
    //Nesse exemplo o break faz o desvio de acordo com a repetiçao marcada/rotulada @externo
    externo@for(i in 1..15){
        for(j in 1..15){
            if (i==2 && j==9) break@externo
            println("$i $j")
        }
    }
    println("Fim")
}