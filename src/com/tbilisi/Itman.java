package com.tbilisi;

public class Itman extends BankAcc{
    String name;
    String it_position;
    String companyName;
    House color;
    House h_address;
    House measuring;
    BankAcc id;
    BankAcc balance;
    BankAcc currency;

    Itman(int id_bank_acc, double balance_ba, boolean isPremium_ba, String currency_ba) {
        super(id_bank_acc, balance_ba, isPremium_ba, currency_ba);
    }

    public Itman() {
        super();
    }

    void showInfoItman() {
        System.out.println("name: " + name + "\ntitle: " + it_position + " \ncompany: " + companyName +
                "\nhouse's color: " + color.color + "\naddress: " + h_address.address + "\nhouse's square: " + measuring.measuring +
                "\nbank account id: " + id.id + " \nbalance: " + balance.balance + " \ncurrency: " + currency.currency);
    }

    static class ItManTest {
        public static void main(String[] args) {
            Itman itman = new Itman();
            itman.name = "Alex";
            itman.it_position = "Software test engineer";
            itman.companyName = "IT";
            itman.color = new House("white", "Tbilisi, Saburtalo", 70.80, 12.50);
            itman.id = new BankAcc(10000000, 5_200.90, true, "USD");
            itman.h_address = new House("white", "Tbilisi, Saburtalo", 70.80, 12.50);
            itman.measuring = new House("white", "Tbilisi, Saburtalo", 70.80, 12.50);
            itman.currency = new BankAcc(10000000, 5_200.90, true, "USD");
            itman.balance = new BankAcc(10000000, 5_200.90, true, "USD");

            itman.showInfoItman();
            itman.addMoney(100.99);
            itman.spendMoney(22.99);



        }
    }


}

class House {
    House(String col, String addr, double meas, double mg) {
        color = col;
        address = addr;
        measuring = meas;
        measuringOfGarden = mg;
    }

    String color;
    String address;
    double measuring;
    double measuringOfGarden;

}

class BankAcc {
    BankAcc(int id_bank_acc, double balance_ba, boolean isPremium_ba, String currency_ba) {
        id = id_bank_acc;
        balance = balance_ba;
        isPremium = isPremium_ba;
        currency = currency_ba;
    }

    int id;
    double balance;
    boolean isPremium;
    String currency;

    public BankAcc() {

    }

    double addMoney(double add_money_res){
        System.out.println("Your balance is increased: " + add_money_res);
        return add_money_res;
    }

    double spendMoney(double spend){
        System.out.println("Yor balance was decreased: " + spend);
         return spend;
    }

}
