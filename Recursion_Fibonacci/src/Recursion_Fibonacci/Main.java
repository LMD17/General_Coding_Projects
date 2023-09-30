package Recursion_Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the index: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci of " + index + " is " + fibonacci(index));
    }

    //Fibanacci method
    public static Integer fibonacci(int i){
        if (i <= 1)
            return 0;   //base case
        else
            return fibonacci(i-1) + fibonacci(i-2);
    }
}