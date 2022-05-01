/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Merge sort*/
import java.util.Scanner;

public class VSDMergeSort {
	static int Vsdsize;//size of array
	static int Vsdarray[];//array of numbers to be sorted
	
	static void Vsdmerge(int l, int r)
	{
		if(l<r) {
			int m =l+(r-l)/2;
			//Recursively calling merge method to divide the array
			Vsdmerge(l,m);
			Vsdmerge(m+1,r);
			//Combines the divided array pieces in sorted order
			VsdMergesort(l,m,r);
		}
	}
	 
   static void VsdMergesort(int l, int m, int r){
	   //Assigning sizes for temporary arrays
	   	int n1 = m-l+1;
        int n2 = r-m;
        //Temporary arrays to sort divided elements
        int Left[] = new int[n1];
        int Right[] = new int[n2];
        //Assigning elements
        for (int i=0;i<n1;i++)
            Left[i] = Vsdarray[l + i];
        for (int j=0;j<n2;j++)
            Right[j] = Vsdarray[m+1+j];
        //Initial indexes to sort elements using temporary arrays
        int i = 0,j = 0;
        //Index for original array
        int k = l;
        //Comparing elements to arrange them in sorted order in original array
        while (i<n1 && j<n2) {
            if (Left[i]<=Right[j]) {
                Vsdarray[k]=Left[i];
                i++;
            }
            else {
                Vsdarray[k]=Right[j];
                j++;
            }
            k++;
        }
        //Arranging remaining elements from left array
        while (i < n1) {
           Vsdarray[k]=Left[i];
            i++;
            k++;
        }
      //Arranging remaining elements from right array
        while (j < n2) {
            Vsdarray[k]=Right[j];
            j++;
            k++;
        }
        
    }
   //Function to take user input
public static void VsduserInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	Vsdsize=sc.nextInt();
	Vsdarray=new int[Vsdsize];
	System.out.println("Enter numbers to sort:");
	for(int i=0;i<Vsdsize;i++) {
		Vsdarray[i]=sc.nextInt();
	}
}
//Function to print output
public static void VsdprintOutput() {
	System.out.println("The sorted order is:");
	for(int i=0;i<Vsdsize;i++) {
		System.out.println(Vsdarray[i]);
	}
}
public static void main(String args[]) {
	VsduserInput();//Taking user input
	Vsdmerge(0,Vsdsize-1);//Calling merge for the entire array
	VsdprintOutput();//Printing output
}
}
