# program to find an element in the given sorted array using binary search

# function takes array,start index,end index and element to be found as  parameters
def binary_search(array,start,end,element):
    if start <= end and start >= 0 :
        mid = start + (end - start)//2

        if array[mid] == element:
            print(f"The element {element} found at index {mid} in the given array")

        else:
            if element < array[mid] :
                 return binary_search(array,start,mid-1,element)

            else:
                return binary_search(array,mid+1,end,element)
    else:
        print(f"The element {element} not found in the given array")

# Test drive code:
n=int(input("Enter no of elements in array : "))
array=[int(x) for x in input(f"Enter {n} elements in to the array: ").split()]
element= int(input("Enter element to find in the array: "))
binary_search(array,0,n-1,element)
