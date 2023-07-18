// You are given two arrays, arr1 and arr2, of the same length. 
// The elements in arr2 are the elements of arr1 rotated by some number of positions to the right. 
// Your task is to write a function that checks if arr2 is a rotation of arr1.
// For example, given arr1 = [1, 2, 3, 4, 5] and arr2 = [4, 5, 1, 2, 3], 
// the function should return true since arr2 is a rotation of arr1 by 2 positions.

import java.util.Arrays;

public class ArrayRotationChecker {
    public static boolean isRotation(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }
        // if array is unsorted return false or sort the array
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                return false;
            }
        }

        int index = -1;

        // Find the index of the first element of arr1 in arr2
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == arr1[0]) {
                index = i;
                break;
            }
        }

        // If the first element of arr1 is not found in arr2, return false
        if (index == -1) {
            return false;
        }

        // Check if arr2 is a rotation of arr1 by comparing the elements
        for (int i = 0; i < arr1.length; i++) {
            int j = (index + i) % arr1.length;
            if (arr1[i] != arr2[j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 1, 2, 3 };

        boolean isRotation = isRotation(arr1, arr2);

        System.out.println("Is arr2 a rotation of arr1? " + isRotation);
    }
}