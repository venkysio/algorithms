# program to sort an array using quick sort algorithm

# function takes array,starting index and ending index as a parameter
def quick_sort(array,start,end):
    if start < end :
        # pidx stores the pivot element sorted index
        pidx = partition(array,start,end)

        # recursive call for unsorted array before pivot element
        quick_sort(array,start,pidx-1)

        # recursive call for unsorted array after pivot element
        quick_sort(array,pidx+1,end)



# partition function to find the correct position for pivot element
def partition(array,start,end):
    # choose the last element as the pivot element 
    pivot = array[end]
    
    i = start-1

    for j in range(start,end):
        if array[j] < pivot :
            i+=1
            array[j],array[i] = array[i],array[j]

    i+=1
    # storing pivot in the correct position
    array[i],array[end] = pivot,array[i]

    # return the pivot index 
    return i



# Test drive code:
n=int(input("Enter no of elements in array : "))
array=[int(x) for x in input(f"Enter {n} elements in to the array: ").split()]
quick_sort(array,0,n-1)
print("The sorted array is :",array)
        
