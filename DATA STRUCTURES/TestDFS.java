import java.util.*;
import java.util.Stack;
import java.util.LinkedList;
class Graph2
{
	LinkedList adjList[];
	Stack<Integer> s;;
  boolean visited[];
  	  Graph2(int vertices )
    {
		adjList=new LinkedList[vertices];
  		visited=new boolean[vertices];
		s = new Stack<Integer>();
        for(int i=0;i<vertices; i++)
        {
            adjList[i]=new LinkedList<Integer>();        
			}
    }
    void addEdges(int i,int j)
    {
        adjList[i].add(j);
        adjList[j].add(i);
    }
    void printAdjList()
    {
        System.out.println("The elemnets of adjListGraph: ");
      for(int i=0; i<adjList.length;i++)
      {
        System.out.println(i+" -> "+adjList[i]);
      }

    }
	void DFS(int idx)
	{
		System.out.print(idx+" ");
		visited[idx]=true;
		Iterator itr=adjList[idx].iterator();
		while(itr.hasNext()){
			int v=(int)itr.next();
			if(!visited[v]&&!s.contains(v))
				s.push(v);
		}
		if(!s.empty())
			DFS(s.pop());
	}
}
class TestDFS{
    public static void main(String args[])
    {
        Graph2 g = new Graph2(4);
       // g.craeteAdjLists();
        g.addEdges(0,1);
        g.addEdges(0,2 );
        g.addEdges(0,3 );
        g.addEdges(1,2);
        g.printAdjList();
				g.DFS(0);
    }
    
}
