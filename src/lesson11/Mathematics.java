package lesson11;

import java.util.Locale;
import java.util.Scanner;

public class Mathematics {
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

    }

}
