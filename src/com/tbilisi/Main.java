package com.tbilisi;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Lessons 4");
        int b = 9;
        int result = --b + ++b;
        int result2 = result - ++b - --b + --b + b++;

        System.out.println(result);   //17
        System.out.println(result2); //14

        }
}
