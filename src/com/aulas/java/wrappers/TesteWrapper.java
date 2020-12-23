package com.aulas.java.wrappers;

public class TesteWrapper  {
    public static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 = 3.555555;

        Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(1000L);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(2.555);
        Boolean flag = new Boolean(true);
        Character b = new Character('b');

        Integer num13 = new Integer("10000");

        Double num14 = new Double("3.55");

        System.out.println(num13.intValue());

        Long num15 = num13.longValue();

        int num16 = Integer.parseInt("10000");

        Integer num17 = Integer.valueOf(1232);
        System.out.println(num17);

    }
}
