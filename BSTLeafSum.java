/*Program to perform leaf sum of  Binary Search Tree*/
import java.util.Scanner;
public class BSTLeafSum {
	static Scanner sc=new Scanner(System.in);
	static int lsum=0;
			//Class to hold the structure of node in a tree
	public static class Node{
			int data;//Holds the value of node
			int count;//Holds the count of duplicate nodes
			Node left;//Holds the left pointer of node
			Node right;//Holds the right pointer of node
			//Default constructor
			Node(int data)
			{
			  this.data =data;
			  this.count=0;
			  this.left = this.right = null;
			}
		}
	//Root node
	static Node root;
	//Function to insert data into BST
	public static Node insert(Node root,int data) 
	{
		if(root==null) root=new Node(data);
		if(data<root.data)root.left=insert(root.left,data);
		else if(data==root.data)root.count+=1;
		else root.right=insert(root.right,data);
		return root;
	}
	//Function to perform sum of leaf nodes
	public static int leafSum(Node current) {
		//Checking if root is null
		if(root==null)lsum=0;
		//Traversing to the left subtree to find leaves
		if(current.left!=null)lsum=leafSum(current.left);
		//Traversing to the right subtree to find leaves
		if(current.right!=null)lsum=leafSum(current.right);
		//Incrementing the sum 
		else lsum+=current.data;
		return lsum;
		 
	}
	//Function to perform inorder traversal
			public static void inorder(Node root) {
				 if(root.left!=null)inorder(root.left);
				 System.out.println(root.data);
				 if(root.right!=null)inorder(root.right);
				 }
	
	//Function to take user data
	public static int readData() {
		System.out.println("Enter data:");
		int data=sc.nextInt();
		return data;
	}
	//Function to take user input to perform BST operations
	public static void userInput() {
	System.out.println("Please Enter BST operation from:");
	System.out.println("Insert Inorder Leafsum" );
	String choice=sc.next();
	switch(choice) {
		case "Insert":
		case "insert":
				int inval=readData();
				root=insert(root,inval);
				System.out.println("Data Inserted");
				break;
				case "LeafSum":
				case "leafsum":
					int sum=leafSum(root);
					System.out.println("The leaf sum is:"+sum);
					break;
				case "Inorder":
				case "inorder":
					//Initially checking if tree is empty
					if(root==null)
						System.out.println("Tree is empty, Insert elements to traverse");
					else
						inorder(root);
					break;
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
			userInput();
			
		}
}



