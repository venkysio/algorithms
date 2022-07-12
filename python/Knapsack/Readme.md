FRACTIONAL KNAPSACK PROBLEM

   The Problem Statement:

        A KNAPSACK (container) is given with a capacity M. There are N objects to
        fill in KNAPSACK. Each object has different profits. The fraction of objects are allowed. 
        The problem is to fill KNAPSACK in such a way that the profit is maximum and find the maximum profit.
    

   Approach:
        
        These kind of minimization/maximization problem are called optimization problems.
        One of the approach to solve optimization problems are GREEDY ALGORITHM.
        The Greedy Algorithm states that a problem should take minimized/maximized at each 
        stage to have optimized solution.
    
    This Greedy Algorithm is suitable for only fractional knapsack problem.


   ALGORITHM:

        1. Take profits and weights of objects as input from user.
        2. calculate profit and weight ratio of each object.
        3. Sort the profits and weights of each object based on p/w ratio.
        4. Iterate through the array until the bag capacity is zero.
        5. if weight of object is less than remaining capacity include the object in knapsack.
        6. decrease the capacity of knapsack.
        
 
