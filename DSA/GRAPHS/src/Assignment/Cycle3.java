package Assignment;

public class Cycle3 {
    public static int solve(boolean[][] graph, int n) {
        int count=0;
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            if (graph[i][j]){
                for (int k=0;k<n;k++){
                    if (k!=i){
                        if (graph[j][k]){
                            if (graph[i][k]){
                                count++;
                                graph[i][j]=false;
                                graph[j][i]=false;
                                graph[j][k]=false;
                                graph[k][j]=false;
                                graph[i][k]=false;
                                graph[i][k]=false;
                            }
                        }
                    }
                }
            }
        }

    }
       
    return count;
    }
}
