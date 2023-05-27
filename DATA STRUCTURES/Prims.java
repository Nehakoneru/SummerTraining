 class WeightedGraph{
    int adjMatrix[][];
    int numVertices;
    WeightedGraph (int numVertices)
    {
       this.numVertices=numVertices;
       adjMatrix=new  int[numVertices][numVertices];
    }
    void addEdges(int i,int j,int w)
    {
       adjMatrix[i][j]=w;
       adjMatrix[j][i]=w;

    }
    void printadjMatrix()
    {
       System.out.println("AdjacentMatrix  is:");
       for(int i=0;i<numVertices;i++)
       {
           System.out.print(i+" -> ");
           for( int j=0;j<numVertices;j++)
           {
               System.out.print(adjMatrix[i][j]+ " ");
           }
           System.out.println();
       }
    }
    static void finMST(WeightedGraph){
        int size=g.adjMatrix.length;
        int parent[]=new int[size];
        int value[]=new int[size];
        boolean visited[]=new boolean[size];
        for(int i=0; i<size; i++)
        {
            value[i]=Integer.MAX_VALUE;
            parent[i]=-1;
        }
        value[0]=0;
        for(int i=0; i < size; i++){
            int u = findMinnum(Visited,value);
            visited[u]=true;
            for(it j = 0;j< size; j++){
                if(g.adjMatrix[u][j]!= 0 && visited[j]==false&&g.adjMatrix[u][j]<value[j])
                {
                    value[j]=g.adjMatrix[u][j];
                    parent[j]=u;
                }
            }
            for(int i=1;i<size; i++){
                System.out.println("u->v : "+parent[i]+" -> "+i+ " wt : "+g.adjMatrix[parent[i][j]]);

            }

        }
        public static void main(String[args])
        {
           WeightedGraph g=new WeightedGraph (6);
           g.addEdges(0,1,4);
           g.addEdges(0,2,6);
           g.addEdges(1,2,6);
           g.addEdges(1,3,3);
           g.addEdges(1,4,4);
           g.addEdges(2,3,1);
           g.addEdges(3,4,2);
           g.addEdges(5,4,7);
           g.addEdges(5,3,3);
           g.printadjMatrix();
       }
    }
   
   