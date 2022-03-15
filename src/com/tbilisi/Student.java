package com.tbilisi;

public class Student {
    int student_id;
    String student_firstname;
    String student_surname;
    int student_year;
    double math_rating;
    double economic_rating;
    double foreign_lang_rating;

}
 class StudentTest{
     public static void main(String[] args) {
         Student student1 = new Student();
         student1.student_id = 1;
         student1.student_firstname = "Alex";
         student1.student_surname = "Alexandrovich";
         student1.student_year = 2022;
         student1.math_rating = 8.3;
         student1.economic_rating = 8.0;
         student1.foreign_lang_rating = 8.0;
         double averageRating1 = (student1.math_rating + student1.economic_rating + student1.foreign_lang_rating)/3;
         System.out.println("Average " + student1.student_firstname + "'s rating is " + averageRating1);

         Student student2 = new Student();
         student2.student_id = 2;
         student2.student_firstname = "Andrew";
         student2.student_surname = "Gavrilenko";
         student2.student_year = 2021;
         student2.math_rating = 7.3;
         student2.economic_rating = 7.9;
         student2.foreign_lang_rating = 7.9;
         double averageRating2 = (student2.math_rating + student2.economic_rating + student2.foreign_lang_rating)/3;
         System.out.println("Average " + student2.student_firstname + "'s rating is " + averageRating2);


         Student student3 = new Student();
         student3.student_id = 3;
         student3.student_firstname = "Marina";
         student3.student_surname = "Tihanova";
         student3.student_year = 2020;
         student3.math_rating = 9.0;
         student3.economic_rating = 9.0;
         student3.foreign_lang_rating = 9.3;
         double averageRating3 = (student3.math_rating + student3.economic_rating + student3.foreign_lang_rating)/3;
         System.out.println("Average " + student3.student_firstname + "'s rating is " + averageRating3);




     }

 }
