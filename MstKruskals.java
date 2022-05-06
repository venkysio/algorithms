//Java program for finding Minimum Spanning tree from given graph using Kruskal's algorithm
import java.util.LinkedList;

public class MstKruskals {
	//Class to represent the structure of the edge along with weights
	public static class Edge {
		 int source;
		 int destination;
		 int weight;

		 public Edge(int source, int destination, int weight) {
		 this.source = source;
		 this.destination = destination;
		 this.weight = weight;
		 }
		 }
	//Class to represent the structure of the graph	
public static class Graph{
	int v;//No.of vertices
	LinkedList<Edge> adList[];//Adjacency list to mark the edges
	//Initializing vertices using constructor
	Graph(int size){
		v=size;
		adList=new LinkedList[v];
		for(int i=0;i<v;i++)
			adList[i]= new LinkedList<Edge>();
	}
	//Function to add edge to the graph
	public void addEgde(int source, int destination, int weight) {
		 Edge edge = new Edge(source, destination, weight);
		 adList[source].addLast(edge); // adding new edge to the list
		 }
	//Function to implement prim's algorithm
	public  void KruskalsMst(Graph g) {
		int edgecount=0;
		int weight=0;//To calculate the weight of MST.
		 boolean[] visited = new boolean[g.v];//Array to mark the vertices alredy present in MST
		    for(int i=0;i<g.v;i++) {
		    	visited[i]=false;
		    }
		    System.out.println("The Kruskal's MST is:");
		    while (edgecount<g.v-1) {
		    int min=999999;
		    int x = 0; // source vertex
		    int y = 0; // destination vertex
		    for(int i=0;i<g.v;i++) {
			   LinkedList<Edge> list = adList[i];
			   for(int j=0;j<list.size();j++) {
				   if(!visited[list.get(j).destination]&&min > list.get(j).weight)
				   {
					   min=list.get(j).weight;
					   x=i;
					   y=list.get(j).destination;
				   }
			   }
		   }
		   System.out.println(x+" "+y);
		   if(edgecount==0) visited[x] = true;
		   edgecount++;
		   weight+=min;
		   visited[y] = true;
		    }
		    System.out.println("The total cost of Kruskal's MST is "+ weight);
	}
	
	
}

public static void main(String args[]) {
	Graph g=new Graph(6);
	g.addEgde(0,1,20);
	g.addEgde(1,0,20);
	g.addEgde(0,2,30);
	g.addEgde(2,0,30);
	g.addEgde(0,3,40);
	g.addEgde(3,0,40);
	g.addEgde(0,4,20);
	g.addEgde(4,0,20);
	g.addEgde(1,2,10);
	g.addEgde(2,1,10);
	g.addEgde(1,3,5);
	g.addEgde(3,1,5);
	g.addEgde(1,5,10);
	g.addEgde(5,1,10);
	g.addEgde(2,3,20);
	g.addEgde(3,2,20);
	g.addEgde(2,4,50);
	g.addEgde(4,2,50);
	g.addEgde(2,5,20);
	g.addEgde(5,2,20);
	g.addEgde(3,5,40);
	g.addEgde(5,3,40);
	g.addEgde(4,5,30);
	g.addEgde(5,4,30);
	g.KruskalsMst(g);
}
}



