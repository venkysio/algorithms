/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Program to perform deletion on Binary Search Tree*/
import java.util.Scanner;
public class VSDBSTDelete {
		static Scanner sc=new Scanner(System.in);
		//Class to hold the structure of node in a tree
		public static class VSDNode{
			int data;//Holds the value of node
			int count;//Holds the count of duplicate nodes
			VSDNode left;//Holds the left pointer of node
			VSDNode right;//Holds the right pointer of node
			//Default constructor
			VSDNode(int data)
		    {
		        this.data =data;
		        this.count=0;
		        this.left = this.right = null;
		    }
		}
		//Root node
		static VSDNode root;
		//Function to insert data into BST
		public static VSDNode VSDinsert(VSDNode root,int data) 
		{
			if(root==null) root=new VSDNode(data);
			if(data<root.data)root.left=VSDinsert(root.left,data);
			else if(data==root.data)root.count+=1;
			else root.right=VSDinsert(root.right,data);
			return root;
		}
		//Function to delete data from BST
		public static VSDNode VSDdelete(VSDNode current,int data) 
		{//Marking to the specified node
			if(data<current.data)current.left=VSDdelete(current.left,data);
			else if(data>current.data)current.right=VSDdelete(current.right,data);
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
					current.data=VSDmax(current.left);
					current.left=VSDdelete(current.left,current.data);
					}
				}
				return current;
			}
		//Function to find maximum value from left subtree of given current node
		public static int VSDmax(VSDNode current) {
			int max=current.data;
			while(current.right!=null) {
				 max = current.right.data;
			        current = current.right;
			}
			return max;
		}

		//Function to perform inorder traversal
		public static void VSDinorder(VSDNode root) {
			 if(root.left!=null)VSDinorder(root.left);
			 System.out.println(root.data);
			 if(root.right!=null)VSDinorder(root.right);
			 }
		
		//Function to take user data
		public static int VSDreadData() {
			System.out.println("Enter data:");
			int data=sc.nextInt();
			return data;
			
			 }
		
		//Function to take user input to perform BST operations
		public static void VSDuserInput() {
			System.out.println("Please Enter BST operation from:");
			System.out.println("Insert Inorder Delete" );
			String choice=sc.next();
			switch(choice) {
			case "Insert":
			case "insert":
				int inval=VSDreadData();
				root=VSDinsert(root,inval);
				System.out.println("Data Inserted");break;
			case "Inorder":
			case "inorder":
				//Initially checking if tree is empty
				if(root==null)
					System.out.println("Tree is empty, Insert elements to traverse");
				else
					VSDinorder(root);
				break;
			case "Delete":
			case "delete":
				//Initially checking if tree is empty
				if(root==null)
					System.out.println("Tree is empty, Insert elements to delete");
				else
				{int delval=VSDreadData();
				root=VSDdelete(root,delval);}
				break;
				
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
		VSDuserInput();
		
	}
	}


