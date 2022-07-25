/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for finding distance between two strings using Wagner-Fisher algorithm*/
package Advanced_String_algo;

public class VSDWagnerFischer {
public static void main(String args[]) {
	String s1="cattle";
	String s2="kettle";
	int[][]a =new int[s1.length()+1][s2.length()+1];
	for(int i=0;i<s1.length()+1;i++) {
		for(int j=0;j<s2.length()+1;j++) {
			if(i==0&&j==0)a[i][j]=0;
			else if(i==0)a[i][j]=j;
			else if(j==0)a[i][j]=i;
			else {
				int min=a[i-1][j]+1;
				if((a[i][j-1]+1)<min)min=a[i][j-1]+1;
				if(a[i-1][j-1]<min) {
					min=a[i-1][j-1];
					if(s1.charAt(i-1)!=s2.charAt(j-1)) min+=1;
					}
				a[i][j]=min;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println();
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
	}
	System.out.println("The distance between the given strings is:"+a[s1.length()][s2.length()]);
}
}
