package com.tbilisi;

public class Building {
    Building(String addr, String name){ // user's Constructor with params
        address = addr;
        nameofBuilding = name;
        System.out.println("New Building object is created!!!"); // Constructor's body can contains some code
    }
    String address;
    String nameofBuilding;
}

class BuildBuildings {
    public static void main(String[] args) {

    Building b1 = new Building("Tbilisi, Saburtalo; ", "VIP ");
    System.out.println("address: " + b1.address + "name of building: " + b1.nameofBuilding);

    Building b2 = new Building("Minsk, West; ", "DaVinchi");
    System.out.println("address: " + b2.address + "name of building: " + b2.nameofBuilding);
}
}
