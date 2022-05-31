COUNTING SORT:

  It is a sorting algorithm that sorts the 
elements of an array by counting the number of 
occurrences of each unique element in the array.
The count is stored in count array and the sorting 
is done by mapping the count as an index ouput array
like hashing. It performs sorting without 
comparing the elements. It is effective when 
range is not greater than number of objects to be sorted.


Algorithm:

    1). Find the max element in the array.
    2). create an array with zeroes of range max+1.
    3). Iterate through the array and increase the. 
        value of count at corresponding index.
    4). Iterate through the count array from index 1 to max.
    5). Add count of previous element to current element
    6). Iterate through the given array find the index in count array
    7). Place the element in output array and decrease the count 
        of element in count array


COUNTING SORT COMPLEXITY:

     Time complexity:
          Best case time complexity is O(n+k).
          Average case time complexity is O(n+k).
          Worst case time complexity is O(n+k).


Space complexity is O(max element)
