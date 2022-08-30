# 3 number sum
## Find triplets that add up to target### Problem Statement
Given an array of N integers,your task is to find unique triplets that add up to give a sum of zero. In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is equal to zero.# 1 Solution (Brute Force)### ApproachFind all possible thriplets using three pointers i,j,k by looping over array where i!=j!=k and arr[i]+arr[j]+arr[k]==target. and add them to resultant list

```python
def findtriplets(n,arr,target):
    result=list()
    for i in range(n-2): # for unique i,j,k
        for j in range(n-1): 
            for k in range(n):
                if i!=j!=k and arr[i]+arr[j]+arr[k]==target:
                    res=[arr[i],arr[j],arr[k]]
                    res.sort()
                    if res not in result: # to eliminate duplicates
                        result.append(res)
    print("resultant triplets are:",*result)
arr=[-1,0,1,2,-1,-4]
findtriplets(6,arr,0)

```
# Time Complexity O(n^3)
# Space Complexity O(1)
#   # 2 Solution (Dictionary)
## ApproachIterate through the array and find remaining two integers using dictionary

```python
def threesum(n,arr,target):
    ans=[]

    for i in range(n-2):
        target=-arr[i]
        d=dict()
        for j in range(i+1,n):
            
            if target-arr[j] in d.keys():
                a=sorted([arr[i],arr[j],target-arr[j]])
                if a not in ans:
                    ans.append(a)
            else:
                d[arr[j]]=i

    print("resultant triplets are",*ans)
arr=[-1,0,1,2,-1,-4]
threesum(6,arr,0)
```
# Time Complexity O(n^2)# Space Complexity O(n)#   # 3 Solution (Two pointer)## AppoachSort the Array, Iterate through it and search for remaining two integers using two pointer

```python
def threesum(n,arr,target):
    ans=[]
    arr.sort()
    for i in range(n-2):
        if (i==0 or (i>0 and arr[i]!=arr[i-1])):
            low=i+1
            high=n-1
            s=-arr[i]
            while(low<high):
                if arr[low]+arr[high]==s:
                    ans.append([arr[i],arr[low],arr[high]])
                    while(low<high and arr[low]==arr[low+1]):
                        low+=1
                    while(low<high and arr[high]==arr[high-1]):
                        high-=1
                    low+=1
                    high-=1
                elif (arr[low]+arr[high])<s:
                    low+=1
                else:
                    high-=1
    print("resultant triplets are:",*ans)           

threesum(6,[-1,0,1,2,-1,-4],0)
```

    resultant triplets are: [-1, -1, 2] [-1, 0, 1]
    
# Time Complexity O(n^2)
# Space Complexity O(1)