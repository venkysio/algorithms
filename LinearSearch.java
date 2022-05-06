/*Java program to find the element in an array using linear serach*/
import java.util.Scanner;

public class LinearSearch {
	static Scanner sc= new Scanner(System.in);
	static int n;//Size of array
	static int arr[];
	static int f;//Element to be serached
	//Function to take userinput
	public static void userInput() {
		System.out.println("Enter size");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter search element");
		f=sc.nextInt();
		
	}
	//Function to perform linear search
	public static boolean linearSearch() {
		boolean flag=false;
		//Iterating through the array until the element is found
		for(int i=0;i<n;i++) {
			if(arr[i]==f) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		userInput();
		boolean b=linearSearch();
		if(b==true)System.out.println("The given element is found");
		else System.out.println("The given element is not found");
	}
}
