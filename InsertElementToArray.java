package ArrayChallenge;

import java.util.Arrays;

public class InsertElementToArray {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5}; 
        int elementToInsert = 10; 
        int indexToInsert = 2; 

        System.out.println("Original array: " + Arrays.toString(array));

        
        if (indexToInsert >= 0 && indexToInsert <= array.length) {
            
            int[] newArray = new int[array.length + 1];

            
            for (int i = 0; i < indexToInsert; i++) {
                newArray[i] = array[i];
            }

            
            newArray[indexToInsert] = elementToInsert;

            
            for (int i = indexToInsert + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }

            
            array = newArray;

            System.out.println("Array after inserting " + elementToInsert + " at index " + indexToInsert + ": " + Arrays.toString(array));
        } else {
            System.out.println("Index " + indexToInsert + " is out of bounds.");
        }

	}

}
