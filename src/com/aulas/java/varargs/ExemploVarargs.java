package com.aulas.java.varargs;

public class ExemploVarargs {

    public static void main(String[] args) {

        System.out.println(soma(4, 6));
        System.out.println(soma(4, 6, 7));

        int[] vetor = {1, 2, 3, 4};
        System.out.println("Vetor --> " + soma2(vetor));


        System.out.println("---Varargs---");
        System.out.println(somaVarargs(1, 2, 3, 4, 10));
    }

    static int soma(int a, int b) {
        return a +b;
    }

    static int soma(int a, int b, int c) {
        return a +b + c;
    }

    static int soma2(int[] vetor) {
        int total = 0;

        for (int i=0; i<vetor.length; i++) {
            total += vetor[i];
        }
        return total;
    }

    //varargs
    static int somaVarargs(Integer... vetor) {
        int total = 0;

        for (int i = 0; i<vetor.length; i++) {
            total += vetor[i];
        }
        return total;
    }
}
