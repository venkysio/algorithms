/*Java program for stack operations using linked list*/
/*The operations are Insert,Delete, Search, Destroy*/
import java.util.Scanner;
public class QueueList {
	static Scanner sc=new Scanner(System.in);
	//Class to hold the structure of nodes
	 private static class Node{
		int data;
		Node next;
	}
	//Front end of queue
	static Node front=null;
	//Rear end of queue
	static Node rear=null;
	//Function to insert element onto the queue
	public static void insert() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		Node temp=new Node();//making use of temporary node to insert 
		temp.data=element;
		temp.next=null;
		if(front==null) {//Initially updating front and rear to the first element inserted
			front=temp;
			rear=temp;
		}
		else {//Inserting element and updating rear
			rear.next=temp;
			rear=temp;
		}
		printQueue();
	}
	//Function to delete element from the queue
	public static void delete() {
		
		if(rear==null) {//Checking whether the queue is empty
			System.out.println("Queue is empty!!");
		}
		else {
			int element=front.data;
			front=front.next;//Deleting element at front and updating front
			System.out.println("The deleted element is:"+element);
		}
	
		
	}
	//Function to search element in the queue
	public static void search() {
		if(rear==null) {//Checking whether the queue is empty
			System.out.println("Queue is empty!!, Insert elements to search");
		}
		
		else {
			Node temp=front;
			int flag=0;//For marking presence of elements
			
				//Looping through out the list to find the element
				System.out.println("Please Enter element to serach:");
				int element=sc.nextInt();
				while(temp!=null) {
				if(temp.data==element)
					{
					System.out.println("Element is present in the queue");
					flag=1;
					break;
					}
				temp=temp.next;
			}
			if(flag==0) {
				System.out.println("Element is not present in the queue");
			}
			
		}
	}
	//Function to destroy queue
	public static void destroy() {
		front=null;
		rear=null;
		System.out.println("Queue is destroyed");
	}
	
	//Function to print the Queue			
		public static void printQueue() {
					System.out.println("Now the queue is");
					if(rear == null)
					      System.out.println("Queue is Empty!!!");
					
					Node temp=front;
					while(temp!=null) {
						System.out.println(temp.data);
						temp=temp.next;
					}
					
				}

	public static void userInput() {
			System.out.println("Please Enter queue operation from:");
			System.out.println("Insert Delete Search Destroy" );
			String choice=sc.next();
			switch(choice) {
			case "Insert":
			case "insert":
				insert();break;
			case "Delete":
			case "delete":
				delete();break;
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
		userInput();//Taking user input to perform queue operations
	}
}
