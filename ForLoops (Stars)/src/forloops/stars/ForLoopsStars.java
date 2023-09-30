
package forloops.stars;
import java.util.Scanner;

public class ForLoopsStars {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("This is a star diagram.");
        }
        
        System.out.println("Please input the number of rows: ");
        int num = keyboard.nextInt();
        
        for (int rows = 1; rows <= num; rows++) {
            
            for (int star = 1; star <= rows; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
