/*Java program for Insertion Sort*/

import java.util.Scanner;

public class InsertionSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	//Function to perform Insertion sort
	public static void sort() {
		//Inserting elements while sorting
				for (int i = 1; i < n; ++i)  
				{ 
				//Taking next element
				 int key = a[i]; 
				 int j = i-1; 
				 //Comparing existing elements with new element
				 while (j>=0 && a[j]>key)  
				  { 
				  a[j + 1] = a[j]; //Finding correct place for the new element
				  j = j - 1; 
				  } 
				 a[j + 1] = key; 
				}	
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
