# function return wether the input number is palindrome or not
# It takes an integer number as a parameter
from math import log
def integer_palindrome(num):
    np=int(log(num,10)) #no of places are there in num
    rnum=0 # intializing reverse of number as zero
    temp=num # copying the num in to temperory variable
    while np!=-1:
        digit=temp-((temp//10)*10)
        rnum+=digit*10**np
        temp=temp//10
        np-=1
    # if number is equal to reverse of number then it is palindrome
    if num==rnum: 
        print(num,"is a palindrome number")
    else:
        print(num,"is not a palindrome number")

# test drive code:

num=int(input("Enter the number: "))
integer_palindrome(num)        
        
        
    
   
        
    
    
    
    
    
