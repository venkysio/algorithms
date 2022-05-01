/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Dijstra's Algorithm*/

import java.util.LinkedList;

public class VSDDijsktras {
	//Class to represent the structure of the edge along with weights
public static class VsdEdge {
		int Vsdsource;
		int Vsddestination;
		int Vsdweight;
		public VsdEdge(int Vsdsource, int Vsddestination, int Vsdweight) {
			 this.Vsdsource = Vsdsource;
			 this.Vsddestination = Vsddestination;
			 this.Vsdweight = Vsdweight;
		}
}
//Class to represent the structure of the graph	
public static class VsdGraph{
	int Vsdvertices;//No.of vertices
	LinkedList<VsdEdge> VsdadList[];//Adjacency list to mark the edges
	//Initializing vertices using constructor
	VsdGraph(int Vsdsize){
		Vsdvertices=Vsdsize;
		VsdadList=new LinkedList[Vsdvertices];
		for(int i=0;i<Vsdvertices;i++)
			VsdadList[i]= new LinkedList<VsdEdge>();
		}
	//Function to add edge to the graph
	public void VsdaddEgde(int Vsdsource, int Vsddestination, int Vsdweight) {
		VsdEdge Vsdedge = new VsdEdge(Vsdsource, Vsddestination, Vsdweight);
		VsdadList[Vsdsource].addLast(Vsdedge); // adding new edge to the list
	}
	
	
 public  void Vsddijkstra(VsdGraph graph) {
		   int Vsdcount = graph.Vsdvertices;//no.of  vertices
		  boolean[] VsdvisitedVertex = new boolean[Vsdcount];//Array to mark the vertices alredy visited
		   int[] Vsddistance = new int[Vsdcount];
		   for (int i = 0; i < Vsdcount; i++) {
			   VsdvisitedVertex[i] = false;
			   Vsddistance[i] = 999999;
		    }
		   Vsddistance[0] = 0;//Starting vertex
		    for (int i = 0; i < Vsdcount; i++) {
		    		int VsdminDistance = 999999;
		    		int u = 0;//Source vertex
		    		//Finding next minimum distance
		    		for (int k = 0; k <Vsdcount; k++) {
		    			if (!VsdvisitedVertex[k] && Vsddistance[k] < VsdminDistance) {
		    				VsdminDistance = Vsddistance[k];
		    				u = k;
		    			}
		    		}
		    		
		    		VsdvisitedVertex[u] = true;//marking the vertex as visited and Updating the distancesof vertices connected to it
		    		LinkedList<VsdEdge> list = VsdadList[u];
		    		 for(int j=0;j<list.size();j++) {
		    			 if ((!VsdvisitedVertex[list.get(j).Vsddestination])&& (Vsddistance[u] + list.get(j).Vsdweight<
		    					 Vsddistance[list.get(j).Vsddestination])){
		    				 Vsddistance[list.get(j).Vsddestination] = Vsddistance[u] + list.get(j).Vsdweight;
		    			 }
		    		 }
		    	
		    }
		    
		  for (int i = 0; i < Vsddistance.length; i++) {
		      System.out.println("Distance from 0 to "+i+" is "+Vsddistance[i]);
		    }

		  }
		
}

public static void main(String args[]) {
	VsdGraph g=new VsdGraph(7);
		g.VsdaddEgde(0,1,4);
		g.VsdaddEgde(1,0,4);
		g.VsdaddEgde(0,2,3);
		g.VsdaddEgde(2,0,3);
		g.VsdaddEgde(0,3,2);
		g.VsdaddEgde(3,0,2);
		g.VsdaddEgde(1,3,1);
		g.VsdaddEgde(3,1,1);
		g.VsdaddEgde(1,4,6);
		g.VsdaddEgde(4,1,6);
		g.VsdaddEgde(2,3,4);
		g.VsdaddEgde(3,2,4);
		g.VsdaddEgde(3,5,4);
		g.VsdaddEgde(5,3,4);
		g.VsdaddEgde(4,5,3);
		g.VsdaddEgde(5,4,3);
		g.VsdaddEgde(4,6,2);
		g.VsdaddEgde(6,4,2);
		g.VsdaddEgde(5,6,4);
		g.VsdaddEgde(6,5,4);
		g.Vsddijkstra(g);
	}
	}





