#function to take user input

def vsduserinput():
    n=int(input("Enter the size: "))
    print("Enter numbers to sort with spaces between: ")
    s=input().split(" ")
    a=[int(s[i]) for i in range(n)]
    return n,a


#Function to get maximum element in the array

def vsdmax(a):
    maxele=0
    for i in a:
        if i>maxele:
            maxele=i
    return maxele
    # or return max(a)


#Function to perform counting sort

def vsdsort(max:int,n,a):
    count=[0 for i in range(max+1)]
    
    output=[None for i in range(n)]
    for j in range(n):
        count[a[j]]+=1
    for i in range(1,len(count)):        
        count[i]+=count[i-1]
       
    for i in range(n):       
        output[count[a[i]]-1]=a[i]
        count[a[i]]-=1 
    return output


#Function to print the output

def vsdprint(output:list):
    for i in range(len(output)):
        print(output[i],end=" ")


#Main function

def countingsort():
    n,a=vsduserinput()
    max=vsdmax(a)  
    x=vsdsort(max,n,a)
    print("The sorted array is")
    vsdprint(x)
    


if __name__ == "__main__":

    countingsort()