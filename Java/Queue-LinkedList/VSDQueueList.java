/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for stack operations using linked list*/
/*The operations are Insert,Delete, Search, Destroy*/
import java.util.Scanner;
public class VSDQueueList {
	static Scanner sc=new Scanner(System.in);
	//Class to hold the structure of nodes
	 private static class VSDNode{
		int data;
		VSDNode next;
	}
	//Front end of queue
	static VSDNode front=null;
	//Rear end of queue
	static VSDNode rear=null;
	//Function to insert element onto the queue
	public static void VSDinsert() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		VSDNode temp=new VSDNode();//making use of temporary node to insert 
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
		VSDprintQueue();
	}
	//Function to delete element from the queue
	public static void VSDdelete() {
		
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
	public static void VSDsearch() {
		if(rear==null) {//Checking whether the queue is empty
			System.out.println("Queue is empty!!, Insert elements to search");
		}
		
		else {
			VSDNode temp=front;
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
	public static void VSDdestroy() {
		front=null;
		rear=null;
		System.out.println("Queue is destroyed");
	}
	
	//Function to print the Queue			
		public static void VSDprintQueue() {
					System.out.println("Now the queue is");
					if(rear == null)
					      System.out.println("Queue is Empty!!!");
					
					VSDNode temp=front;
					while(temp!=null) {
						System.out.println(temp.data);
						temp=temp.next;
					}
					
				}

	public static void VSDuserInput() {
			System.out.println("Please Enter queue operation from:");
			System.out.println("Insert Delete Search Destroy" );
			String choice=sc.next();
			switch(choice) {
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
		VSDuserInput();//Taking user input to perform queue operations
	}
}
