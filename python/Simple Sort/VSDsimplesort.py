# program to execute simple sort
# simple sort is sorting an array by using built-in sort function in python


def simple_sort(array):
    array.sort()
    return array


# Test drive code:
n=int(input("Enter no of elements in array : "))
array=[int(x) for x in input(f"Enter {n} elements in to the array: ").split()]
print("The sorted array is :",simple_sort(array))
