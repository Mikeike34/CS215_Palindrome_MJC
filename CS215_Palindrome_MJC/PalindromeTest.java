import java.util.Stack;
public class PalindromeTest {
	
	String input;
	
	public PalindromeTest(String input){
		this.input = input;
		input = input.toLowerCase().replaceAll("\\W", ""); //converting the input String to lowercase and removing any spaces and punctuation by replacing them with nothing("")
		
		Stack<Character> stack = new Stack<Character>(); //created a stack data structure
		
		//using  a for-loop to input each character of the String into a stack
		for(int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}//end for
		
		//instantiate new String variable to hold the reverse order of input
		String reverseInput = "";
		
		//using a while loop to take each character from the top of the stack and assign it to reverseInput
		while(!stack.isEmpty()) {
			reverseInput += stack.pop();
		}//end while
		
		//checking for equality between input and reverseInput
		if(input.equals(reverseInput))
			System.out.println(input + " is a palindrome.");
		else 
			System.out.println(input + " is NOT a palindrome.");
	}//end constructor
	
	public static void main(String[] args) {
		//Testing a simple Palindrome
		System.out.println("========Test 1========\n");
		PalindromeTest word1 = new PalindromeTest("racecar");
		
		//Testing a Palindrome that is also a phrase(includes punctuation and spacing).
		System.out.println("\n========Test 2========\n");
		PalindromeTest word2 = new PalindromeTest("A man, A plan, A canal: Panama");
		
		//testing an non-palindrome
		System.out.println("\n========Test 3========\n");
		PalindromeTest word3 = new PalindromeTest("Fantastic");
		
		
	}//end main

}//end class
