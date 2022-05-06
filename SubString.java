/*Java program to find occurrences of substring in a string*/
import java.util.Scanner;

public class SubString {
	//Method to find substring in string
	public static void findSubString(String s, String sub) {
		int flag=0;//To mark the occurrence of string
		//The length of substring must be less than or equal to the length of main string 
		if(sub.length()<=s.length()) {
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)==sub.charAt(0))
			{
				int end=i+sub.length();
				if(end<=s.length()) {
					String temp=s.substring(i,end);
					if(sub.equals(temp)) 
					{
						flag=1;
						System.out.println("Given substring is present at index:"+i);
					}
				}
			}
		}
		if(flag==0)System.out.println("Given substring is  not present");
		}
		else System.out.println("Given substring is  not present");
	}
	public static void userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter main string");
		String s=sc.next();
		System.out.println("Enter sub string");
		String sub=sc.next();
		findSubString(s,sub);
	}
public static void main(String args[]) {
	userInput();//Function to read strings given by user
}
}
