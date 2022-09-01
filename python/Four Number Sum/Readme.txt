	FOUR NUMBER SUM

	Problem Statement
		An array of n integers, return an array of all the unique quadruplets such 
		that they add up to the given target.

	Solution 1 (Brute Force):
		
		User four nested loops to find out all four possible elements and find the 
		whether they add up to the given target. and return.
		
		It is not recommended to find through this method it takes O(n^4) which is worst
		case.
	
	Solution 2 (using two sum):
	
		It is a recursive approach for finding k sum where k<=len(arr). Here k is 4.
		We reduce the array to two sum and find two distinct elements and remaining by 
		recursion.

		(4sum==>3sum==>2sum)