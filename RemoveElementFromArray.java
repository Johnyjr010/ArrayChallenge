package ArrayChallenge;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5}; 
        int elementToRemove = 3; 

        System.out.println("Original array: " + Arrays.toString(array));

        
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        
        if (indexToRemove != -1) {
            
            for (int i = indexToRemove; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            
            array = Arrays.copyOf(array, array.length - 1);

            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
        } else {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        }

	}

}
