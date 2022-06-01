# program to implement prim's Algorithm

#function takes graph as an input and return minimum weight spanning tree

def prims_mst(graph):
    weight=0
    visited=[]
    temp={}
    first=list(graph.keys())[0]
    visited.append(first)
    while len(visited) != len(list(graph.keys())) :
        for vertex in list(graph[visited[-1]].keys()) :
            if vertex not in visited :
                if vertex in list(temp.keys()):
                    temp[vertex]=min(temp[vertex],graph[visited[-1]][vertex])
                else:
                    temp[vertex]=graph[visited[-1]][vertex]

        visited.append(min(list(temp.keys())))
        weight+=temp[visited[-1]]
        del temp[visited[-1]]
    return visited,weight
                       

# Test drive code:
graph={}
n=int(input("Enter no of vertices in the Graph : "))
for i in range(1,n+1):
    vertex=input(f"Enter vertex number {i}: ")
    graph[vertex]={}
    n1=int(input(f"Enter no of adjecent vertices of {vertex}: "))
    for j in range(1,n1+1):
        adjecent,weight=list(map(str,input(f"Enter {j}th adjecent vertex and weight of {vertex} vertex: ").split()))
        graph[vertex][adjecent]=int(weight)
result=prims_mst(graph)
print(f"The minimum weight spanning tree of the graph is {result[0]} and its weight is {result[1]}" )

                       
                    
                   
                
        
        
                             
