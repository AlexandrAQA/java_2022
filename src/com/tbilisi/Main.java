package com.tbilisi;

public class Main {

    public static void main(String[] args) {
	    System.out.println("new commit");
        float f1 = 20.00F;
        float f2 = 21.123f;

        double d1 = 2345.3333333;
        double d2 = 44343438498439843984398D;

        char c0 = ' '; // 1 space is a character as well (not 2 spaces)
        char c1 = '$';
        char c2 = 200;
        char c3 = 333;
        System.out.println(c2 + " " + c3); //shift + F10 = RUN

        char c4 = 1234;  // 10 = 0-9
        char c5 = '\u1234';  //16 = 0-9 + ABCDEF
        System.out.println("c4 = " + c4 + " c5 = " + c5);

        int a60 = 60;
        int a60_bin = 0b111100; //0b means it is a binary system (60 in binary system = 111100)
        int a_1_7 = 074; //0 means it is the 8th system from 0 to 7
        int hex_16 = 0x3C;
        System.out.println("a60 = " + a60 + " 1111000 in bin = " + a60_bin + " 074 in 8th system = " + a_1_7 + " 3c in 16 = " + hex_16);

        int underScore = 2_000__000___000; // 10_000_000 => we can show big numbers in clear way
        long under_score = 100_233_456_777_888_999L; // big numbers better to show in this way
        double undscr_d = 1_222_333_444.777_888_999; // underscore in double type is possible as well
        System.out.println(underScore + " " + under_score + " " + undscr_d);





    }
}
