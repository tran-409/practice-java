package reverseNames;


public class reverseWord {

	public static void main(String[] args) {
		String emptyString = "";
		String words = "My name is tu!";
		
		
		String [] array = words.split(" ");
		
		
		for(int i = array.length - 1; i >= 0; i--) {
			emptyString = emptyString + array[i] + " ";
		}
		System.out.println("Reversed: " + emptyString);
	}

}
