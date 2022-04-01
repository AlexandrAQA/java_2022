package lesson7;

public class Student {
    String firstName;
    String lastName;
    int yearOfBirth;
    double averageRating;

    public Student (String firstName, String lastName, int yearOfBirth, double averageRating){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.averageRating = averageRating;
    }

    public void showInfo(){
        System.out.println(firstName + "\n" + lastName +"\n" + yearOfBirth +"\n" + averageRating);
    }


}
