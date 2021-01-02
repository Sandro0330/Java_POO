package com.aulas.java.classes_aninhadas;

public class Anonima {

    public void imprimeTexto() {
        System.out.println("Qualquer texto");
    }

    public static void main(String[] args) {

        Anonima anonima = new Anonima(){
            public void imprimeTexto() {
                System.out.println("Qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

//        //usando Interface
//        Texto texto = new Texto() {
//            @Override
//            public void imprimeTexto() {
//                System.out.println("Qualquer texto - interface");
//            }
//        };
//
//        texto.imprimeTexto();
    }
}
