N-QUEENS'S PROBLEM USING BACKTRACKING

BACKTRACKING 

   Backtracking is a naive or brute force technique
in which we generate all possible combinations of
given problem and find the solution which satisfy the 
given constraints.If a combination is unsatisfied then it 
backtrack and find check for other combinations.




PROBLEM STATEMENT:

    The problem states that we have to place N queens in board(N*N)
    such that no two queens are in same row,same column and same diagonals.

Example:

QUEENS=4

    _  Q  _  _             _  _  Q  _            
    _  _  _  Q             Q  _  _  _
    Q  _  _  _             _  _  _  Q
    _  _  Q  _      and    _  Q  _  _

    are solutions of given 4 queens.
    
![image](https://user-images.githubusercontent.com/96312466/173853774-f9f5ab24-c687-424d-ac6f-a689c56ace29.png)

ALGORITHM:

    This problem can be solved using two function:
        1. safe function
        2. solve function

    Safe function checks the given box of board is safe or not
    Solve function solves the problem

   Steps to solve N Queens problem is :

    1. Start at the first row.
    2. Iterate through each column in row
    3. Check whether the box is safe or not.
    4. If safe place queen and repeat step 2 for next row.
    5. Else go for the next column.
    6. If all the columns are unsafe backtrack to the previous row.
    7. Repeat until all queens are placed 
