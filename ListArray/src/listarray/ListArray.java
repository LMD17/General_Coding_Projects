//Array list methods
package listarray;

import java.util.*;  //* imports the whole package 

public class ListArray {

    public static void main(String[] args) {
        
        //ARRAY LIST list iterator (retrieving values useing list iterator
        //Create an Array list of type string
        List<String> myString = new LinkedList<>();
        myString.add("DA");
        myString.add("ANC");
        myString.add("EFF");
        myString.add("IFP");
        

        //This next bit is like the enhanced for loop for arrays
        //Need to instantiate an object of type ListIterator to iterate
        ListIterator<String> myIteration = null;       //myIteration has no value here

        myIteration = myString.listIterator(); //assign myIterations to myString. They are now linked. Now myIteration has a link. hasNext gives myIteration a new element

        //Print the original list
        System.out.println("Here is the original list");
        while (myIteration.hasNext()) {
            System.out.println(myIteration.next());
        }

        //Output list in reverse order
        System.out.println("myString list in reverse order");
        while (myIteration.hasPrevious()) {
            System.out.println(myIteration.previous());
        }

        //ARRAY LIST METHODS
        //1. Declare array list
//        ArrayList<String> collection = new ArrayList<>();
//
//        //populate array list using the methods of ArrayList
//        collection.add("Zambia");
//        collection.add("SA");
//        collection.add("Botswana");
//        collection.add("Malawi");
//
//        System.out.println("The list of the contries is ");
//        System.out.println(collection);
//
//        //check if the colection has a country called Malawi
//        System.out.println("\nIs Malawi in the list: " + collection.contains("Malawi"));
//
//        //Remove an element from the list
//        collection.remove("Malawi");
//        System.out.println("\nThe list after removing Malawi is ");
//        System.out.println(collection);
//        
//        //Size of list
//        System.out.println("\nThe total number of elements in the list is " + collection.size());
    }

}
