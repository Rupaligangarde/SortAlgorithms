package com.company;

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastIndex = unsortedArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i, i + 1);
                }
            }
        }

        for (int value : unsortedArray
        ) {
            System.out.println(value);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


// O(n*n) : Quadratic