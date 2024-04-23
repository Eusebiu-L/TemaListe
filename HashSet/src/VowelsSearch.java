import java.util.Arrays;
import java.util.HashSet;

public class VowelsSearch {
	public static boolean vowelsSearch(String str) {
		HashSet <Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
		String lowerCase = str.toLowerCase();
		
		
		for(char ch : lowerCase.toCharArray()) {
			if(vowels.contains(ch)) {
				vowels.remove(ch);
				
			}
			if(vowels.isEmpty()) {
				return true;
			}
		}
		return false;
	
	}

	public static void main(String[] args) {
		String ex1 = "The quick brown fox jumps the lazy dog";
		String ex2 = "Hello, World!";
		
		System.out.println("For first example: " + vowelsSearch(ex1));
		System.out.println("For second example: " + vowelsSearch(ex2));
		

	}

}
