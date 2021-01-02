package com.aulas.java.printf;

public class ClassePrintf {
    public static void main(String[] args) {
        System.out.printf("Hello %s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!"); // Passando toda a palavra para maiúscula
        System.out.println();
        System.out.printf("%c", 'c');
        System.out.printf("%n%C", 'c'); // Passando o caractere para maiúscula

        System.out.println();
        System.out.println();

        int valor = 123456789;
        System.out.printf("%d", valor);

        System.out.println();
        double pontoFlutuante = 3.9986655;
        System.out.printf("%f", pontoFlutuante);

        System.out.println();
        String olaMundo = "Olá, Mundo";
        System.out.printf("%20s", olaMundo); //espaçamento por padrão é da direita para esquerda

        System.out.println();
        String olaMundo1 = "Olá, Mundo";
        System.out.printf("%-20s", olaMundo); //espaçamento por padrão é da esquerda para direita

        System.out.println();
        System.out.printf("%015d", valor); //quantidade de caracteres

        System.out.println();
        System.out.printf("%,d", valor);// separando por vírgula

        System.out.println();
        int valor2 = -1457933895;
        System.out.printf("% d", valor2);

        System.out.println();
        System.out.printf("R$%10.3f", pontoFlutuante);
        System.out.println();

        testePrintf();

    }

    private static void testePrintf() {
        double[] precos = {1000, 123.56, 7645.567, 3, 4.45678};
        for (int i=0; i<precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
    }
}
