PRIM'S ALGORITHM


Prim's algorithm is minimum spanning tree algorithm which finds the 
subset of edges of a graph which has the minimum sum
of weights among all the trees that can be
formed from the graph

Prim's algorithm is a greedy technique which finds the optimal at each 
stage to find optimal solutions at the end


ALGORITHM

    1.Initialize the minimum spanning tree with a vertex chosen at random
    2.Find all the edges that connect the tree to new vertices, find the 
      minimum and add it to the tree
    3.Keep repeating step 2 until we get a minimum spanning tree.



Time complexity of Prim's algorithm is O(E log V).
