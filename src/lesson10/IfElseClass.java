package lesson10;

import java.util.Scanner;

class Student {

}

public class IfElseClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 3 Integers if some of them are equal then print them
        if (a == b && b != c) {
            System.out.println(a + " " + b);
        }
        if (a == c && a != b) {
            System.out.println(a + " " + c);
        }
        if (b == c && a != b) {
            System.out.println(b + " " + c);
        }
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }

    }

}


