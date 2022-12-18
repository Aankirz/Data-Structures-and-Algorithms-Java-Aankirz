package Assignment;

public class LongestPiece {
    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public static int dfs(String[] edge, int n) {
        int max=0;
        if(n==1){
            return 1;
        }
        boolean visited[][]=new boolean[n][n];
       for (int i=0;i<n;i++) {
           String s = edge[i];
           for(int j=0;j<n;j++){
               if (s.charAt(j)=='1'){
                   visited[i][j]=true;
                   int count =1+findLargest(edge,visited,i,j,n);
                   if (count>max){
                       max=count;
                   }
               }
           }
       }
       return max;
    }

    private static int findLargest(String[] edge, boolean[][] visited, int i, int j, int n) {
    //just find in 4 dir
        int c1=0,c2=0,c3=0,c4=0;
       if (j+1<n){
           String s=edge[i];
           if (s.charAt(j+1)=='1'&&!visited[i][j+1]){
               visited[i][j+1]=true;
               c1=1+findLargest(edge,visited,i,j+1,n);
           }
       }
        if (i+1<n){
            String s1=edge[i+1];
            if (s1.charAt(i+1)=='1'&&!visited[i+1][j]){
                visited[i+1][j]=true;
                c2=1+findLargest(edge,visited,i+1,j,n);
            }
        }
        if (j-1>0){
            String s=edge[i];
            if (s.charAt(j-1)=='1'&&!visited[i][j-1]){
                visited[i][j-1]=true;
                c3=1+findLargest(edge,visited,i,j-1,n);
            }
        }
        if (i-1>0){
            String s2=edge[i-1];
            if (s2.charAt(i-1)=='1'&&!visited[i-1][j]){
                visited[i-1][j]=true;
                c4=1+findLargest(edge,visited,i-1,j,n);
            }
        }
        return c1+c2+c3+c4;
    }

}
