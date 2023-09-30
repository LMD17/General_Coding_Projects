
package classes.and.methods.denominator;

import java.util.Scanner;

public class ClassesAndMethodsDenominator {
    private int numer, deno;  //information hiding
    
    public ClassesAndMethodsDenominator()
    {
        numer = 0;
        deno = 0;
    }
    
//    public ClassesAndMethodsDenominator(a, b)
//    {
//        numer = a;
//        deno = b;
//    }
    
    private void Simplify(){
        int common = getGDC(numer, deno);
        numer = numer/common;
        deno = deno / common;
    }
    
    public static int getGDC(int x, int y){
        int LargeCommonFactor = 0;
        
        for (int i = 1; i <= y; i++) {
            if ((x % i == 0) && (y %  i == 0)) {
                int newNumer = x / i;
                int newDeno = y / i;
                LargeCommonFactor = i;
            }
        }
        return LargeCommonFactor;
    }
    
    public static void main(String[] args) {
        ClassesAndMethodsDenominator num1 = new ClassesAndMethodsDenominator();
        
        
        
//      ClassesAndMethodsDenominator num2 = new ClassesAndMethodsDenominator(3, 5);
        
//        
//        System.out.println("Heyy");
//        System.out.println("You look beautiful :)");
//        System.out.println("You are amazing!!");
//        System.out.println("Thank you for everything!");
//        System.out.println("Lots of Hugs :)");
//        System.out.println("With love Luke");
//        
//        
//        System.out.println("wasup");
//        
//        System.out.println("hey handsome");  //@becks
    }
    
}
