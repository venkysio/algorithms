/*Java program for Merge sort*/

import java.util.Scanner;

public class MergeSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	
	static void merge(int l, int r)
	{
		if(l<r) {
			int m =l+(r-l)/2;
			//Recursively calling merge method to divide the array
			merge(l,m);
			merge(m+1,r);
			//Combines the divided array pieces in sorted order
			mergesort(l,m,r);
		}
	}
	 
   static void mergesort(int l, int m, int r){
	   //Assigning sizes for temporary arrays
	   	int n1 = m-l+1;
        int n2 = r-m;
        //Temporary arrays to sort divided elements
        int Left[] = new int[n1];
        int Right[] = new int[n2];
        //Assigning elements
        for (int i=0;i<n1;i++)
            Left[i] = a[l + i];
        for (int j=0;j<n2;j++)
            Right[j] = a[m+1+j];
        //Initial indexes to sort elements using temporary arrays
        int i = 0,j = 0;
        //Index for original array
        int k = l;
        //Comparing elements to arrange them in sorted order in original array
        while (i<n1 && j<n2) {
            if (Left[i]<=Right[j]) {
                a[k]=Left[i];
                i++;
            }
            else {
                a[k]=Right[j];
                j++;
            }
            k++;
        }
        //Arranging remaining elements from left array
        while (i < n1) {
            a[k]=Left[i];
            i++;
            k++;
        }
      //Arranging remaining elements from right array
        while (j < n2) {
            a[k]=Right[j];
            j++;
            k++;
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
	merge(0,n-1);//Calling merge for the entire array
	printOutput();//Printing output
}
}
