package com.aulas.java.value_valueof;


import com.aulas.java.enumeradores_como_classe.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values(); //values retorna um array com todos os valores

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        System.out.println("===========================");

        for(DiaSemana dia: DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}
