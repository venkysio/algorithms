/*Java Program to print the Fibonacci series up to given limit using iterartion*/
import java.util.Scanner;
public class FibonacciSeries{
	//Function to take user input
	public static int userInput() {
		System.out.println("Enter limit");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		return l;
	}
	//Function to print the fibonacci series
	public static void fibonacci(int limit) {
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
	int limit=userInput();
	System.out.println("Fibonacci Series:");
	fibonacci(limit);
}
}

