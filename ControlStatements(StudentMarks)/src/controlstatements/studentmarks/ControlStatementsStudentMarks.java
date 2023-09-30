/*
This program caputures marks for a certain number of students.
We do not know how many students
The program will tell us the number of students and find the averageof their marks
The program will indicate how many student fot certain grades
*/

package controlstatements.studentmarks;
import java.util.Scanner;

public class ControlStatementsStudentMarks {

    public static void main(String[] args) {
        System.out.println();
        //Declare variables
        int count = 0;
        int mark = 0; //initialize mark for while loop
        int sum = 0;
        int avg;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0;
        //Get the marks from the student
        Scanner input = new Scanner(System.in);
        
        //Ask the user to input the marks
        System.out.println("Enter the mark of student and terminate with -1"); //-1 is sentinel
        mark = input.nextInt();
        
        //while statement to repeat entering of marks and adding sum of marks
        while (mark != -1) 
        {
        count ++;
                
        sum = sum + mark;       //add mark to sum
        
         //switch statement to count grade symbol
        
        switch (mark / 10) {
            case 10:
            case 9:
                aCount ++;
                break;
            case 8:
                bCount ++;
                break;
            case 7:
                cCount ++;
                break;
            case 6:
                dCount ++;
                break;
            case 5:
                eCount ++;
                break;
            default:
                fCount ++;
                break;
        
        }
        System.out.println("Enter the mark of next student or terminate with -1"); //-1 is sentinel
        mark = input.nextInt();
        }
        
        
        
        /**
        //do while to repeat entering marks and adding sum of marks
        do {
        count ++;
        //Ask the user to input the marks
        System.out.println("Enter the mark of student and terminate with -1"); //-1 is sentinel
        mark = input.nextInt();
        
        sum = sum + mark;
        
        //switch statement to count grade symbol
        
        switch (mark / 10) {
            case 10:
            case 9:
                aCount ++;
                break;
            case 8:
                bCount ++;
                break;
            case 7:
                cCount ++;
                break;
            case 6:
                dCount ++;
                break;
            case 5:
                eCount ++;
                break;
            default:
                fCount ++;
                break;
                
        }
        }
       while (mark != -1);
       count --; //to minus sentilel imput from count
       */
        
        
        if (count != 0) 
        {
            System.out.println("Number of students " + count);
            System.out.println("The total of " + count + " students is " + sum);
            avg = sum / count;      //calculate average amrk
            System.out.println("The average of " + count + " students is " + avg);
            System.out.println("Number of A students " + aCount);
            System.out.println("Number of B students " + bCount);
            System.out.println("Number of C students " + cCount);
            System.out.println("Number of D students " + dCount);
            System.out.println("Number of E students " + eCount);
            System.out.println("Number of F students " + fCount);

        }
        else
            System.out.println("You did not enter any marks, therfore average cannot be calculated.");
        
        
    }
    
}
