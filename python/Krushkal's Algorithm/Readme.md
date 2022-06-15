KRUSHKAL'S ALGORITHM

Krushkal's algorithm is minimum spanning tree algorithm which finds if finds the lowest weighted edge and add to spanning tree until all vertices are covered

Krushkal's algorithm is a greedy technique which finds the optimal at each stage to find optimal solutions at the end

ALGORITHM

    1.Sort all edges in ascending order of weight.
    2.Select the smallest edge.
    3.Check if it forms a cycle with the spanning tree formed so far.if cycle is not formed,
      then add this edge to spanning tree else skip the edge.
    4.Repeat step until there are V-1 edges in spanning tree.
Time complexity of Prim's algorithm is O(E log V).
