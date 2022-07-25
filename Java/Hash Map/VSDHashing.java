/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for implementing hashmaps */
public class VSDHashing {
	//Class to hold structure of HashMap
	public static class Node{
		String state;
		String capital;
		Node next;//Provision to handle collisions
	}
	public static int totalstates=28;
	public static Node hashMap[]=new Node[totalstates];
	public static String states[]=new String[] {"AP","AR","AS","BR","CG","GA","GJ",
												"HR","HP","JH","KA","KL","MP","MH",
												"MN","ML","MZ","NL","OR","PB","RJ",
												"SK","TN","TS","TR","UP","UT","WB"};
	public static String capitals[]=new String[] {"AMARAVATHI","ITANAGAR","DISPUR","PATNA","RAIPUR","PANAJI","GANDHINAGAR",
												"CHANDIGARH","SHIMLA","RANCHI","BENGALURU","THIRUVANANTHAPURAM","BHOPAL","MUMBAI",
												"IMPHAL","SHILLONG","AIZWAL","KOHIMA","BHUBANESHWAR","CHANDIGARH","JAIPUR",
												"GANGTOK","CHENNAI","HYDERABAD","AGARTALA","LUCKNOW","DEHRADUN","KOLKATA"};
	//Function to build hash map
	public static void VSDBuildHashMap() {
		for(int i=0;i<totalstates;i++) {
			VSDset(states[i],capitals[i]);
		}
	}
	public static void VSDset(String k,String value) {
		int key=VSDhashing(k);
		hashMap[key]=new Node();
		hashMap[key].state=k;
		hashMap[key].capital=value;
		hashMap[key].next=null;
	}
	public static Node VSDget(String statecode) {
		int key=VSDhashing(statecode);
		return hashMap[key];
	}
	//Function to perform hashing
	public static int VSDhashing(String statecode) {
		int i=(int)statecode.charAt(0);
		int j=(int)statecode.charAt(1);
		int sum=i+j;
		int hashCode=(sum)%totalstates;
		return hashCode;
	}
	//Function to print hash map
	public static void VSDprinthashMap() {
		for(int i=0;i<totalstates;i++) {
			int key=VSDhashing(states[i]);
			System.out.println(hashMap[key].state+" "+hashMap[key].capital);
		}
	}
public static void main(String args[]) {
	VSDBuildHashMap();
	System.out.println("The hash map is:");
	VSDprinthashMap();
}
}
