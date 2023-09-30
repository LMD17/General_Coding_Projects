package Sorting;


public class Main {
    public static void main(String[] args) {

//        int[] data = {23, 56, 23, 45, 78, 90, 67, 34, 88, 34, 56, 90, 43, 67};
//        //Display UNsorted array
//        displayArray("UNsorted array", data);


//-------------------QUICK SORT--------------------------//

//        quickSort(data, 0, data.length-1);      //call quickSort method on the array
//        //Display sorted array
//        displayArray("QUICK SORT", data);


////-------------------INSERTION SORT--------------------------//
//        insertionSort(data);        //call insertionSort method on the array
//        displayArray("INSERTION", data);


//-------------------COUNT SORT--------------------------//

        char letters[] = {'d', 'a', 't', 'a', 's', 't', 'u', 'c', 't', 'u', 'r', 'e'};
        countSort(letters);
        System.out.println("\n\nCOUNT SORT --> Sorted array: ");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + ", ");
        }

//use if you want to get user input
//        Scanner input = new Scanner(System.in); //create scanner object
//
//        //get size of array from the user
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
//
//        //declare array
//        int data[] = new int[size];
//
//        System.out.println("Enter " + size + " values");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter value " + (i+1) + ": ");
//            data[i] = input.nextInt();
//        }

//-------------------SELECTION SORT--------------------------//

//        for (int i = 0; i < data.length; i++) {
//            //set the minimum index to the first value
//            int min = i;
//
//            //from that index i --> iterate over the array
//            for (int j = i + 1; j < data.length; j++){
//                //again find the min element
//                if (data[j] < data[min])
//                    min = j;
//
//                //swapping min with the minIndex so the element takes a proper position
//                int temp = data[min];
//                data[min] = data[i];
//                data[i] = temp;
//            }
//        }
//        //Display sorted array
//        displayArray("SELECTION", data);

    }

    public static void displayArray(String sortType, int[] array) {
        System.out.println("\n\n" + sortType + " SORT --> Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


    //QuickSort method (a method is required due to recursion
    public static void quickSort(int[] unsortedArray, int start, int end) {

        if (start < end) {

            int pivot = arrayPartition(unsortedArray, start, end);
            quickSort(unsortedArray, start, pivot - 1);
            quickSort(unsortedArray, pivot + 1, end);
        }
    }

    public static int arrayPartition(int[] array, int start, int end) {


        int pivot = array[end];     //select right mist element as your pivot
        int i = start - 1;

        for (int element = start; element < end; element++) {
            if (array[element] <= pivot) {        //if less then swap elements
                i++;
                int temp = array[i];
                array[i] = array[element];
                array[element] = temp;

            }
        }
        //swapping the elements
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }


    //InsertionSort method

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {        //begin with the second character
            int key = array[i];     //time to insert key = array[i]
            int j = i;      //find correct index j for key

            //move the elements that are greater than that value to be one position on top of that current position

            while ((j > 0) && (array[j-1] > key)) { //thus array[j-1] must go after key
                array[j] = array[j-1];      //slide array[j-1] rightward
                j--;              //consider previous j for key
            }

            //place the element at its correct position
            array[j] = key;
        }
    }

    //CountSort method (ma'am)
    public static void countSort(char[] letters) {

        //what is the size
        int numChar = letters.length;
        char outputVal[] = new char[numChar];

        //define the array that will hold the integer values of the letters
        int counter[] = new int[528];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
        }

        for (int j = 0; j < numChar; ++j) {
            ++counter[letters[j]];
            for (int z = 1; z < counter.length; ++z) {
                counter[z] += counter[z - 1];
            }
            for (int z = numChar - 1; z >= 0; z--) {
                outputVal[counter[letters[z]] - 1] = letters[z];
                --counter[letters[z]];
            }
            for (int z = 0; z < numChar; z++) {
                letters[z] = outputVal[z];
            }
        }
    }




/////Koketso google resource: *you need to sort this out...*
    class CountingSort {
        void sort(char arr[]) {
            int n = arr.length;
// The output character array that will have sorted arr
            char output[] = new char[n];
// Create a count array to store count of individual
// characters and initialize count array as 0
            int count[] = new int[256];
            for (int i = 0; i < 256; ++i)
                count[i] = 0;
// store count of each character
            for (int i = 0; i < n; ++i)
                ++count[arr[i]];
// Change count[i] so that count[i] now contains actual
// position of this character in output array
            for (int i = 1; i <= 255; ++i)
                count[i] += count[i - 1];
// Build the output character array
// To make it stable we are operating in reverse order.
            for (int i = n - 1; i >= 0; i--) {
                output[count[arr[i]] - 1] = arr[i];
                --count[arr[i]];
            }
// Copy the output array to arr, so that arr now
// contains sorted characters
            for (int i = 0; i < n; ++i)
                arr[i] = output[i];
        }

        // Driver method
        public static void main(String args[]) {
            CountingSort ob = new CountingSort();
            char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
            ob.sort(arr);
            System.out.print("Sorted character array is ");
            for (int i = 0; i < arr.length; ++i)
                System.out.print(arr[i]);
        }
    }


}