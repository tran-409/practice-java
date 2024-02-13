package reverseNames;

public class stringBuilder2 {

	public static void main(String[] args) {
		
		String word = "I am the best";
		
		StringBuilder stringbuilder = new StringBuilder(word);
		StringBuilder word1 = stringbuilder.reverse();
		String word2 = word1.toString();
		System.out.println(word2);
		

	}

}
