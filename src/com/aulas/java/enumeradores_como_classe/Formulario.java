package com.aulas.java.enumeradores_como_classe;

public class Formulario {

    enum Genero {
        Feminino('F'), Masculino('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;

}
