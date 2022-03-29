package lesson9;

public class Car {
    String carName;
    String color;
    static  int count;
    double priceDefault = 1000;

    Car(String carName, String color, double price){
        count++;
        this.carName = carName;
        this.color = color;
        priceDefault = price;

    }

    public void showCarInfo(){
        System.out.println("Car model is " + carName + " color is " + this.color);
        changeColor("red", 700.98);
    }

    public void changeColor(String color, double price){
        System.out.println("Old color was: " + this.color + " .New color is: " + color);

        double nds = 500.90;
        priceDefault = price + 1_000 + 2_000;
        this.color = color;

    }
}
