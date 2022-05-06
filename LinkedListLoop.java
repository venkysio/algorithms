/*Java program to detect loop in a linked list*/
import java.util.*;;

public class LinkedListLoop {
	//Clss to hold the structure of a node
	private static class Node{
			int data;//data of node
			Node next;//pointer to next elemnt in the list
			Node(int data){
				this.data=data;
				this.next=null;
			}
	}
		static Node head=null;
		//Function to insert elements into the linked list
	 public static void insert(int element) {
			Node temp=new Node(element);//making use of temporary node to insert 
			if(head==null)head=temp;//Inserting first element as head
			else {
				Node x=head;//Temporary node to iterate over list and find last node
				while(x.next!=null) {
					x=x.next;
				}
				x.next=temp;//Inserting node at end of Linked list
			}
	 }
	 //Function to check whether the loop exists or not in a linked list
	 public static boolean findLoop() {
		 Node cur=null;//Temporary node
		 if(head==null)System.out.println("The linked is empty");
		 else {
			 HashSet<Node> h=new HashSet<Node>();//Hash set to keep trck of elements in the list
			 cur=head;
			 //Itrating through the list
		 while(cur.next!=null) {
			 //adding elements to the hash set
			 h.add(cur);
			 //checking whether the element is repeated
			 if(h.contains(cur.next)) {
				 return true;
			 }
			 else
				 cur=cur.next;
		 }
		 }
		 return false;
		 
	 }
	 public static void main(String args[]) {
		 insert(10);
		 insert(11);
		 insert(12);
		 insert(13);
		 insert(14);
		 insert(15);
		 insert(16);
		 head.next.next=head;
		 boolean b=findLoop();
		 
		 if(b)System.out.println("The linked list contains a loop");
		 else System.out.println("The linked list does not contain a loop");
	 }
	}
	

