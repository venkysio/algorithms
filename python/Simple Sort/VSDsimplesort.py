# program to execute simple sort
# simple sort is sorting an array in python


def simple_sort(array):
    for i in range(len(array)):
        for j in range(1,len(array)):
            if array[i]>array[j]:
                #swap the elements
                array[i],array[j]=array[j],array[i]
    return array


# Test drive code:
n=int(input("Enter no of elements in array : "))
array=[int(x) for x in input(f"Enter {n} elements in to the array: ").split()]
print("The sorted array is :",simple_sort(array))
