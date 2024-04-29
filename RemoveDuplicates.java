package ArrayChallenge;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
int[] array = {1, 2, 3, 4, 2, 3, 6, 7, 8, 1}; 
        
        int length = array.length;
        
       
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                
                if (array[i] == array[j]) {
                
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }
        
       
        int[] resultArray = Arrays.copyOf(array, length);
        

        System.out.println("Array with duplicates removed: " + Arrays.toString(resultArray));

	}

}
