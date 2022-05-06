/*Java program to perform BFS on a graph*/
/*The graph is represented using adjacency list*/
import java.util.*;

public class GraphBFS {
	public static class Graph{
		int v;//No.of vertices
		LinkedList<Integer> adList[];//Adjacency list to mark the edges
		//Initializing vertices using constructor
		Graph(int size){
			v=size;
			adList=new LinkedList[v];
			for(int i=0;i<v;i++)
				adList[i]= new LinkedList<Integer>();
		}
		//Function to add edge to the graph
		void addEdge(int v1,int v2) {
			adList[v1].add(v2);
		}
		//Function to perform BFS, taking initial vertex as parameter
		void Bfs(int s) {
			System.out.println("The BFS of given graph is:");
			boolean visited[]=new boolean[v];//Array to mark visited vertices
			LinkedList<Integer> Queue=new LinkedList<Integer>();//Queue to traverse over vertices breadth wise
			visited[s]=true;
			Queue.add(s);
			while(Queue.size()!=0) {
				s=(int) Queue.poll();
				System.out.println(s);
				Iterator i=adList[s].iterator();
				while(i.hasNext()) {
					int temp=(int) i.next();
					if(visited[temp]!=true) {
						visited[temp]=true;
						Queue.add(temp);
					}
					
				}
			}
			
		}
	}
	public static void main(String args[]) {
		Graph g=new Graph(15);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,5);
		g.addEdge(2,6);
		g.addEdge(3,7);
		g.addEdge(3,8);
		g.addEdge(4,9);
		g.addEdge(4,10);
		g.addEdge(5,11);
		g.addEdge(5,12);
		g.addEdge(6,13);
		g.addEdge(6,14);
		g.Bfs(0);
		
	}

}
