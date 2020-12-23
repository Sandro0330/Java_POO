package com.aulas.java.istatic_import;

//import static java.lang.Math.pow;
//import static java.lang.Math.sqrt;
import static java.lang.Math.*; //importa todos os métodos da classe Math, import não é muito usado

public class StaticImport {



    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;
        double d = 16;

        System.out.println(Math.pow(a, b));

        System.out.println(Math.sqrt(c));

        System.out.println(pow(a, b));
        System.out.println(sqrt(d));
    }
}
