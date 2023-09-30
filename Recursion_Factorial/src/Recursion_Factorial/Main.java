package Recursion_Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number that is greater than zero: ");
        int num = input.nextInt();

        //Display the factorial
        try {
            System.out.println("The factorial of " + num + " is " + factorial(num));
        }catch (Exception e) {
            System.out.println("You entered an incorrect value");
            System.out.println("Error: " + e);
        }

    }

    //'Factorial method' is to return the factorial for the specified number
    public static long factorial(int n) {
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}