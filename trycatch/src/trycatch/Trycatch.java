// this program shows how to handle exceptions in our programs using the try catch block.
package trycatch;

import java.util.Scanner;

public class Trycatch {

    public static void main(String[] args) {
        //we need to divide
        //division by zero is not possible, so we need to handle it.
        Scanner input = new Scanner(System.in);

        try //this is where we anticipate an error to occur
        {
            System.out.println("Provide the numerator: ");
            int numerator = input.nextInt();

            System.out.println("Provide the denominator: ");
            int denominator = input.nextInt();

            if (denominator < 1) {
                throw new Exception("There is an exception: denominator cannot be zero");
            }

            double quotient = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Quotient: " + quotient);

        } 
        catch (Exception e) //'e' holds the value that was thrown in the exception
        {
            System.out.println(e.getMessage());
            System.out.println("You need to provide a denominator that is >= 1");
        }

    }

}
