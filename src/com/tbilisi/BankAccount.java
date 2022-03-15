package com.tbilisi;

public class BankAccount {
    int id;
    String name;
    double balance;
    boolean isPremium;


    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount();
        BankAccount hisBankAccount = new BankAccount();
        BankAccount jediBankAccount = new BankAccount();

        myBankAccount.id = 100;
        myBankAccount.name = "Alexandr Panaev";
        myBankAccount.balance = 10_000.789;
        myBankAccount.isPremium = true;

        hisBankAccount.id = 101;
        hisBankAccount.name = "Oleg Sokolov";
        hisBankAccount.balance = 199_789.123;
        hisBankAccount.isPremium = true;

        jediBankAccount.id = 102;
        jediBankAccount.name = "Luke Skyworker";
        jediBankAccount.balance = 7_789.123;
        jediBankAccount.isPremium = false;

        System.out.println(myBankAccount.id +" "+myBankAccount.name +" "+ myBankAccount.balance + " " + myBankAccount.isPremium);
        System.out.println(hisBankAccount.id +" "+hisBankAccount.name +" "+ hisBankAccount.balance + " " + hisBankAccount.isPremium);
        System.out.println(jediBankAccount.id +" "+jediBankAccount.name +" "+ jediBankAccount.balance + " " + jediBankAccount.isPremium);


    }
}
