/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for queue operations using array*/
/*The operations are Create, Insert,Delete, Search, Destroy*/
import java.util.Scanner;

public class VSDQueueArray {
static Scanner sc=new Scanner(System.in);
	
	static int size;//size of queue
	static int queue[];//queue array
	static int rear=-1;//rear end of the queue
	static int front=-1;//starting of queue
	
	//Function to create a queue
			public static void VSDcreateQueue() {
				System.out.println("Enter size of queue");
				size=sc.nextInt();
				queue=new int[size];
			}
			
	//Function to insert element into the queue
			public static void VSDinsert() {
				if(queue==null)//Checking whether the queue exists or not
				{
					System.out.println("Queue doesnot exist, Create the queue");
					return;
				}
				if(rear==size-1) //Checking for filled queue
					System.out.println("Cannot insert the element, Queue is full");
				else
				{
					System.out.println("Please Enter element to insert:");
					int element=sc.nextInt();
					queue[++rear]=element;//Inserting the element and updating the rear
					if(front==-1)front++;
				}
				VSDprintQueue();
			}
	//Function to delete element into the queue
			public static void VSDdelete() {
				if(queue==null)//Checking whether the queue exists or not
					{
					System.out.println("Queue doesnot exist, Create the queue");
					return;
					}
				if(rear==-1)//Checking if queue is empty
					System.out.println("Queue is empty");
				else
				{
					int element=queue[front];
					for(int i=front;i<rear;i++) {
						queue[i]=queue[i+1];
					}
					queue[rear]=0;
					rear--;
				
					System.out.println("The deleted element is:"+element);
				}
				
				VSDprintQueue();
				
			}
	//Function to search element in queue
			public static void VSDsearch() {
				if(queue==null)//Checking whether the queue exists or not 
					{
					System.out.println("Queue doesnot exist, Create the queue");
					return;
					}
				if(rear==-1)//Checking if queue is empty
					System.out.println("Queue is empty");
				else
				{
					System.out.println("Please Enter element to serach:");
					int element=sc.nextInt();
					int flag=0;//For marking presence of elements
					for(int i=0;i<=rear;i++) {
						if(element==queue[i]) {
							System.out.println("Element is present at index: "+i);
							flag=1;
						}
					}
					if(flag==0)System.out.println("Element is not present in queue");
				}
				
			}
				
				
			
	//Function to destroy queue
			public static void VSDdestroy() {
				queue=null;
				System.out.println("Queue is destroyed");
			}
			
	//Function to print the Queue			
	public static void VSDprintQueue() {
				System.out.println("Now the queue is");
				if(rear == -1)
				      System.out.println("Queue is Empty!!!");
				for(int i=front;i<=rear; i++)
					 System.out.println(queue[i]);
				
			}
	//Function to take user input
	public static void VSDuserInput() {
		System.out.println("Please Enter queue operation from:");
		System.out.println("Create Insert Delete Search Destroy" );
		String choice=sc.next();
		switch(choice) {
		case "Create":
		case "create":
			VSDcreateQueue();break;
		case "Insert":
		case "insert":
			VSDinsert();break;
		case "Delete":
		case "delete":
			VSDdelete();break;
		case "Search":
		case "search":
			VSDsearch();break;
		case "Destroy":
		case "destroy":
			VSDdestroy();break;
		}
		VSDuserChoice();
	}
	public static void VSDuserChoice() {
		System.out.println("For performing operations enter y else enter n");
		char ch=sc.next().charAt(0);
		if(ch=='Y'||ch=='y')
			VSDuserInput();
		else return;
	}
public static void main(String args[]) {
	VSDcreateQueue();//Creating queue initially
	VSDuserInput();//Taking user input to perform queue operations
}
}
