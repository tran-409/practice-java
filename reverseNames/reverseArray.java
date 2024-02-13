package reverseNames;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int [] number = {1, 2, 3, 4, 5, 6 };
		rotateArrayLeft(number);
		rotateArrayRight(number);
		Arrays.stream(number).forEach(System.out::println);

	}
	
	public static void rotateArrayLeft(int [] arrayNumbers) {
		int temporary = arrayNumbers[0];
		for (int i = 0; i < arrayNumbers.length - 1; i++) {
			
			// [2, 3, 4, 5, 6, 6]
			arrayNumbers[i] = arrayNumbers[i+1];
		}
		arrayNumbers[arrayNumbers.length - 1] = temporary;
 	}
	
	public static void rotateArrayRight(int [] arrayNumbers) {
		int temporary = arrayNumbers[arrayNumbers.length - 1];
		for (int i = arrayNumbers.length - 1; i > 0; i--) {
			// [1, 1, 2, 3, 4, 5]
			arrayNumbers[i] = arrayNumbers[i - 1];
		}
		arrayNumbers[0] = temporary;
	}
	

}
