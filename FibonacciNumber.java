/*Java Program to print the Fibonacci number */
import java.util.Scanner;
public class FibonacciNumber{
	//Function to take user input
	public static int userInput() {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		return n;
	}
	//Function to compute fibonaaci number at given place using recursion
	public static int fib(int num) {
		if(num<=1) {
			return 0;
		}
		else if(num==2)
			return 1;
		else return fib(num-1)+fib(num-2);
	}
public static void main(String args[]) {
	int num=userInput();
	System.out.println("The "+num+" fibonacci number in series is: ");
	System.out.println(fib(num));
}
}
