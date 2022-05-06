/*Program to find height of Binary Search Tree*/
import java.util.Scanner;
public class TreeHeight {
	static Scanner sc=new Scanner(System.in);
	static int height;
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
	//Function to find height of tree
	public static int findHeight(Node current) {
		//Checking if root is null
		if(root==null)height=0;
		int leftheight=0;//variable to hold height of left subtree
		int rightheight=0;//variable to hold height of right sub tree
		//Traversing to the left subtree to find max height
			if(current.left!=null)
				{
				leftheight=findHeight(current.left);
				}
			//Traversing to the right subtree to find max height
			if(current.right!=null) {
				rightheight=findHeight(current.right);
			}
			//selecting maximum height and adding 1 for root's height
			height=max(rightheight,leftheight)+1;
			 return height;
		}
		//Function to find maximum of two heights
		public static int max(int a,int b) {
			int max=0;
			if(a>=b)max=a;
			else max=b;
			return max;
			
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
		System.out.println("Insert Inorder Height" );
		String choice=sc.next();
		switch(choice) {
			case "Insert":
			case "insert":
					int inval=readData();
					root=insert(root,inval);
					System.out.println("Data Inserted");
					break;
					case "Height":
					case "height":
						int h=findHeight(root);
						System.out.println("The height is:"+h);
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

