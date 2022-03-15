package com.tbilisi;

public class Car {
    String color = "red";
    String carModel = "Skoda";
    double carEnginePower = 2.0;
}

    class CarTest{
        public static void main(String[] args) {
            Car car1 = new Car();
            Car car2 = car1;
            Car carZero; // empty variable

            // we can create empty default object without variable:
            System.out.println(new Car().carEnginePower + new Car().carModel + new Car().color);

        }
    }