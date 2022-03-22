package com.tbilisi;
// methods overloading - it's when we use the same names of methods
// but with different:
// 1.type of params (int, string, boolean, double etc.)
// or
// 2.number of parameters (int i) & (int i2, int i3) & (int ii, String str)

public class LearnOverloading {
    void show (int i){
       System.out.println(i);
    }
    int show (int i, int i2){
        System.out.println(i + i2);
        return i + i2;
    }
    String show (String str1, String str2){
        System.out.println(str1 + str2);
        return str1 + str2;
    }
    void show (String str, int a) {
        System.out.println(str + a);
    }
    void show (int a, String str){
            System.out.println(a + str);
    }
    void show (double dou_b_le){
        System.out.println(dou_b_le);
    }
    void show (boolean boo){
        System.out.println(boo);
    }

}

class Test {
    public static void main(String[] args) {
        LearnOverloading learnOverloading = new LearnOverloading();
        learnOverloading.show(1);
        learnOverloading.show(10,5);
        learnOverloading.show("String ", 200);
        learnOverloading.show(100, " methods Overloading with changing params places");
        learnOverloading.show(12.12);
        learnOverloading.show(true);

        System.out.println();
        learnOverloading.show(12, 18);
        learnOverloading.show(11,11);
        learnOverloading.show("Tbilisi is ", "a great city!!!");
    }



}
