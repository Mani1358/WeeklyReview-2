package com.Java.weeklyreview2;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 4, 8, 5};
        System.out.println("Duplicate Elements in the Given Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
