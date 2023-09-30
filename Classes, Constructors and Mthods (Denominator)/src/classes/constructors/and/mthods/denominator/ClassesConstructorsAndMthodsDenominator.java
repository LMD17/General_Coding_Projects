/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes.constructors.and.mthods.denominator;

import java.util.Scanner;

public class ClassesConstructorsAndMthodsDenominator {

    private int numer, deno;

    //Constructor no parameters
    public ClassesConstructorsAndMthodsDenominator() {
        numer = 0;
        deno = 1;
    }

    //Constructor 2 parameters
    public ClassesConstructorsAndMthodsDenominator(int a, int b) {
        numer = a;
        deno = b;
        simplify();
    }

    private void simplify() {
        int common = getGCD(numer, deno);
        numer = numer / common;
        deno = deno / common;
    }

    public double getValue() //// getter method. / accessor /retrieve
    {
        return (double) numer / deno;
    }

    public static int getGCD(int x, int y) {
        int LargeCommonFactor = 0; //// running total
        for (int i = 1; i <= y; i++) {
            if ((x % i == 0) && (y % i == 0)) {
                int newNumber = (x / i);
                int newDeno = (y / i);
                LargeCommonFactor = i;
            }
        }
        return LargeCommonFactor;
    }

    @Override
    public String toString() {
        return numer + "/" + deno;
    }

    public static void main(String[] args) {

        int numer, deno;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the numerator");
        numer = keyboard.nextInt();
        System.out.println("Enter the denominator");
        deno = keyboard.nextInt();

        while (deno <= 0) {
            System.out.println("You entered an invalid denominator\nPlease enter the dnominator");
            deno = keyboard.nextInt();

        }

        //initialize the objects of class denominator
        ClassesConstructorsAndMthodsDenominator obj1 = new ClassesConstructorsAndMthodsDenominator();
        System.out.println(" ");
        System.out.println("This is output for obj1");
        System.out.println("My obj1 has 0 and 1 for numer and deno");
        System.out.println("The decimal value for the fraction we have is " + obj1.getValue());
        System.out.println("The simplified form of our numer o and deno 1 is " + obj1.toString());
        System.out.println("The simplified form of fraction is " + obj1.getGCD(0, 1));

        //Create another object
        ClassesConstructorsAndMthodsDenominator obj2 = new ClassesConstructorsAndMthodsDenominator(numer, deno);
        System.out.println(" ");
        System.out.println("This is output for obj2");
        System.out.println("The decimal value for the fraction we have is " + obj2.getValue());
        System.out.println("The simplified form of our fraction is " + obj2.toString());
        System.out.println("The simplified form of fraction is (GCD)" + obj2.getGCD(numer, deno));

        
        //Create another object
        ClassesConstructorsAndMthodsDenominator obj3 = new ClassesConstructorsAndMthodsDenominator(15, 60);
        System.out.println(" ");
        System.out.println("This is output for obj3");
        System.out.println("The decimal value for the fraction we have is " + obj3.getValue());
        System.out.println("The simplified form of our fraction is " + obj2.toString());
        System.out.println("The simplified form of fraction is (GCD)" + obj2.getGCD(numer, deno));
        
    }

}
