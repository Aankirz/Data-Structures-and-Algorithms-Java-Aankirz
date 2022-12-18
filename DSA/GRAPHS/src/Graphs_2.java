import java.util.ArrayList;
import java.util.*;
 class Edge implements Comparable<Edge>{ //for edge type comparable needed for normal int not.
    int source;
    int destination;
    int weight;

     @Override
     public int compareTo(Edge o) { //since only need to sort weights.
         return this.weight-o.weight;//has to be sorted on the basis of weights of edge class
         //for dec o.weight-this.weight
     }
 }
class Kruskal {
     
public static void Kruskals(Edge input[],int V){
         Arrays.sort(input);//now this fn acts normal for int,double,float.
Edge output[]=new Edge[V-1];

int parent[]=new int[V];
for (int i=0;i<V;i++){
    parent[i]=i;
}
int count=0;//no. of edges that has come to our mst.
    int i=0;//current edge we are working on.

    while(count!=V-1){
     Edge currentEdge=input[i];
//Respective Parents are stored.
     int sourceParent=findParent(currentEdge.source,parent);
     int destinationParent=findParent(currentEdge.destination,parent);

     if (sourceParent!=destinationParent){
         output[count]=currentEdge;
         count++; // now we need to make one parent and child among v1 AND v2.
         parent[sourceParent]=destinationParent;
     }
     i++;
    }
for (int j=0;j<V-1;j++){
    if (output[j].source<output[j].destination){
        System.out.println(output[j].source+" "+output[j].destination+" "+output[j].weight);
    }else {
        System.out.println(output[j].destination+" "+output[j].source+" "+output[j].weight);
    }
}

}

    private static int findParent(int v, int[] parent) {
if (parent[v]==v){
    return v;
}
//but if not then it's a child and now finding it's parent;
return findParent(parent[v],parent);  //Think like a tree root
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        Edge input[]= new Edge[E];//Input Array(of E)
        for (int i=0;i<E;i++){
             //Now Every vertex has its source destination and weight.
            input[i]=new Edge(); //creating a new edge class for every edge.
            input[i].source=sc.nextInt();
            input[i].destination=sc.nextInt();
            input[i].weight=sc.nextInt();
        }
        Kruskals(input,V);

    }
}
