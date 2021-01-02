package com.aulas.java.classes_aninhadas;

public class Externa {
    public void metodoQualquer() {

        class ClasseLocal{

            private String texto = "Texto classe local";

            public void imprimeTexto() {
                System.out.println(texto);
            }

        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();

    }

    public static void main(String[] args) {
        Externa externa = new Externa();

        externa.metodoQualquer();
    }
}

