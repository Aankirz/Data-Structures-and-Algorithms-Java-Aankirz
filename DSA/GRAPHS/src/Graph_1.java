import java.util.*;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

public class Graph_1 {
    //Return all Connected Components.(send an empty arraylist in the helper)
    private static ArrayList<Integer> returnAllConnected(int[][] edges, boolean[] visited, ArrayList<Integer> store,int sv) {
        store.add(sv);
        visited[sv]=true;
        for (int i=0;i<edges.length;i++){
            if(edges[sv][i]==1&&!visited[i]){
                returnAllConnected(edges,visited,store,i);
            }
        }
        return store;
    }
    //                        DFS

    public static  void printHelperDFS(int edges[][],int sv,boolean visited[]){
        System.out.println(sv);
        visited[sv]=true;//as soon as one element gets printed mark it visited.
        int n=edges.length;
        for (int i=0;i<n;i++){
               if (edges[sv][i]==1&&!visited[i]){ //if visited no need to print again.
                   //value 1 indicates that they have an edge.
                   printHelperDFS(edges,i,visited);//knowing visited is imp , otherwise infinite loop.
               }
        }
    }
    public static  void printDFS(int edges[][],int sv){
        boolean visited[]=new boolean[edges.length];
//        printHelper(edges,sv,visited); so we will check wether there's any element left unvisited.
        //and will start loop again for it.
        for (int i=0;i<edges.length;i++){
            if (!visited[i]){
                printHelperDFS(edges,i,visited); //so everything will get printed now.
            }
        }
    }

    //                         BFS

    public static  void printB(int edges[][],int sv,boolean visited[]){
        Queue<Integer>pending=new LinkedList<>();
        pending.add(sv);

        visited[sv]=true;
        while(!pending.isEmpty()){
            int front=pending.poll();
            System.out.print(front+" ");
            for (int i=0;i<edges.length;i++){
                if (!visited[i]&&edges[front][i]==1){
                    pending.add(i);
                    visited[i]=true;
                }

            }
        }
    }
    public static void BFS(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i< edges.length;i++){  //for connected componenets.
            if(!visited[i]){
                printB(edges,i,visited);
            }
        }
    }

    public static boolean hasPathHelp(int edges[][],int sv,int v2,boolean visited[]){
        Queue<Integer>pending=new LinkedList<>();
        Queue<Integer>pending1=new LinkedList<>();
        pending.add(sv);
        pending1.add(sv);
        visited[sv]=true;
        while (!pending1.isEmpty()){
            int front=pending1.poll();
            for(int i=0;i< edges.length;i++){
                if(pending.contains(v2)){
                    return true;
                }
                if(!visited[i]&&edges[front][i]==1){
                    pending.add(i);
                    pending1.add(i);
                    visited[i]=true;
                }
            }
        }
        return false;
    }
    public static boolean hasPath(int edges[][],int v1,int v2){
        boolean visited[]=new boolean[edges.length];
      return  hasPathHelp(edges,v1,v2,visited);
    }

    public static void getPathHelpDFS(int edges[][],int sv,int v2,boolean visited[]){
        if(visited[v2]){
            return;  //wrong answer in case of one element.
        }
        visited[sv]=true;
        for (int i=0;i<edges.length;i++){
            if (edges[sv][i]==1&&!visited[i]){
                getPathHelpDFS(edges,i,v2,visited);
            }
        }
        System.out.print(sv+" ");
    }
    public static void getPath(int edges[][],int v1,int v2){
        boolean visited[]=new boolean[edges.length];
//        getPathHelpDFS(edges,v1,v2,visited);
        getPathHelpBFS(edges,v2,v1,visited);
    }
    public static ArrayList<Integer> getPathHelpBFS(int edges[][],int sv,int v1,boolean visited[]){
        //Take the help of HASH MAPS point every vertex with it's pre until it reaches end.
        Queue<Integer>pending=new LinkedList<>();
        pending.add(sv);
        visited[sv]=true;
        ArrayList<Integer>path=new ArrayList<>();
        path.add(sv);
        HashMap<Integer,Integer>map=new HashMap<>();
        while (!pending.isEmpty()){
            int front=pending.poll();
            if (front==v1){
                return path;
            }
            for (int i=0;i< edges.length;i++){
                if (edges[front][i]==1&&!visited[i]){
                    pending.add(i);
                    path.add(i);
                    visited[i]=true;
                }
            }
        }
       return path;
    }

    public static  void isConnectedDFS(int edges[][],int sv,boolean visited[]){

        visited[sv]=true;//as soon as one element gets printed mark it visited.
        int n=edges.length;
        for (int i=0;i<n;i++){
            if (edges[sv][i]==1&&!visited[i]){ //if visited no need to print again.
                //value 1 indicates that they have an edge.
                isConnectedDFS(edges,i,visited);//knowing visited is imp , otherwise infinite loop.
            }
        }
    }
    public static  boolean isConnected(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        isConnectedDFS(edges,0,visited);
        for(int i=0;i< edges.length;i++){  //for connected componenets.
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)  throws NumberFormatException, IOException {
        int n;//no. of vertices.
        int e;//no.of edges.
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        e=s.nextInt();
        int edges[][]=new int[n][n];//2d adjacency matrix
        for (int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int v1=s.nextInt();
        int v2=s.nextInt();
        boolean visited[]=new boolean[edges.length];

        ArrayList<Integer>path=getPathHelpBFS(edges,v2,v1,visited);

        for (int i=0;i< path.size();i++){
            System.out.print(path.get(i)+" ");
        }
//
//        for (int i=0;i<edges.length;i++){
//            if(!visited[i]){
//                ArrayList<Integer>store=new ArrayList<>();
//                ArrayList<Integer>connected=returnAllConnected(edges,visited,store,i);
//        Collections.sort(connected);
//                for(int j=0;j< connected.size();j++){
//                    System.out.print(connected.get(i)+" ");
//                }
//                System.out.println();
//            }
//        }

//        System.out.println(isConnected(edges));
//        int v1=s.nextInt();
//        int v2=s.nextInt();
//        System.out.println(hasPath(edges,v1,v2));
////        print(edges,0);
//        BFS(edges);
//      if (hasPath(edges,v1,v2)){
//          getPath(edges,v1,v2);
//      }

    }



}
//but a bigger problem graph has also disconnected components.: 0-1-2,3-4;