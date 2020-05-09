package com.example.cursokotlin.collection

class Objeto(val nome: String, val descricao: String){
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
         if (other is Objeto){
            return nome.equals(other.nome, ignoreCase = true)
        }else {
             return false
         }
    }
}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "......."), // HashCode = 7
        Objeto("Mesa", "......."), // HashCode = 4
        Objeto("Faca", "......."), // HashCode = 4
        Objeto("Copo", ".......") // HashCode = 4
    )
    //Como sobrescrevemos o HashCode por quantidades de letras no nome,
    // a busca ficou mais rapida, pois o equals
    //procurou apenos pelo conjunto de 4 letras
    conjunto.contains(Objeto("faca", "????????")).print()
}

