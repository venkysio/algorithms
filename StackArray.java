/*Java program for stack operations using array*/
/*The operations are Create, Insert,Delete, Search, Destroy*/
import java.util.Scanner;

public class StackArray {
	static Scanner sc=new Scanner(System.in);
	
	static int size;//size of stack
	static int stack[];//stack array
	static int top=-1;//top of the stack
	
	//Function to create a stack
			public static void createStack() {
				System.out.println("Enter size of stack");
				size=sc.nextInt();
				stack=new int[size];
			}
			
	//Function to insert element into the stack
			public static void push() {
				if(stack==null)//Checking whether the stack exists or not
				{
					System.out.println("Stack doesnot exist, Create the stack");
					return;
				}
				if(top==size-1) //Checking for stack overflow
					System.out.println("Cannot insert the element, Stack is full");
				else
				{
					System.out.println("Please Enter element to insert:");
					int element=sc.nextInt();
					stack[++top]=element;//Inserting the element and updating the top
				}
				printStack();
			}
	//Function to delete element into the stack
			public static void pop() {
				if(stack==null)//Checking whether the stack exists or not
					{
					System.out.println("Stack doesnot exist, Create the stack");
					return;
					}
				if(top==-1)//Checking if stack is empty
					System.out.println("Stack is empty");
				else
				{
					int element=stack[top];
					top--;	//Deleting the element and updating the top
					System.out.println("The deleted element is:"+element);
					
				}
				
			}
	//Function to search element in stack
			public static void search() {
				if(stack==null)//Checking whether the stack exists or not 
					{
					System.out.println("Stack doesnot exist, Create the stack");
					return;
					}
				if(top==-1)//Checking if stack is empty
					System.out.println("Stack is empty");
				else
				{
					System.out.println("Please Enter element to serach:");
					int element=sc.nextInt();
					int flag=0;//For marking presence of elements
					for(int i=0;i<=top;i++) {
						if(element==stack[i]) {
							System.out.println("Element is present at index: "+i);
							flag=1;
						}
					}
					if(flag==0)System.out.println("Element is not present in stack");
				}
				
			}
				
				
			
	//Function to destroy stack
			public static void destroy() {
				stack=null;
				System.out.println("Stack is destroyed");
			}
			
	//Function to print the stack			
	public static void printStack() {
				System.out.println("Now the stack is");
				if(top == -1)
				      System.out.println("Stack is Empty!!!");
				for(int i=top; i>=0; i--)
					 System.out.println(stack[i]);
				
			}
	//Function to take user input
	public static void userInput() {
		System.out.println("Please Enter stack operation from:");
		System.out.println("Create Insert Delete Search Destroy" );
		String choice=sc.next();
		switch(choice) {
		case "Create":
		case "create":
			createStack();break;
		case "Insert":
		case "insert":
			push();break;
		case "Delete":
		case "delete":
			pop();break;
		case "Search":
		case "search":
			search();break;
		case "Destroy":
		case "destroy":
			destroy();break;
		}
		userChoice();
	}
	public static void userChoice() {
		System.out.println("For performing operations enter y else enter n");
		char ch=sc.next().charAt(0);
		if(ch=='Y'||ch=='y')
			userInput();
		else return;
	}
public static void main(String args[]) {
	createStack();//Creating stack initially
	userInput();//Taking user input to perform stack operations
}
}
