
/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Building Max Heap*/
public class VSDBuildMaxHeap {
	//Class to hold the structure of node in a tree
		public static class Node{
			int data;//Holds the value of node
			Node left;//Holds the left pointer of node
			Node right;//Holds the right pointer of node
			//Default constructor
			Node(int data)
		    {
		        this.data =data;
		        this.left = this.right = null;
		    }
		}
		//Root node
		public static Node root=null;
		//Variable to hold count of left nodes
		public static int leftcount=0;
		//Variable to hold count of right nodes
		public static int rightcount=0;
		//Method to Build Heap along with maintenance of complete binary tree
	public static Node VSDbuildHeap(Node root,Node newNode)
	{
		if(root==null)root=newNode;//Null check
		else if(root.left!=null&&root.right!=null)//Checking whether both left and right children are present for the root
			{
				leftcount=VSDsubtreeCount(root.left);//Getting left nodes count from the left of current root
				rightcount=VSDsubtreeCount(root.right);//Getting right nodes count from the right of current root
				
				int height=VSDfindHeight(root);//Getting height of tree
				//Checking for the correct position to insert
				if(leftcount<(VSDexpectedCount(height)/2)) {
					VSDbuildHeap(root.left,newNode);
				}
				else if(leftcount==rightcount)
					VSDbuildHeap(root.left,newNode);
				else
					VSDbuildHeap(root.right,newNode);
			}
		else if(root.left==null)
			{
			root.left=newNode;
			
			}
		else if(root.right==null)
			{
			root.right=newNode;
			
			}
		VSDHeapify(root);//Calling function to maintain max heap properties
		
		return root;
	}
	//Function to maintain max heap properties
	public static void VSDHeapify(Node root) {
		if(root.left==null&&root.right==null)
			return;
		//Checking and swapping elements
		if(root.left!=null&&root.left.data>root.data)
			{
				int temp=root.left.data;
				root.left.data=root.data;
				root.data=temp;
				return;
			
			}
		 if(root.right!=null&&root.right.data>root.data) {
			int temp=root.right.data;
			root.right.data=root.data;
			root.data=temp;
			return;
		}
	}
	//Function to return the expected node count for given height
	public static int VSDexpectedCount(int h) {
		int count=0;
		while(h>=0) {
			count+=Math.pow(2,h);
			h--;
		}
		return count;
	}
	//Function to return the node count for given subtree
	public static int VSDsubtreeCount(Node current) {
				int leftheight=0;
				int rightheight=0;
					if(current.left!=null)
						{
						leftheight=VSDsubtreeCount(current.left);
						}
					if(current.right!=null) {
						rightheight=VSDsubtreeCount(current.right);
					}
					
					int count=rightheight+leftheight+1;
					 return count;
		}
	//Function to return the height of tree
	public static int VSDfindHeight(Node current) {
		if (current == null)
            return -1;
        else
        {
            int lh = VSDfindHeight(current.left);
            int rh = VSDfindHeight(current.right);
  
            if (lh > rh)
                return (lh + 1);
             else
                return (rh + 1);
        }
	}
//Function to display elements in max heap using inorder traversal
public static void VSDinorder(Node root) {
	if(root.left!=null)VSDinorder(root.left);
	 System.out.println(root.data);
	if(root.right!=null)VSDinorder(root.right);
	 }
	
public static void main(String args[]) {
	int[] arr=new int[]{10,11,13,6,25,17,12,5,4};
	Node n;
	for(int i=0;i<arr.length;i++) {
		n=new Node(arr[i]);
		root=VSDbuildHeap(root,n);
	}
	VSDinorder(root);
	

	
}
}
