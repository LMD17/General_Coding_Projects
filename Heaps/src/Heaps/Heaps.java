package Heaps;

import java.util.ArrayList;

public class Heaps {

    //method to insert an element
    public void insert(ArrayList<Integer> aList, int newInsert) {
        int size = aList.size();
        if (size == 0)
            aList.add(newInsert);
        else {
            aList.add(newInsert);
            for (int i = size / 2 - 1; i >= 1; i--) {   //!!!!please explain for loop ma'am
                heapify(aList, i);
            }
        }

    }

    private ArrayList<Integer> heapify(ArrayList<Integer> list, int i) {
        int size = list.size();

        //get largest value, left hand and right hand
        int max = i;
        int left = 2 * i;
        int right = 2 * i + 2;

        if (left < size && list.get(left) > list.get(right))
            max = left;

        if (right < size && list.get(right) > list.get(right))
            max = right;

        //lets say that root is not the largest
        if (max != i) {
            int temp = list.get(max);
            list.set(max, list.get(i));
            list.set(i, temp);
        }
        return list;
    }

    public void deleteNode(ArrayList<Integer> aList, int newDel) {

        int d = aList.size();
        int i;
        for (i = 0; i < d; i++) {
            if (newDel == aList.get(i)) {
                break;
            }
        }
        int temp = aList.get(i);
        aList.set(i, aList.get(d-1));   //element to delete gets replaced with last element at that position (i)

        aList.set(d-1, temp);       //last element gets element to delete
        aList.remove(d-1);  //remove last element (which is element to delete)

        //now heapify
        for (int k = 0; k < d/2-1;  k--){
            heapify(aList, k);
        }
    }


    //method to delete an element
    //method to display the tree (heap)
    //Method to heapify
    public static void main(String[] args) {

        //create the tree
        ArrayList<Integer> arrrayList = new ArrayList<>();

        //Populate arrayList


    }
}