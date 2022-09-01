	DIJKSTRA'S ALGORITHM

	It is greedy algorithm to find shortest distance from a single source to all other 
	nodes present in the graph. That is also called as Single Source Shortest Path 
	algorithm.
	
	The algorithm keeps track of the currently known shortest distance from each node 
	to the source node and it updates these values if it finds a shorter path.

	Once the algorithm has found the shortest path between the source node and another
	node, that node is marked as visited and added to the path.

	The process continues until all the nodes in the graph heve been added to the path.
	This way, we have a path that connects the source node to all other nodes following the 
	shortest path possible to reach each node.