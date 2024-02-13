package reverseNames;

public class reverseString2 {

	public static void main(String[] args) {

		
		String output = reverse("LooneyTune");
		System.out.println(output);
	}

	private static String reverse(String name) {
		
		char[] letters = new char[name.length()];
		
		int index = 0;
		for(int i = name.length() - 1; i >= 0; i--) {
			letters[index] = name.charAt(i);
			index++;
		}
		
		String reverseName = "";
		for(int i = 0; i < name.length(); i++) {
			reverseName = reverseName + letters[i];
		}
		
		return reverseName;
	}

}
