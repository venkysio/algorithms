/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Brute force method of String matching*/
public class VSDStringMatching_BruteForce {
	public static void VSDStringMatching_BruteForce(String pattern,String text) {
		int i=0;
		//Repeat until the complete text string is iterated and Pattern reaches to the end
		for(int j=0;j<pattern.length()&&i<text.length();) {
			//If both the characters of pattern and text match, increment the indexes.
			if(text.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
			}
			 //If the characters do not match, move pattern index to 0 and the text index to last searched position + 1
			else {
				i=i-j+1;
				j=0;
				
			}	
		}
		if(i==0)
			System.out.println("Pattern not fount in text");
		else
		System.out.println("Pattern is found at index: "+ (i-pattern.length()));
	
		
	}
public static void main(String args[]) {
	String pattern="AAAABBB";
	String text="AAABAABABABAAAAABAAAAABBB";
	VSDStringMatching_BruteForce(pattern,text);
}
}
