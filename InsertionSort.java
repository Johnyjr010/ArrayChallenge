package ArrayChallenge;

import java.util.Arrays;

public class InsertionSort {

		
		 public static void main(String[] args) {
		        int[] array = {5, 2, 4, 6, 1, 3};
		        System.out.println("Original Array: " + Arrays.toString(array));

		        insertionSort(array);

		        System.out.println("Sorted Array: " + Arrays.toString(array));
		    }

		    public static void insertionSort(int[] array) {
		        int n = array.length;
		        for (int i = 1; i < n; i++) {
		            int key = array[i];
		            int j = i - 1;
		            while (j >= 0 && array[j] > key) {
		                array[j + 1] = array[j];
		                j = j - 1;
		            }
		            array[j + 1] = key;
		        }
		    }

	}


