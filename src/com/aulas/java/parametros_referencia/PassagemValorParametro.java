package com.aulas.java.parametros_referencia;

public class PassagemValorParametro {

    public static void main(String[] args) {

        Contato contato = new Contato("Sandro", "1234-4567", "contato@email.com");
        int valor = 10;

        System.out.println("Valores originais");
        System.out.println(contato);
        System.out.println(valor);

        System.out.println("-----Teste1-----");
        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        System.out.println("-----Teste2-----");
        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

    }

    private static void testePassagemValorReferencia(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Regina", "33344-5555", "contato2@email.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato " + novoValor);
    }
}
