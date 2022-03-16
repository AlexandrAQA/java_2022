package com.tbilisi;

public class Methods {
    int sumOfThree (int a, int b, int c){
        int sum  = a+b+c;
        System.out.println(sum); // we can remove print to main or leave here
        return sum;
    }

    int averageOfThree (int d, int e, int f){    //call 1 method 'sumOfThree()' inside in another one 'averageOfThree()'
        int averageResult = sumOfThree(d,e,f) / 3;
        System.out.println("Average of these three numbers is " + averageResult);
        return averageResult;
    }
}
class RunMethods {
    public static void main(String[] args) {
        Methods sumMethods = new Methods(); // Class Creating

        int sumMain = sumMethods.sumOfThree(1010, 202, 330); // add result to variable
        sumMethods.sumOfThree(10, 15, 20); //just call method and show on display but without saving
        System.out.println(sumMethods.sumOfThree(2, 2, 3)); // call method inside print
        // but we've already had print in our method however is good like an option, we will see 2 the same numbers in the output

        sumMethods.averageOfThree(10, 20, 30);


    }
}
