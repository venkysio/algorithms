/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for finding distance between two strings using Wagner-Fisher algorithm using recursuion*/


public class VSDWagnerFischer_Recursive {
	public static int VSDMin(int a, int b,int c) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}
	public static int VSDWagnerFischer_Recursive(String s1, String s2){
		if(s1.length()==0)return 0;
		if(s2.length()==0)return 0;
		int indicator=s1.charAt(0)!=s2.charAt(0)?1:0;
		return VSDMin(VSDWagnerFischer_Recursive(s1.substring(1),s2)+1,
				VSDWagnerFischer_Recursive(s2.substring(1),s1)+1,
				VSDWagnerFischer_Recursive(s1.substring(1),s2.substring(1))+indicator);
	}
	public static void main(String args[]) {
		String s1="intention";
		String s2="execution";
		int distance=VSDWagnerFischer_Recursive(s1,s2);
		System.out.println("The distance between the given strings is:"+distance);
	}
}
