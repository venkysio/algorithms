/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java Program to print the Fibonacci number */
import java.util.Scanner;
public class VSDFibonacciNumber{
	//Function to take user input
	public static int VSDuserInput() {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		return n;
	}
	//Function to compute fibonaaci number at given place using recursion
	public static int VSDfib(int num) {
		if(num<=1) {
			return 0;
		}
		else if(num==2)
			return 1;
		else return VSDfib(num-1)+VSDfib(num-2);
	}
public static void main(String args[]) {
	int num=VSDuserInput();
	System.out.println("The "+num+" fibonacci number in series is: ");
	System.out.println(VSDfib(num));
}
}
