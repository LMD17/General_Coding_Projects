package arrayspassedtomethods;

public class ArraysPassedToMethods {

    public static void main(String[] args) {
        //PASSING ARRAYS
        //Passing arrays to methods (by value and by reference)
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array.length);

        System.out.println("We are passing the reference to the whole array and then the original values");

        System.out.println("The initial elements in array 'array' are:");
        //Displaying the contents of the Array: 'array';
        for (int value : array) {
            System.out.printf("%d%n", value);
        }
        
        modifyArray(array);      //passing 'array' to method 'modifyArray' by reference

        System.out.println("After passing array by reference. \nHere are the new elements of the array 'array':");
        for (int value : array) {
            System.out.printf("%d%n", value);
        }
        
        //Now we are passing an Element of the array 'array'. We are passing by value --> passing a copy
        //passing the element 5
        System.out.println("\nPassing an element by value:");
        System.out.println("The element value changing not in the original array");
        
        modifyElement(array[4]);    //passing by value (copy of array[4] passed to method 'modifyElement
        
        System.out.println("The value of element array[4] is still " + array[4]);
    }

    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    private static void modifyElement(int element) {
        element *= 2;
        System.out.printf("The new value of the element is %d%n", element);
    }

}
