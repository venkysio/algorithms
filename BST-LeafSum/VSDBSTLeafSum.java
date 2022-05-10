/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Program to perform leaf sum of  Binary Search Tree*/
import java.util.Scanner;
public class VSDBSTLeafSum {
	static Scanner sc=new Scanner(System.in);
	static int lsum=0;
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
	//Function to perform sum of leaf nodes
	public static int VSDleafSum(VSDNode current) {
		//Checking if root is null
		if(root==null)lsum=0;
		//Traversing to the left subtree to find leaves
		if(current.left!=null)lsum=VSDleafSum(current.left);
		//Traversing to the right subtree to find leaves
		if(current.right!=null)lsum=VSDleafSum(current.right);
		//Incrementing the sum 
		else lsum+=current.data;
		return lsum;
		 
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
	System.out.println("Insert Inorder Leafsum" );
	String choice=sc.next();
	switch(choice) {
		case "Insert":
		case "insert":
				int inval=VSDreadData();
				root=VSDinsert(root,inval);
				System.out.println("Data Inserted");
				break;
				case "LeafSum":
				case "leafsum":
					int sum=VSDleafSum(root);
					System.out.println("The leaf sum is:"+sum);
					break;
				case "Inorder":
				case "inorder":
					//Initially checking if tree is empty
					if(root==null)
						System.out.println("Tree is empty, Insert elements to traverse");
					else
						VSDinorder(root);
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



