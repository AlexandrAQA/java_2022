package com.tbilisi;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Lesson 3");
        int a = 11, b = 3, c = 1_000;
        c = a / b; // int cut all numbers after comma
        System.out.println(c); // 11 / 3 = 3

        double a2 = 11, b2 = 3, c2;
        c2 = a2 / b2; // 3.66666666665
        System.out.println(c2);

        double x = 5.5;
        double y = 3.8;
        double z = x % y;
        System.out.println(z);







    }
}
