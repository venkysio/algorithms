# function returns the sum of the integer array
#Function takes an array as parameters and return integer 
def array_sum(array):
    sum=0 # A variable to add each element of array
    for i in array:
        # adding the i value to sum
        sum+=i
    return sum

# test drive code
array=[int(x) for x in input("enter elements in array with one space sperated: ").split()] # takes input as an array
print("array sum is :",array_sum(array))#it prints the sum of array




