package com.oracle.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            /*
            i > 0: we haven't hit the first of the array
            arr[i-1] > newElement: keep traversing as long as the element we are looking at in
            traversing is greater than the new element we want to insert

             */
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }

            arr[i] = newElement;
        }

        UtilFunctions.print(arr);
    }
}
