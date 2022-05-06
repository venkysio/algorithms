/*Java program for stack operations using linked list*/
/*The operations are Insert,Delete, Search, Destroy*/
import java.util.Scanner;
public class StackList {
	static Scanner sc=new Scanner(System.in);
	//Class to hold the structure of nodes
	 private static class Node{
		int data;
		Node next;
	}
	//Top of the stack
	static Node top=null;
	//Function to insert element onto the stack
	public static void push() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		Node temp=new Node();//making use of temporary node to insert 
		temp.data=element;
		if(top==null) {//Initially updating top to the first element inserted
			temp.next=null;
			top=temp;
		}
		else {//Inserting element and updating top
			temp.next=top;
			top=temp;
		}
		printStack();
	}
	//Function to delete element from the stack
	public static void pop() {
		
		if(top==null) {//Checking whether the stack is empty
			System.out.println("Stack is empty!!");
		}
		else {
			int element=top.data;
			top=top.next;//Deleting element at top and updating top
			System.out.println("The deleted element is:"+element);
		}
	
		
	}
	//Function to search element in the stack
	public static void search() {
		if(top==null) {//Checking whether the stack is empty
			System.out.println("Stack is empty!!, Insert elements to search");
		}
		
		else {
			Node temp=top;
			int flag=0;//For marking presence of elements
			
				//Looping through out the list to find the element
				System.out.println("Please Enter element to serach:");
				int element=sc.nextInt();
				while(temp!=null) {
				if(temp.data==element)
					{
					System.out.println("Element is present in the stack");
					flag=1;
					break;
					}
				temp=temp.next;
			}
			if(flag==0) {
				System.out.println("Element is not present in the stack");
			}
			
		}
	}
	//Function to destroy stack
	public static void destroy() {
		top=null;
		System.out.println("Stack is destroyed");
	}
	
	//Function to print the stack			
		public static void printStack() {
					System.out.println("Now the stack is");
					if(top == null)
					      System.out.println("Stack is Empty!!!");
					
					Node temp=top;
					while(temp!=null) {
						System.out.println(temp.data);
						temp=temp.next;
					}
					
				}

	public static void userInput() {
			System.out.println("Please Enter stack operation from:");
			System.out.println("Insert Delete Search Destroy" );
			String choice=sc.next();
			switch(choice) {
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
		userInput();//Taking user input to perform stack operations
	}
}
