# 0/1 KNAPSACK PROBLEM

   ## The Problem Statement

        A KNAPSACK (container) is given with a capacity M. There are N objects to
        fill in KNAPSACK. Each object has different profits. The fraction of objects are not allowed. 
        i.e entire object has to consider or discard the object. The problem is to fill KNAPSACK in 
        such a way that the profit is maximum and find the maximum profit.
    

   ## Approach
        
        These kind of minimization/maximization problem are called optimization problems.
        One of the approach to solve optimization problems are DYNAMIC PROGRAMMING.
        In this approach we find optimized solution among all feasible solution.
        each solution is stored in an array to reduce repeated computation.


   ## ALGORITHM

        1. Take profits and weights of objects as input from user.
        2. Create a matrix of n+1,m+1 dimensions.
        3. Iterate through the matrix.
        4. If row is zero or column is zero set matrix(row,column)=0.
        5. If weight of each row is less than column weight then,
        6. set matrix(row,column) to max(p[i]+matrix[i-1][j-w[i]],matrix[i-1][j]) where i=row,j=column,p=profit,w=weight.
        7. else set matrix(row,column) to matrix(row-1,column).
        8. matrix(n,m) is result where n is number of objects and m is capacity of knapsack.
