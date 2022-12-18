package Assignment;

public class Islands {
    public static int numConnected(int[][] edges, int n) {
return DFS(edges);

    }
    public static int DFS(int [][]edges){
    boolean visited[]=new boolean[edges.length];
    int num=0;
    for (int i=0;i< edges.length;i++){
        if (!visited[i]){
            num++;
            DFSHelp(edges,visited,i);
        }
    }
    return num;
    }

    private static void DFSHelp(int[][] edges, boolean[] visited,int sv ) {
        visited[sv]=true;
        int n= edges.length;
        for (int i=0;i<n;i++){
            if (edges[sv][i]!=0&&!visited[i]){
                DFSHelp(edges,visited,i);
            }

        }
    }
}
