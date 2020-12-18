package com.aulas.java.value_valueof;

import com.aulas.java.enumeradores_como_classe.DiaSemana;
//exemplo para usar no banco de dados
public class TesteEnum2 {
    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");

        System.out.println(dia);

    }
}
