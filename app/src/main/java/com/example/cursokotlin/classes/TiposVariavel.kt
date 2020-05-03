package com.example.cursokotlin.classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object{
        @JvmStatic val constanteDaClasse = "Ciclano"
    }

    fun fazer(){
        val local = 7

        if(local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDaClasse, $local e $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDaClasse)
}

