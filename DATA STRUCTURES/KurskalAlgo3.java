import java.util.ArrayList;
import java.util.Comparator;

import javax.lang.model.util.ElementScanner14;

class KEdge{
    int source;
    int dest;
    int weight;
    KEdge(int source,int dest, int weight){
        this.source = source;
        this.dest = dest;
        this.weight =weight;
    }
    public int compareTo(Object ob)
    {
        Edge other=(Edge)ob;
        if(this.wt<other.wt)
            return-1;
            else if(this.et<other.wt)
                return 1;
                ElementScanner14return 0;
                ElementScanner14

    }
}
public class KurskalAlgo3 {
    int n , e;
    KurskalAlgo3(int n, int e){
        this.n = n;
        this.e = e;
    }
    ArrayList<KEdge> edges = new ArrayList<>(n);
    void addEdges(KEdge n){
        edges.add(n);
    }
    void kurskalMST() {
        Comparator<KEdge> comparator = new Comparator<KEdge>() {
            public int compare(KEdge edge1, KEdge edge2) {
                return edge1.weight - edge2.weight;
            }
        };
        // edges are sorted here according to their weights
        edges.sort(comparator);
        // creating empty min span tree array
        KEdge [] output = new KEdge[e];
        int [] parent =new int[n];
        for(int i =0; i< n;i++){
            parent[i] = i;
        }
        int count =0;
        int i = 0;
        while(count != n-1){
            KEdge current = edges.get(i);

            int sourcePar = findParent(current.source,parent);
            int destPar = findParent(current.dest,parent);

            if(sourcePar != destPar){
                output[count] = current;
                count++;
                parent[sourcePar] = destPar;
            }
            i++;
        }
        for(int j = 0; j< n-1;j++){
            if(output[j].source < output[j].dest)
            System.out.println(output[j].source+"--> " +output[j].dest +" ==>"+output[j].weight);
            else System.out.println(output[j].dest +"--> "+ output[j].source+" ==>"+output[j].weight);
        }
    }
    int findParent(int v, int [] parent){
        if(parent[v] == v) return v;
        return findParent(parent[v],parent);
    }

    public static void main(String[] args) {
        KEdge k6 = new KEdge(2,3,7);
        KEdge k1 = new KEdge(0,1,1);
        KEdge k5 = new KEdge(4,1,6);
        KEdge k3 = new KEdge(2,4,4);
        KEdge k2 = new KEdge(1,2,2);
        KEdge k4 = new KEdge(4,0,5);
        KEdge k7 = new KEdge(4,3,8);
//        KEdge k6 = new KEdge(2,3,1);
//        KEdge k1 = new KEdge(0,1,2);
//        KEdge k5 = new KEdge(4,1,3);
//        KEdge k3 = new KEdge(2,4,4);
//        KEdge k2 = new KEdge(1,2,5);
//        KEdge k4 = new KEdge(4,0,6);
//        KEdge k7 = new KEdge(4,3,7);

        KurskalAlgo3 k  = new KurskalAlgo3(5,4);
        k.addEdges(k1);
        k.addEdges(k2);
        k.addEdges(k3);
        k.addEdges(k4);
        k.addEdges(k5);
        k.addEdges(k6);
        k.addEdges(k7);
        k.kurskalMST();
    }
}