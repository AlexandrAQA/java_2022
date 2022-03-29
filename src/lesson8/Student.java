package lesson8;

import java.util.Date;

public class Student {
    String name;
    int course;
    static int id_count = 0; //static variable if non-static we can't count students
    int count = 0;

    /*
Static variables exist in one instance,
and we need to refer to them by the class name
(inside the class, we can refer to a static variable simply by their name):
     */

    public Student(String name0, int course0) {
        name = name0;
        course = course0;
        id_count++;
        System.out.println("new student with id_count " + id_count + " is created");

    }

    public static void showAmountOfStudents() {  //static method can NOT use NON-static variables if it
        id_count++;
        //count++;
        System.out.println("Total amount of Students is equal to " + Student.id_count);
    }
    public void showNonStatic(){
        id_count++;
        count++;
    }

}

class StudentRun {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 2);
        Student student2 = new Student("igar", 1);
        Student student3 = new Student("Vasya", 4);

        Date date = new Date();
        System.out.println("Current amount of Students is " + Student.id_count + " current time is " + date);
        //Classname.variable (for static only)

        Student student4 = new Student("Natasha", 5);
        Student student5 = new Student("Oleg", 3);

        Student.showAmountOfStudents(); //

    }
}