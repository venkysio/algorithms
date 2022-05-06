/*Java program to find level of a node in BST.*/

import java.util.Scanner;

public class Nodelevel {
		static Scanner sc=new Scanner(System.in);
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
		//Function to check the level of node
		//It returns 0 if node is not present
		public static int checkLevel(Node current,int val,int level) {
			//Checking if node is not present
			if(current==null)level=0;
			//Validating node data and traversing BST recursively
			if(current.data==val)level++;
			else if(val<current.data&&current.left!=null)
			{
			level=checkLevel(current.left,val,level+1);
			}
				
			else if(val>current.data&&current.right!=null) {
				level=checkLevel(current.right,val,level+1);
			}
			else level=0;
			
			return level;
			
			
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
			System.out.println("Insert Inorder Level" );
			String choice=sc.next();
			switch(choice) {
				case "Insert":
				case "insert":
						int inval=readData();
						root=insert(root,inval);
						System.out.println("Data Inserted");
						break;
						case "Level":
						case "level":
							//Initially checking if tree is empty
							if(root==null)
								System.out.println("Tree is empty, Insert elements to find level");
							else
							{//Taking user input
							int val=readData();
							//Calling checkLevel initially
							int level=checkLevel(root,val,0);
							if(level==0)System.out.println("The node is not present in tree!!");
							else
							System.out.println("The level of given node is:"+level);}
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
