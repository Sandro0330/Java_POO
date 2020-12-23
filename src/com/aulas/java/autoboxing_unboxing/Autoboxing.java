package com.aulas.java.autoboxing_unboxing;

public class Autoboxing {
    public static void main(String[] args) {

        //autoboxing
        Short num1 = 1;
        Byte num2 = 10;
        Integer num3 = 100;
        Long num4 = 1000l;
        Float num5 = 3.5f;
        Double num6 = 3.555555;

        //auto un-boxing
        int num13 = num3;
        num3.intValue();

        //autoboxing em expressões
        num3++;
        System.out.println(num3);

        Integer num14 = num13/num3;
        System.out.println(num14);

        //mau uso
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;

        Double media =(a+b+c)/3;
        System.out.println(media);
    }
}
