# Copyrights to vsdevelopers.io
# For more programs visit vsdevelopers.io
# Python program to solve 01 KNAPSACK problem using dynamic programming


# Function to take user input
def VSDuserinput():
    n=int(input("Enter the number of objects: "))
    m=int(input("Enter the capacity of knapsack: "))
    p=list(map(int,input("Enter the profits of objects with space between: ").split()))
    w=list(map(int,input("Enter the weights of objects with space between: ").split()))
    p.insert(0,0)
    w.insert(0,0)    
    return n,m,p,w

# Function to show the result of 01 knapsack program
def show(n,m,w,k):
    i=n
    j=m
    print("The items entered into the knapsack are: ")
    while i>0 and j>0:
        if k[i][j]!=k[i-1][j]:
            print(i,"item with weight",w[i])
            j=j-w[i]
            i=i-1
        else:
            i=i-1
    print("Weight taken into the knapsack is",m-j,"with having maximum value",k[n][m])


# Function to solve 01knapsack
def dpknapsack(n,m,p,w):
    k=[[None for i in range(m+1)]for j in range(n+1)]
    
    for i in range(n+1):
        for j in range(m+1):
            
            if i==0 or j==0:
                k[i][j]=0
            elif w[i]<=j:
                k[i][j]=max(p[i]+k[i-1][j-w[i]],k[i-1][j])
            else:
                k[i][j]=k[i-1][j]
    for i in range(n+1):
        for j in range(m+1):
            print(k[i][j],end="\t")
        print()
    show(n,m,w,k)
    

# Main Function
if __name__=="__main__":
    n,m,p,w=VSDuserinput()
    dpknapsack(n,m,p,w)
