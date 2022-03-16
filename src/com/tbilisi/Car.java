package com.tbilisi;

public class Car {
    String color;
    String carModel;
    double carEnginePower;
    int speedMax;
    int speedCurrent;

    int pressGas(int spd) {
    return speedCurrent +=spd;
    }

    int pressBrakePedal(int spd){
        return speedCurrent -=spd;
    }
    void showInfoAboutCar(){
        System.out.println("Color is " + color + " Model is " + carModel +
                " Car's engine power is " + carEnginePower + " max speed is " + speedMax + " speedCurrent is " + speedCurrent);
    }
}
    class CarTest{
        public static void main(String[] args) {
            Car car1 = new Car();
            car1.speedMax = 260;
            car1.speedCurrent = 70;
            car1.carModel = "BMW X6";
            car1.carEnginePower = 3.0;
            car1.color = "blue";

            car1.showInfoAboutCar();
            car1.pressGas(50);
            car1.showInfoAboutCar();
            car1.pressGas(30);
            car1.pressBrakePedal(90);
            car1.showInfoAboutCar();

            //Car car2 = car1;
           // Car carZero; // empty variable

            // we can create empty default object without variable:
            //System.out.println(new Car().carEnginePower + new Car().carModel + new Car().color);

        }
    }