{
 "cells": [
  {
   "cell_type": "markdown",
   "id": "af5adc90",
   "metadata": {},
   "source": [
    "# 3 number sum\n",
    "## Find triplets that add up to target"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "4e96b23f",
   "metadata": {},
   "source": [
    "### Problem Statement\n"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "54c17748",
   "metadata": {},
   "source": [
    "Given an array of N integers,your task is to find unique triplets that add up to give a sum of zero. In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is equal to zero."
   ]
  },
  {
   "cell_type": "markdown",
   "id": "976251cf",
   "metadata": {},
   "source": [
    "# 1 Solution (Brute Force)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "3db07ec5",
   "metadata": {},
   "source": [
    "### Approach"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "cda5c3c0",
   "metadata": {},
   "source": [
    "Find all possible thriplets using three pointers i,j,k by looping over array where i!=j!=k and arr[i]+arr[j]+arr[k]==target. and add them to resultant list"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 15,
   "id": "41d34d8b",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "resultant triplets are: [-1, 0, 1] [-1, -1, 2]\n"
     ]
    }
   ],
   "source": [
    "def findtriplets(n,arr,target):\n",
    "    result=list()\n",
    "    for i in range(n-2): # for unique i,j,k\n",
    "        for j in range(n-1): \n",
    "            for k in range(n):\n",
    "                if i!=j!=k and arr[i]+arr[j]+arr[k]==target:\n",
    "                    res=[arr[i],arr[j],arr[k]]\n",
    "                    res.sort()\n",
    "                    if res not in result: # to eliminate duplicates\n",
    "                        result.append(res)\n",
    "    print(\"resultant triplets are:\",*result)\n",
    "arr=[-1,0,1,2,-1,-4]\n",
    "findtriplets(6,arr,0)\n"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "2ee790b5",
   "metadata": {},
   "source": [
    "# Time Complexity O(n^3)\n",
    "# Space Complexity O(1)\n"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "236ebf9d",
   "metadata": {},
   "source": [
    "#   "
   ]
  },
  {
   "cell_type": "markdown",
   "id": "0df60b43",
   "metadata": {},
   "source": [
    "# 2 Solution (Dictionary)\n"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "ba4220b3",
   "metadata": {},
   "source": [
    "## Approach"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "d2c956e3",
   "metadata": {},
   "source": [
    "Iterate through the array and find remaining two integers using dictionary"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 16,
   "id": "f230234b",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "resultant triplets are [-1, 0, 1] [-1, -1, 2]\n"
     ]
    }
   ],
   "source": [
    "def threesum(n,arr,target):\n",
    "    ans=[]\n",
    "\n",
    "    for i in range(n-2):\n",
    "        target=-arr[i]\n",
    "        d=dict()\n",
    "        for j in range(i+1,n):\n",
    "            \n",
    "            if target-arr[j] in d.keys():\n",
    "                a=sorted([arr[i],arr[j],target-arr[j]])\n",
    "                if a not in ans:\n",
    "                    ans.append(a)\n",
    "            else:\n",
    "                d[arr[j]]=i\n",
    "\n",
    "    print(\"resultant triplets are\",*ans)\n",
    "arr=[-1,0,1,2,-1,-4]\n",
    "threesum(6,arr,0)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "edb219e4",
   "metadata": {},
   "source": [
    "# Time Complexity O(n^2)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "11f7ccf0",
   "metadata": {},
   "source": [
    "# Space Complexity O(n)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "605a5357",
   "metadata": {},
   "source": [
    "#   "
   ]
  },
  {
   "cell_type": "markdown",
   "id": "a744a499",
   "metadata": {},
   "source": [
    "# 3 Solution (Two pointer)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "da161978",
   "metadata": {},
   "source": [
    "## Appoach"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "c601018c",
   "metadata": {},
   "source": [
    "Sort the Array, Iterate through it and search for remaining two integers using two pointer"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 18,
   "id": "5577747d",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "resultant triplets are: [-1, -1, 2] [-1, 0, 1]\n"
     ]
    }
   ],
   "source": [
    "def threesum(n,arr,target):\n",
    "    ans=[]\n",
    "    arr.sort()\n",
    "    for i in range(n-2):\n",
    "        if (i==0 or (i>0 and arr[i]!=arr[i-1])):\n",
    "            low=i+1\n",
    "            high=n-1\n",
    "            s=-arr[i]\n",
    "            while(low<high):\n",
    "                if arr[low]+arr[high]==s:\n",
    "                    ans.append([arr[i],arr[low],arr[high]])\n",
    "                    while(low<high and arr[low]==arr[low+1]):\n",
    "                        low+=1\n",
    "                    while(low<high and arr[high]==arr[high-1]):\n",
    "                        high-=1\n",
    "                    low+=1\n",
    "                    high-=1\n",
    "                elif (arr[low]+arr[high])<s:\n",
    "                    low+=1\n",
    "                else:\n",
    "                    high-=1\n",
    "    print(\"resultant triplets are:\",*ans)           \n",
    "\n",
    "threesum(6,[-1,0,1,2,-1,-4],0)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "7a9f226e",
   "metadata": {},
   "source": [
    "# Time Complexity O(n^2)\n",
    "# Space Complexity O(1)"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.10.0"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
