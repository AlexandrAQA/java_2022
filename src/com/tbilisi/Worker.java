package com.tbilisi;

public class Worker {
    int id;
    String surname;
    int age;
    String address;
    double salary;

    //we create custom Constructor with maximum amount of params
    // and then if need create smaller Constructor we just use THIS and set default values
    //instead of params which current constructor does not have
    Worker(int id1, String lastName1, int age1, String address1, double salary1){
        id = id1;
        surname = lastName1;
        age = age1;
        address = address1;
        salary = salary1;
    }
    Worker(int id2, String lastname2, int age2, String address2){
        this(id2,lastname2, age2,address2, 0.0);
    }
    Worker(String lastname3, int age2, String address3){
        this(0, lastname3, age2, address3, 0.0);
    }
}


    class WorkerRun{
        public static void main(String[] args) {
            //1st Constructor
            Worker worker1 = new Worker(1,"Petrenko", 25, "Berlin", 1000.0 );
            System.out.println(worker1.id + "\n" + worker1.address +"\n" + worker1.surname +"\n"+ worker1.age + "\n" + worker1.salary);
            System.out.println();
            //2nd C.
            Worker worker2 = new Worker(2,"Panaev", 30, "Tbilisi, Saburtalo");
            System.out.println(worker2.id + "\n" + worker2.address +"\n" + worker2.surname + "\n" + worker2.age);
            System.out.println();
            //3rd Constructor
            Worker worker3 = new Worker("Lodbrock", 35, "Munich, Centre");
            System.out.println( worker3.surname + "\n" + worker3.age + "\n"+ worker3.address);
        }

    }






