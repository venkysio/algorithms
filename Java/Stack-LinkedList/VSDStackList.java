/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for stack operations using linked list*/
/*The operations are Insert,Delete, Search, Destroy*/
import java.util.Scanner;
public class VSDStackList {
	static Scanner sc=new Scanner(System.in);
	//Class to hold the structure of nodes
	 private static class VSDNode{
		int data;
		VSDNode next;
	}
	//Top of the stack
	static VSDNode top=null;
	//Function to insert element onto the stack
	public static void VSDpush() {
		System.out.println("Please Enter element to insert:");
		int element=sc.nextInt();
		VSDNode temp=new VSDNode();//making use of temporary node to insert 
		temp.data=element;
		if(top==null) {//Initially updating top to the first element inserted
			temp.next=null;
			top=temp;
		}
		else {//Inserting element and updating top
			temp.next=top;
			top=temp;
		}
		VSDprintStack();
	}
	//Function to delete element from the stack
	public static void VSDpop() {
		
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
	public static void VSDsearch() {
		if(top==null) {//Checking whether the stack is empty
			System.out.println("Stack is empty!!, Insert elements to search");
		}
		
		else {
			VSDNode temp=top;
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
	public static void VSDdestroy() {
		top=null;
		System.out.println("Stack is destroyed");
	}
	
	//Function to print the stack			
		public static void VSDprintStack() {
					System.out.println("Now the stack is");
					if(top == null)
					      System.out.println("Stack is Empty!!!");
					
					VSDNode temp=top;
					while(temp!=null) {
						System.out.println(temp.data);
						temp=temp.next;
					}
					
				}

	public static void VSDuserInput() {
			System.out.println("Please Enter stack operation from:");
			System.out.println("Insert Delete Search Destroy" );
			String choice=sc.next();
			switch(choice) {
			case "Insert":
			case "insert":
				VSDpush();break;
			case "Delete":
			case "delete":
				VSDpop();break;
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
		VSDuserInput();//Taking user input to perform stack operations
	}
}
