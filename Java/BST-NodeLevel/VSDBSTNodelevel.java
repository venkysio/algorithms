/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program to find level of a node in BST.*/

import java.util.Scanner;

public class VSDBSTNodelevel {
		static Scanner sc=new Scanner(System.in);
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
		//Function to check the level of node
		//It returns 0 if node is not present
		public static int VSDcheckLevel(VSDNode current,int val,int level) {
			//Checking if node is not present
			if(current==null)level=0;
			//Validating node data and traversing BST recursively
			if(current.data==val)level++;
			else if(val<current.data&&current.left!=null)
			{
			level=VSDcheckLevel(current.left,val,level+1);
			}
				
			else if(val>current.data&&current.right!=null) {
				level=VSDcheckLevel(current.right,val,level+1);
			}
			else level=0;
			
			return level;
			
			
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
			System.out.println("Insert Inorder Level" );
			String choice=sc.next();
			switch(choice) {
				case "Insert":
				case "insert":
						int inval=VSDreadData();
						root=VSDinsert(root,inval);
						System.out.println("Data Inserted");
						break;
						case "Level":
						case "level":
							//Initially checking if tree is empty
							if(root==null)
								System.out.println("Tree is empty, Insert elements to find level");
							else
							{//Taking user input
							int val=VSDreadData();
							//Calling checkLevel initially
							int level=VSDcheckLevel(root,val,0);
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
