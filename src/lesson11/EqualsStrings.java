package lesson11;

import java.util.Scanner;

public class EqualsStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "heLlO";
        String s3 = s1.toUpperCase();
        String s4 = "   ";
        String s5 = "   ";
        String s6 = "";
        boolean b = s4.equals(s5);
        boolean b1 = s5.equals(s6);

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println("");
        System.out.println("b: " + b + " b1: " + b1);

        Scanner console = new Scanner(System.in);
        System.out.println("Enter 2 strings please: ");
        String str1 = console.nextLine();
        String str2 = console.nextLine();
        String result = str1.equals(str2) ? "Одинаковые" : "Разные";
        System.out.println(result);

        String text = "Это очень важное сообщение";
        String message = new String ("Это очень важное сообщение");
        String text1 = "We are the champions, my friends";
        String message1 = new String (text);
        System.out.println("text is " + text + " message is " + message + "\ntext1 is " + text1 + " message1 is " + message1);
    }

}
