package lesson8;

public class Car {
    String color;
    String engine;
    double power;
}

class Human{
    String name;
    final Car car1 = new Car();

    public static void main(String[] args) {
        Human human1 = new Human();
        final Car car2 = new Car();
        car2.color = "white";
        car2.color = "black";
       // car2 = new Car();

        human1.name = "Serge";
        human1.car1.engine = "V8";
        human1.car1.power = 4.4;
        human1.car1.color = "red";
    }
}
