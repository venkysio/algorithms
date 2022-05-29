# program to execute insertion sort

def insertion_sort(array):
    for i in range(1,len(array)):
        current = array[i]
        j = i-1
        while j>=0 and array[j] > current :
            array[j+1] = array[j]
            j-=1
        array[j+1] = current

    return array

# Test drive code
n=int(input("Enter no of elements in array : "))
array=[int(x) for x in input(f"Enter {n} elements in to the array: ").split()]
print("The sorted array is :",insertion_sort(array))
