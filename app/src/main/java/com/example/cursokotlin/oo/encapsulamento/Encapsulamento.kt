package com.example.cursokotlin.oo.encapsulamento

//Variaves e Constantes TopLevel
private val dentroDoArquivo = 1 // Essa constante só está disponivel dentro do arquivo
//protected val protegidoNaoSuportadoAqui = 1  // Essa visibilidade nao pode ser TopLevel
internal val dentroDoProjeto = 1 // Essa constante está disponivel apenas para esse projeto
val publico = 1 // Esta constante está disponivel pra todos

//Funções TopLevel
private fun dentroDoArquivo() = 1 // Essa constante só está disponivel dentro do arquivo
//protected fun protegidoNaoSuportadoAqui() = 1  // Essa visibilidade nao pode ser TopLevel
internal fun dentroDoProjeto() = 1 // Essa constante está disponivel apenas para esse projeto
fun publico() = 1 // Esta constante está disponivel pra todos

//Para que uma classe seja herdada em kotlin, precisa desse open
open class Capsula {
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula() {
    fun verificarAcesso(){
        //println(dentroDoObjeto) -> Atributo privado da Capsula
        //println(Capsula().vaiPorHeranca) -> Nao precisa instanciar pois já foi herdado
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso(){
    //println(Capsula().dentroDoObjeto()) //Nao esta disponel
    //println(Capsula().vaiPorHeranca()) // So vai por Heranca
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}
