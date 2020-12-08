//package com.oracle;
//
//import java.util.Arrays;
//
//public class Imp {
//    public static void main(String[] args) {
//        int[] arr = {20, 35, -15, 7, 55, 1, -22};
//        quickSort(arr, 0, arr.length);
//        UtilFunctions.print(arr);
//
//    }
//
//    // quick sort
//    static void quickSort(int arr[], int start, int end) {
//        if (end - start < 2) {
//            return;
//        }
//        int pivotIndex = partition(arr, start, end);
//        quickSort(arr, start, pivotIndex);
//        quickSort(arr, pivotIndex + 1, end);
//    }
//
//    static int partition(int arr[], int start, int end) {
//        int pivot = arr[start];
//        int i = start, j = end;
//        while (j > i) {
//            while ((j > i) && (arr[--j] >= pivot)) ;
//            if (j > i) {
//                arr[i] = arr[j];
//            }
//            while ((j > i) && (arr[++i] <= pivot)) ;
//            if (j > i) {
//                arr[j] = arr[i];
//            }
//        }
//        System.out.println("i: " + i + " | " + "j: " + j);
//        arr[i] = pivot;
//        return i;
//
//    }
//
//}
