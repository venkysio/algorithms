/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program to find the element in an array using Binary serach*/
import java.util.Scanner;

public class VSDBinarySearch {
	static Scanner sc= new Scanner(System.in);
	static int n;//Size of array
	static int arr[];
	static int f;//Element to be serached
	//Function to take userinput
	public static void VSDuserInput() {
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
	//Function to perform Binary search
	public static int VSDbinarySearch(int l,int r) {
		if(l<=r) {int mid = l+(r-l)/2;
		if(arr[mid]==f)return mid;
		else if(arr[mid]<f)VSDbinarySearch(l,mid-1);
		else if(arr[mid]>f)VSDbinarySearch(mid+1,r);
		}
		
		return -1;
	}
	public static void main(String[] args) {
		VSDuserInput();
		int n=VSDbinarySearch(0,arr.length);
		if(n==-1)System.out.println("The given element is not found");
		else System.out.println("The given element is found at index: "+n);
	}
}

