import java.util.*;
public class Prim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        int edges[][]=new int[V][V];
        for (int i=0;i<E;i++){  // !!!!!  It's E not V
            int fv=s.nextInt();
            int sv=s.nextInt();

            edges[fv][sv]=s.nextInt();//storing it's weight.
            edges[sv][fv]=edges[fv][sv];
        }

        primsMST(edges);
    }

    private static void primsMST(int[][] edges) {

        boolean visited[]=new boolean[edges.length];

        int weight[]=new int[edges.length];
        int parent[]=new int [edges.length];
        weight[0]=0;
        parent[0]=-1;
        for (int i=1;i< edges.length;i++){
            weight[i]=Integer.MAX_VALUE;

        }
        weight[0]=0;
        parent[0]=-1;  //dry running with an example.
        for (int i=0;i< edges.length;i++){
            int minvertex=findMinVertex(weight,visited);
            visited[minvertex]=true;//choosing 0 as source.
            for (int j=0;j< edges.length;j++){
                if(edges[minvertex][j]!=0&&!visited[j]){ //it means has an edge with 0.
                   // Wrong statement:if it has an edge then update it's parent array and weight array.
                    //Right statement: if it has an edge and weight of that edge is smaller then it's neighbour then only update.
                  if (edges[minvertex][j]<weight[j]){
                      parent[j]=minvertex;
                      weight[j]=edges[minvertex][j];
                  }

                }
            }
        }
        for(int i=0;i<edges.length;i++){
            if(parent[i] < i){
                System.out.println(parent[i] + " "+ i +" "+ weight[i]);
            }else{
                System.out.println(i + " "+ parent[i] +" "+ weight[i]);
            }
        }
    }

    private static int findMinVertex(int[] weight, boolean[] visited) {
        int minVertex = -1;
        for(int i = 0; i < weight.length; i++){
            if(!visited[i]  && (minVertex == -1 || weight[i] < weight[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

//    private static void primsMSTHelp(int[][] edges, int source, boolean[] visited, int[] weight, int[] parent) {
//        //Approach to store parent array.
//
//        //First find Min Vertex.
////        visited[source]=true;
////        int min=Integer.MAX_VALUE;
////        int minval=0;
////        for(int i=0;i< edges.length;i++){
////            if (edges[source][i]!=0&&!visited[i]){
////                //now since they have an edge so we need to update it's weight if it is smaller than the prev one as well as it's parent too.
////              if (edges[source][i]<weight[i]){
////                  parent[i]=source;
////                  weight[i]=edges[source][i];
////                 if (min>weight[i]){
////                     min=weight[i];
////                     minval=i;
////                 }
////              }
////            }
////        }
////        System.out.println(source+" "+minval+" "+weight[minval]); //problm here is how to backtrack 3 with 0 when we found that it has no relatn with 4.
////        primsMSTHelp(edges,minval,visited,weight,parent);//so we need to store somewhere and then print accordingly.
//        //Next step
//    }
}
