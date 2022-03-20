package com.tbilisi;

public class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    Employee(int id1, String surname1, double salary1, int age1, String dep1) {
        id = id1;
        name = surname1;
        salary = salary1;
        age = age1;
        department = dep1;
    }

    double doubledSalary() {
        return salary *= 2;

    }

    void showMeNewEmployeeSalary() {
        System.out.println(name + "'s new increased salary is: " + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(001, "Ivan Ivanov", 2_000, 25, "IT");
        Employee employee2 = new Employee(002, "Pablo Petrenko", 1_500, 29, "IT");
        Employee employee3 = new Employee(003, "Oleg Tkachov", 1_700, 30, "IT");

        employee1.doubledSalary();
        //System.out.println(employee1.name + "'s new increased salary is: " + employee1.salary); remove to Employee class
        employee1.showMeNewEmployeeSalary();

        employee2.doubledSalary();
        employee2.showMeNewEmployeeSalary();

        double empl3 = employee3.salary;
        System.out.println("Old salary of " + employee3.name + " was: " + empl3);
        employee3.doubledSalary();
        employee3.showMeNewEmployeeSalary();
    }
}
