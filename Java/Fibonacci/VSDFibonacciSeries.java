/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java Program to print the Fibonacci series up to given limit using iterartion*/
import java.util.Scanner;
public class VSDFibonacciSeries{
	//Function to take user input
	public static int VSDuserInput() {
		System.out.println("Enter limit");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		return l;
	}
	//Function to print the fibonacci series
	public static void VSDfibonacci(int limit) {
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<limit;i++) {
			int temp=num1+num2;
			System.out.println(temp);
			num1=num2;
			num2=temp;
			
		}
	}
public static void main(String args[]) {
	int limit=VSDuserInput();
	System.out.println("Fibonacci Series:");
	VSDfibonacci(limit);
}
}

