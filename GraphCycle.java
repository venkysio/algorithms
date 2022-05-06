/*Java program to find whether a cycle exists in given graph*/
import java.util.Iterator;
import java.util.LinkedList;

public class GraphCycle {
	public static class Graph{
		int v;
		LinkedList<Integer> adList[];
		Graph(int size){
			v=size;//No.of vertices
			adList=new LinkedList[v];//Adjacency list to mark the edges
			//Initializing vertices using constructor
			for(int i=0;i<v;i++)
				adList[i]= new LinkedList<Integer>();
		}
		//Function to add edge to the graph
		void addEdge(int v1,int v2) {
			adList[v1].add(v2);
		}
		//Function to detect the cycle using BFS
		boolean Cycle(int s) {
			boolean visited[]=new boolean[v];//Array to mark visited vertices
			LinkedList<Integer> Queue=new LinkedList<Integer>();//Queue to traverse over vertices breadth wise
			visited[s]=true;
			Queue.add(s);
			while(Queue.size()!=0) {
				s=(int) Queue.poll();
				Iterator i=adList[s].iterator();
				while(i.hasNext()) {
					int temp=(int) i.next();
					if(visited[temp]==true)return true;
					else {
						visited[temp]=true;
						Queue.add(temp);
					}
					
				}
			}
			
		
			
			return false;
		}
	}	
	public static void main(String args[]) {
		Graph g=new Graph(8);
		g.addEdge(0,7);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(1,7);
		g.addEdge(2,4);
		g.addEdge(2,6);
		g.addEdge(3,5);
		
		boolean b=g.Cycle(0);
		if(b)System.out.println("Cycle exists");
		else System.out.println("Cycle does not exist");
		
		
	}



}
