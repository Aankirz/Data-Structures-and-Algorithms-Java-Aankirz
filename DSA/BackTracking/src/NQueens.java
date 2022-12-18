public class NQueens {
    public static void placeNQueens(int n){
        int board[][]=new int[n][n];
        placeNQueens(board,n,0,0, 0);
    }

    private static void placeNQueens(int [][] board,int n, int row,int i,int j) {
        if(i<0 || j<0 || i>=n || j>n-1 || board[i][j]==1 ) {
            return;
        }
        board[i][j]=1;
        if(row==n){
            for(int r=0;i<n;i++){
                for(int c=0;j<n;j++){
                    System.out.print(board[r][c]+" ");
                }
            }
            System.out.println();
            board[n-1][n-1]=0;
            return;
        }





    }

}
