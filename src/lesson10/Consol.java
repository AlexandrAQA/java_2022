package lesson10;
import java.util.Scanner;

public class Consol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is " + userName);
        System.out.println("Your age is " + age);

        System.out.println("Type the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Type the 2nd number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of numbers " + num1 + " and " + num2 + " is " + sum);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println("Enter a number please: ");
        Scanner intFromUser = new Scanner(System.in);
        if(intFromUser.hasNextInt()){
            int num = intFromUser.nextInt();
            System.out.println("Thank you, your number is " + num);
        } else {
            System.out.println(":( " + " Please Restart the script and enter correct Integer");
        }



    }

}
