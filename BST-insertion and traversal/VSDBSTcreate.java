/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Program to perform insertion and traversals on Binary Search Tree*/
import java.util.Scanner;

public class VSDBSTcreate {
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
	//Function to perform inorder traversal
	public static void VSDinorder(VSDNode root) {
		 if(root.left!=null)VSDinorder(root.left);
		 System.out.println(root.data);
		 if(root.right!=null)VSDinorder(root.right);
		 }
	//Function to perform preorder traversal
	public static void VSDpreorder(VSDNode root) {
		 System.out.println(root.data);
		if(root.left!=null)VSDpreorder(root.left);
		 if(root.right!=null)VSDpreorder(root.right);
		 }
	//Function to perform postorder traversal
	public static void VSDpostorder(VSDNode root) {
		if(root.left!=null)VSDpostorder(root.left);
		 if(root.right!=null)VSDpostorder(root.right);
		 System.out.println(root.data);
		 }
	//Function to take user data to insert into BST
	public static void VSDdatainsert() {
		System.out.println("Enter data to insert:");
		int data=sc.nextInt();
		root=VSDinsert(root,data);
		System.out.println("Data Inserted");
		
		 }
	
	//Function to take user input to perform BST operations
	public static void VSDuserInput() {
		System.out.println("Please Enter BST operation from:");
		System.out.println("Insert Inorder Preorder Postorder" );
		String choice=sc.next();
		switch(choice) {
		case "Insert":
		case "insert":
			VSDdatainsert();break;
		case "Inorder":
		case "inorder":
			if(root==null)
				System.out.println("Tree is empty, Insert elements to traverse");
			else
				VSDinorder(root);
			break;
		case "Preorder":
		case "preorder":
			if(root==null)
				System.out.println("Tree is empty, Insert elements to traverse");
			else
				VSDpreorder(root);
			break;
		case "Postorder":
		case "postorder":
			if(root==null)
				System.out.println("Tree is empty, Insert elements to traverse");
			else
				VSDpostorder(root);
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
