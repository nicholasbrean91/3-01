import java.util.Scanner;
public class ReverseString {
	
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter in a String you want to be reversed:");
		String initialString = userInput.nextLine();
		String reversedString = reverseString(initialString);
		System.out.println("The reversed version is " + initialString);
	}

	public static String reverseString(String theSentence) {
		char lastCharOfString;
		if (theSentence.length() > 0) {
			//substring(int startIndex, int endIndex)
			theSentence = theSentence.substring(0, theSentence.length() - 1);
			reverseString(theSentence);
      
		}
		lastCharOfString = (theSentence.subchar(theSentence.length() - 1, 1));
		return theSentence;
	}
}
