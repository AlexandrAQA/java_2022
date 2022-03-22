package com.tbilisi;

public class Specialist {
    int id;
    String surname;
    int age;
    boolean hasPet;
    double salary;
    String id_security;

    Specialist(int id_spec, String sur_name, int age_sp, boolean isHeHavePet) {
        id = id_spec;
        surname = sur_name;
        age = age_sp;
        hasPet = isHeHavePet;
    }
    Specialist(int id_spec2, String sur_name2, int age_sp2) {
        id = id_spec2;
        surname = sur_name2;
        age = age_sp2;

    }
    Specialist(String sur_name3, int age_sp3) { // we use this 3RD constructor into 5th
        surname = sur_name3;
        age = age_sp3;
    }
    protected Specialist(String id_s, String surname_s, int age_s, double salary_s, boolean isHavePet_s){
        id_security = id_s;
        surname = surname_s;
        age = age_s;
        salary = salary_s;
        hasPet = isHavePet_s;
    }

    // We use overloaded Constructor into another one:
    Specialist (int id5, String sur_name_5, int age_specialist, double salary5){
        this(sur_name_5, age_specialist); //we use here 3RD constructor with 2 params String sur_name3, int age_sp3
        id = id5;                     //but we change their names to the current names of the constructor in which we use the call
        salary = salary5;

    }
    int sum(int a,int b,int c){
        return a + b + c;
    }
}

class SpecialistTest {
    public static void main(String[] args) {
        Specialist specialist1 = new Specialist(001, "Smith", 22, true);
        System.out.println("Surname: " + specialist1.surname + " age: " + specialist1.age + " is person have a pet: " + specialist1.hasPet);

        Specialist specialist2 = new Specialist("Ivanov", 21);
        System.out.println("Surname: "+ specialist2.surname + " age: " + specialist2.age);

        Specialist specialist3 = new Specialist(003, " Ivanov", 21);
        System.out.println("id: "+ specialist3.id + specialist3.surname + " age: " + specialist3.age);

        Specialist specialist_security = new Specialist( "007", " Bond", 40, 100_000.99, false);
        System.out.println("id: " + specialist_security.id + " surname: "+ specialist_security.surname);

        int r = specialist1.sum(1,2,3)/3;
        System.out.println(r);
        }

        Specialist specialist5 = new Specialist(005, "Bornson", 22, 5_100.78);

    }

