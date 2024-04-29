package ArrayChallenge;

public class OddEvenPrinter {

	public static void main(String[] args) {

int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        
        System.out.println("Odd numbers:");
       
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        
        System.out.println("Even numbers:");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

	}

}
