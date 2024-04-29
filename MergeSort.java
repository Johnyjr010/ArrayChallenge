package ArrayChallenge;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array 1:");
        int size = scn.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter size of array 2:");
        int size2 = scn.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Array after merge:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
