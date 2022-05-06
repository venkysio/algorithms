/*Java program for Bubble sort*/

import java.util.Scanner;

public class BubbleSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	
	//Function to perform Bubble sort
	public static void sort() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if (a[j]>a[j+1]) 
					swapElementsAt(j+1,j);//Swapping to place higher element correctly
			}
		}
	}
	//Function to swap the elements of array
	public static void swapElementsAt(int t1,int t2) {
		int temp=a[t1];
     	a[t1]=a[t2];
     	a[t2]=temp;
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
