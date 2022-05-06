/*Java program for Simple sorting*/

import java.util.*;
public class SimpleSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	//Function to perform simple sorting
	public static void sort() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (a[i] < a[j]) 
					swapElementsAt(i,j);
			}
		}
	}
	//Function to swap the elements of array
	public static void swapElementsAt(int i,int j) {
			int temp=a[i];
	     	a[i]=a[j];
	     	a[j]=temp;
	}
	
	//Function to take user input
	public static void userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter numbers to sort:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	}
	//Function to print output
	public static void printOutput() {
		System.out.println("The sorted order is:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String args[]) {
		userInput();//Taking user input
		sort();//Call to sort the array
		printOutput();//Printing output
	}
}

		
		


