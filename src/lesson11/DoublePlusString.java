package lesson11;

import java.util.Scanner;

public class DoublePlusString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers which have double type (e.g 1.0000002 and 1.23444): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if ( Math.abs(b - a) < 0.0001 )
            System.out.println("Numbers " + a + " and " + b + " are the same");
        else
            System.out.println("Numbers are NOT the same");

        String text = "Tbilisi";
        String message = text;
        String s1 = text.toUpperCase();
        String s2 = text.toLowerCase();
        System.out.println("message is " + message + " S1 is " + s1 + " S2 is " + s2);

        System.out.println(text == message);
        System.out.println(text == s1);
        System.out.println(s1 == s2);
        System.out.println("");

        message = s2;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(text));
        System.out.println(s2.equals(message));
        System.out.println("");

        String str0 = "При";
        boolean b1 = "Привет".equals(str0 + "вет"); //true
        String str1 = "П";
        boolean b2 =  (str1 + "ривет").equals(str1+ "ривет"); //true
        System.out.println(b1 + "\n" + b2);
        System.out.println("");

        System.out.println("We are the champions, my friends");
        System.out.println("We are the champions, my friends".equals("We are the champions, my friends"));
        System.out.println("We are the champions, my friends".equals(s1)); //true

    }

}
