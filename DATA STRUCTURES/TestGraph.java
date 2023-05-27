class Graph{
   boolean adjMatrix[][];
   int numVertices;
   Graph (int numVertices)
   {
      this.numVertices=numVertices;
      adjMatrix=new boolean[numVertices][numVertices];
   }
   void addEdges(int i,int j)
   {
      adjMatrix[i][j]=true;
      adjMatrix[j][i]=true;
   }
   void printadjMatrix()
   {
      System.out.println("the element of adj Matrix graph are:");
      for(int i=0;i<numVertices;i++)
      {
          System.out.print(i+" -> ");
          for( int j=0;i<numVertices;j++)
          {
              if(adjMatrix[i][j] == true)
              System.out.print(1+" ");
              else
              System.out.print(0+" ");
          }
          System.out.println();
      }
   }
  } 
   class TestGraph
   {
      public static void main(String args[])
      {
          Graph g=new Graph (5);
          g.addEdges(0,1);
          g.addEdges(1,2);
          g.addEdges(1,3);
          g.addEdges(3,1);
          g.printadjMatrix();
      }
   }
  