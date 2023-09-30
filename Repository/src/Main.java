//Imports
import java.util.Arrays;
import java.util.Comparator;

//Main class contains main method
public class Main {
    public static void main(String[] args) {

        //Create two input arrays containing their respective elements (as in the question)
        Integer[] inputArray1 = {1, 3, 5, 7};
        Integer[] inputArray2 = {2, 4, 6, 8};

        //create third sorted array that contains both input arrays
        Integer[] outputArray = new Integer[inputArray1.length + inputArray2.length];

        //Display both input arrays
        System.out.println("Input array 1: " + Arrays.toString(inputArray1));
        System.out.println("Input array 2: " + Arrays.toString(inputArray2));

        //Create DefaultComparator object
        DefaultComparator<Integer> comparator = new DefaultComparator<>();


        //perform merge method on the arrays to get new sorted array including all elements from the input arrays
        MergeSort.merge(inputArray1, inputArray2, outputArray, comparator);
        //Display the new sorted array (output array
        System.out.println("Output array: " + Arrays.toString(outputArray));


    }


}

//MergeSort class
class MergeSort {

    //-------- support for top-down merge-sort of arrays --------

    /**
     * Merge contents of arrays S1 and S2 into properly sized array S.
     */
    public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
                S[i + j] = S1[i++];                     // copy ith element of S1 and increment i
            else
                S[i + j] = S2[j++];                     // copy jth element of S2 and increment j
        }
    }

}

//DefaultComparator Class
//Comparator based on the compareTo method of a Comparable element type.
class DefaultComparator<E> implements Comparator<E> {

    //Compares two elements.
    public int compare(E a, E b) throws ClassCastException {
        return ((Comparable<E>) a).compareTo(b);
    }
}



