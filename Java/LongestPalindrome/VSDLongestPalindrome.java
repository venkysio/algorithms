/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
//Java program to find the longest palindromic substring in a given string
import java.util.Scanner;

public class VSDLongestPalindrome {
	//Function to check whether the given string is palindrome or not
	//It returns the size of string if it is a palindrome else it returns zero
	public static int VSDisPalindrome(String temp) {
		int size=0;
		String rev="";
		for(int i=temp.length()-1;i>=0;i--) {
			rev+=temp.charAt(i);
		}
		if(rev.equals(temp))size=temp.length();
		else size=0;
		return size;
		
	}
	//Function to find longest palindromic substirng
	public static void VSDfindLongPalindrome(String s) {
		int size=0;
		String ans="";
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				int tempsize=VSDisPalindrome(s.substring(i,j+1));
				if(tempsize>size) {
					size=tempsize;
					ans=s.substring(i,j+1);
					}
			}
		}
		if(size==0)System.out.println("No palindrome exists");
		else
		System.out.println("The longest palindrome is: "+ans+" its size is: "+size);
	}
	//Function to read user input
	public static void VSDuserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.next();
		VSDfindLongPalindrome(s);
	}
public static void main(String args[]) {
	VSDuserInput();
}
}
