/*Program to perform insertion and traversals on Binary Search Tree*/
import java.util.Scanner;

public class BSTcreate {
	static Scanner sc=new Scanner(System.in);
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
	//Function to perform inorder traversal
	public static void inorder(Node root) {
		 if(root.left!=null)inorder(root.left);
		 System.out.println(root.data);
		 if(root.right!=null)inorder(root.right);
		 }
	//Function to perform preorder traversal
	public static void preorder(Node root) {
		 System.out.println(root.data);
		if(root.left!=null)preorder(root.left);
		 if(root.right!=null)preorder(root.right);
		 }
	//Function to perform postorder traversal
	public static void postorder(Node root) {
		if(root.left!=null)postorder(root.left);
		 if(root.right!=null)postorder(root.right);
		 System.out.println(root.data);
		 }
	//Function to take user data to insert into BST
	public static void datainsert() {
		System.out.println("Enter data to insert:");
		int data=sc.nextInt();
		root=insert(root,data);
		System.out.println("Data Inserted");
		
		 }
	
	//Function to take user input to perform BST operations
	public static void userInput() {
		System.out.println("Please Enter BST operation from:");
		System.out.println("Insert Inorder Preorder Postorder" );
		String choice=sc.next();
		switch(choice) {
		case "Insert":
		case "insert":
			datainsert();break;
		case "Inorder":
		case "inorder":
			if(root==null)
				System.out.println("Tree is empty, Insert elements to traverse");
			else
				inorder(root);
			break;
		case "Preorder":
		case "preorder":
			if(root==null)
				System.out.println("Tree is empty, Insert elements to traverse");
			else
				preorder(root);
			break;
		case "Postorder":
		case "postorder":
			if(root==null)
				System.out.println("Tree is empty, Insert elements to traverse");
			else
				postorder(root);
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
