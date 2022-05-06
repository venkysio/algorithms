/*Program to perform deletion on Binary Search Tree*/
import java.util.Scanner;
public class BSTDelete {
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
		//Function to delete data from BST
		public static Node delete(Node current,int data) 
		{//Marking to the specified node
			if(data<current.data)current.left=delete(current.left,data);
			else if(data>current.data)current.right=delete(current.right,data);
			else {
				//Deleting node with no children
				if(current.left==null&&current.right==null) return null;
				//Deleting node with right child
				else if(current.left==null) current= current.right;
				//Deleting node with left child
				else if(current.right==null)current= current.left;
				//Deleting node with both children
				else {
					//Making current node equal to the maximum node on left sub tree
					current.data=max(current.left);
					current.left=delete(current.left,current.data);
					}
				}
				return current;
			}
		//Function to find maximum value from left subtree of given current node
		public static int max(Node current) {
			int max=current.data;
			while(current.right!=null) {
				 max = current.right.data;
			        current = current.right;
			}
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
			System.out.println("Insert Inorder Delete" );
			String choice=sc.next();
			switch(choice) {
			case "Insert":
			case "insert":
				int inval=readData();
				root=insert(root,inval);
				System.out.println("Data Inserted");break;
			case "Inorder":
			case "inorder":
				//Initially checking if tree is empty
				if(root==null)
					System.out.println("Tree is empty, Insert elements to traverse");
				else
					inorder(root);
				break;
			case "Delete":
			case "delete":
				//Initially checking if tree is empty
				if(root==null)
					System.out.println("Tree is empty, Insert elements to delete");
				else
				{int delval=readData();
				root=delete(root,delval);}
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


