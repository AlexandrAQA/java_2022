package lesson7;

public class BclassTest {
    public static void main(String[] args) {

    Bclass b_public = new Bclass("Ivarov"); //public Constructor
    Bclass b_default = new Bclass("Tbilisi", "Magamedov"); // default Constructor
    Bclass b_protected = new Bclass(000002, "Wroclaw", "Tyshkevich", 5_000.99); //protexted Constructor
    //Bclass b_private = new Bclass(2020202, 2_999.88); private Constructor
}}
