package com.aulas.java.enumeradores_como_classe;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana dia =  DiaSemana.SEXTA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1, 4, 2018, DiaSemana.SEGUNDA);
        System.out.println(data.getDia());
    }

}
