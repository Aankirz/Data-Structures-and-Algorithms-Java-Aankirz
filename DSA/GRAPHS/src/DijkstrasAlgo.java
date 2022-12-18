import java.util.*;
public class DijkstrasAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        int edges[][]=new int[V][V];
        for (int i=0;i<E;i++) {
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=s.nextInt();
            edges[sv][fv]=edges[fv][sv];
        }
        dijkstra(edges);
    }

    private static void dijkstra(int[][] edges) {
        boolean visited[]=new boolean[edges.length];
        int dist[]=new int[edges.length];
        dist[0]=0;
        for(int i=0;i<edges.length;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dijkstraHelper(edges,visited,dist);
    }

    private static void dijkstraHelper(int[][] edges, boolean[] visited, int[] dist) {
        for (int i=0;i<edges.length;i++){
            int mindistIndex=findMindist(dist,visited);
            visited[mindistIndex]=true;
            for (int j=0;j<edges.length;j++){
                if (edges[mindistIndex][j]!=0&&!visited[j]){
                    //curr dist= dist[mindistIndex]+weight[edge]; // Update only when the curre dist is smaller tha min.
                   int currdist=dist[mindistIndex]+edges[mindistIndex][j];
                    if (currdist<dist[j]){
                        dist[j]=currdist;
                    }
                }
            }
        }
        for (int i=0;i< edges.length;i++){
            System.out.println(i+" "+dist[i]);
        }
    }

    private static int findMindist(int[] dist, boolean[] visited) {
        int minindex=0;
        int mindist=Integer.MAX_VALUE;
        for (int i=0;i<dist.length;i++){
            if (!visited[i]){
                if(mindist>dist[i]){
                    mindist=dist[i];
                    minindex=i;
                }
            }
        }
        return minindex;
    }
}
