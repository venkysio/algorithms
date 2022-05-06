/*Java program to check whether the given sting is palindrome or not*/
import java.util.Scanner;
public class Palindrome {
	//Function to take user input
	public static String userInput() {
		System.out.println("Enter String to check for palindrome");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		return s;
	}
	//Function to compute reverse of given string and return boolean value by matching it against original string
	public static boolean ispalindrome(String s) {
		boolean b;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if (rev.equals(s))b=true;
		else b=false;
		return b;
	}
public static void main(String args[]) {
	String s=userInput();
	boolean b=ispalindrome(s);
	if(b)System.out.println("Palindrome");
	else System.out.println("Not a Palindrome");
}
}
