package com.tbilisi;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Lessons 3 & 4");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean res = a && b && c; //AND = true if everyone is true!
        boolean res2 = a || b || c;  //OR = true if one is true
        System.out.println("res = " + res +  " res2 = " + res2);

        boolean tr = true;
        boolean fl = false;
        tr = !fl;
        fl = !tr;
        System.out.println("tr = " + tr +  " fl = " + fl);
        int i = 10;
        int i2 = 100;
        int i3 = 95;
        boolean jjj = i++ + 100 >= i2 && --i2 > i && i3 != i2;
        System.out.println(jjj);

        boolean b08 = true;
        boolean b09 = true;
        boolean b10 = true;

        boolean b20 = false;
        boolean b30 = false;
        boolean b40 = false;
        System.out.println(b10^b20^b30^b40); // ^ = true when only 1= true, other = false
        System.out.println(b08^b09); // ^ = false

        int k = 10;
        int l = 9;
        int result;
        result = 17 - 3 * (l-- + k) / 2;
        System.out.println(result);







    }
}
