package lesson12;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer > 0 and < 10: ");
        int  n = scanner.nextInt();
        while (n > 0 && n < 10)
        {
            System.out.println(n);
            n++;
        }
        //shows all entered Integers before user type NOn Integer
        System.out.println("This script print all your integers before you type NON-Integer " +
                " please type the first Integer: ");
        while(scanner.hasNextInt())
        {
            int x = scanner.nextInt();
            System.out.println("Your Integer is equal to: " + x + " type the next one please: ");
        }



    }
}
