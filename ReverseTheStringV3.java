import java.util.Scanner;

public class ReverseTheStringV3 {

	private static String ReverseString(String theSentence) {
		String theSentenceSubString = "";
		char lastCharactureOfString;
		String reverse = "" ;
		
		
		if (theSentence.length() > 0) {
			theSentenceSubString = theSentence.substring(0, theSentence.length() - 1);
			//reverse = reverse + theSentenceSubString;
			ReverseString(theSentenceSubString);
			
			
			lastCharactureOfString = theSentence.charAt(theSentence.length() - 1);
			reverse = reverse + lastCharactureOfString;
		}
		//System.out.println(reverse);
		return reverse;
		
	}
	
	public static void main(String[] args) {
		// Create scanner object
        Scanner input = new Scanner(System.in);
		
		System.out.println("put a sentence to reverse");
		String theSentence = input.nextLine();
		
		String lastSentence = ReverseString(theSentence);
		
		System.out.println(lastSentence);
	}

}
