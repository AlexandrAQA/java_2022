package lesson10;

import lesson7.Aclass;
import lesson7.Bclass;
import lesson8.Student;
import lesson9.Car;

import static lesson9.Laptop.laptopName; //import only 1 public static variable


public class ImportFromOthers {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "white", 10_000.99);
        car1.changeColor("red", 2000);
        System.out.println(car1.carName + "\n color is " + car1.color + "\n price is " + car1.priceDefault);

        Student student1 = new Student("Ivan", 3);
        //student1.showNonStatic(); only Public methods, constructors we can import
        System.out.println("");

        Aclass aclass = new Aclass();
        aclass.showDataEmployee(002, "Petr", "Poland");

        Bclass bclass = new Bclass("Tbilisi", "George");
        bclass.salaryX2(2_000);
        bclass.showDataEmployee(001, "Ivan", "Tbilisi, Saburtalo");

        lesson7.Student les7_student1 = new lesson7.Student("Serge", "Zubckevich", 1980, 9.88);
        les7_student1.showInfo();

        System.out.println("public static var from another package is " + laptopName); //use public static var from another package;






    }


}
