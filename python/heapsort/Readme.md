1.HEAP

Heap is specialised form of a complete binary tree.
A complete binary tree is a heap data structures if it satisfies below conditions:
1) The node is always greater than it's child nodes and root node is the greatest
	element of all the nodes in the tree. This heap is called maxheap.
2) The node is always smaller than it's child nodes and root node is the smallest
	element of all the nodes in the tree. This heap is called minheap.



Usually heap is represented by array data structure. In which the first element is the root
node of heap and left and right child are located at 2*n+1,2*n+2 indeces where n is index of 
root node.


Ex: the array [9,3,7,1,4,2,5]
		Here 9 is the root node at 0th index and 3,7 are left and right child nodes
		at 1 and 2 are the indices of 3 and 7.



HEAPIFY


Heapify is a technique or a process to convert a binary data structure in the form 
array to a max heap or min heap
	
HEAPIFY ALGORITHM


		1) Select a element and set it as large    
		2) Check for largest element between current element and left child element
		3) Update the large element if needed
		4) Check for largest element between large element and right child element
		5) Update the large element if needed
		6) If large element is not current element
		7) Then repalce current element with largest element and heapify the remaining array

Heapsort:

Heapsort Algorithm:



		1) Build maxHeap of the given array using heapify.
		2) Iterate the array from half of the size of array
		3) Replace the rootnode with last node
		4) Decrement the value of last index
		5) Heapify the current array
    
    
    
Timecomplexity:

	The best case timecomplexity: O(nlogn)
	The Averagecase timecomplexity:O(nlogn)
	The worstcase timecomplexity:O(nlogn)
	The space complexity:O(1)
