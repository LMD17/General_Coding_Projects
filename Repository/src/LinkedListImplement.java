import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImplement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                 //create scanner object
        LinkedList<Integer> linkedList = new LinkedList<>();    //create LinkedList object

        //add elements to the linkedList
        linkedList.add(65);
        linkedList.add(30);
        linkedList.add(74);
        linkedList.add(52);
        linkedList.add(41);
        linkedList.add(69);
        linkedList.add(10);
        linkedList.add(30);
        linkedList.add(11);
        linkedList.add(21);
        linkedList.add(14);


        System.out.print("Enter an element to search for (-1 to stop): ");
        int value = input.nextInt();    //user inputs value to search for

        //while loop to iterate until user enters -1
        while (value != -1) {
            boolean found = false;      //set 'found' variable to false
            System.out.println("In " + linkedList);
            //for loop to iterate through the linked list
            for (int e : linkedList) {
                if (e == value) {
                    found = true;   //set found to true
                    break;          //break from for loop
                }
            }
            //output depending on whether value was found
            if (found)
                System.out.println(value + " Was found");
            else
                System.out.println(value + " was NOT found");

            //ask user to enter the next value
            System.out.print("\nEnter an element to search for (-1 to stop): ");
            value = input.nextInt();    //get user input
        }
    }
}

