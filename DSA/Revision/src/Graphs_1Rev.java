import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs_1Rev {
public static void getPath(int edges[][],int v1,int v2){
    boolean visited[]=new boolean[edges.length];
   ArrayList<Integer>get= getPathHelp(edges,visited, v1, v2);
   if(get!=null){
       for (int elm:get){
           System.out.print(elm+" ");
       }
   }

}

    private static ArrayList<Integer> getPathHelp(int[][] edges, boolean[] visited,int v1 ,int v2) {
     if(v1==v2){
         ArrayList<Integer>ans=new ArrayList<>();
         visited[v2]=true;
         ans.add(v2);
         return ans;
     }
     visited[v1]=true;
     for(int i=0;i<edges.length;i++){
         if (edges[v1][i]==0&&!visited[i]){
           ArrayList<Integer>ans=  getPathHelp(edges,visited,i,v2);
           if(ans!=null){
               ans.add(v1);
               return ans;
           }

         }
     }
 return null;

    }


    
    public static void printDFS(int edges[][]){
        boolean visited[]=new boolean[edges.length]; //to mark it up.
        for (int i=0;i< edges.length;i++){
            if(!visited[i])  //for disconnected graphs.
            printHelperDFS(edges,i,visited);
        }
    }
    private static void printHelperDFS(int[][] edges, int sv,boolean visited[]) {//sv:starting vertex.
        System.out.println(sv);  //because here arrays index denotes the eleent.
        visited[sv]=true;
        int n =edges.length;
        for (int i=0;i<n;i++){
            if (edges[sv][i]==1&&!visited[i]){
                printHelperDFS(edges,i,visited);
            }
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();       //Taking Input for no. of Vertices.
        int e=s.nextInt();               //Taking Input for no. of Edges.

        int edges[][]=new int[v][v];   //adjacency matrix of size v*v

              //Taking Input for data of vertices and it's adjacent vertices
        for(int i=0;i<e;i++){
          int fv=s.nextInt();
          int sv=s.nextInt();
          edges[fv][sv]=1;   //indicates fv-sv and sv-fv.
          edges[sv][fv]=1;
        }        //considering 0 as start vertex and index acc. to the numeric value.
//        printDFS(edges);
//        printBFS(edges);
        int v1=s.nextInt();
        int v2=s.nextInt();
      
    }

    private static void printBFS(int[][] edges) {  //print adj node first
        boolean visited[]=new boolean[edges.length];
        for (int i=0;i< edges.length;i++){
            if (!visited[i]){
                printHelperBFS(edges,i,visited);
            }
        }
    }

    private static void printHelperBFS(int[][] edges, int sv, boolean[] visited) {
        System.out.println(sv);
        visited[sv]=true;
        Queue<Integer>pendingnode=new LinkedList<>();
        pendingnode.add(sv);
        while (!pendingnode.isEmpty()){
            int front= pendingnode.poll();
            for (int i=0;i< edges.length;i++){
                if (edges[front][i]==1&&!visited[i]){
                    System.out.println(i);
                    visited[i]=true;
                    pendingnode.add(i);
                }
            }
        }
    }


}
