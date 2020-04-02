package com.example.cursokotlin.funcoes;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Joao", "Maria", "Pedro");

        //Chamando o metodo criado em kotlin, para Java
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}


