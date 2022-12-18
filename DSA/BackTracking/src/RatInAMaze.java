public class RatInAMaze {

    //Backtracking Approach
    public static boolean ratInAMaze(int maze[][]){
      int n=maze.length;
      int path[][]=new int[n][n];
      return solveMaze(maze,0,0,path);
    }
    public static boolean solveMaze(int[][]maze,int i,int j,int [][]path){
        int n=maze.length;
        if(i<0||j<0||i>=n||j>=n||maze[i][j]==0||path[i][j]==1){
            //Don't forget to write the conditions in sequence.
            return false;
        }
        //Include the cell in Current Path
        path[i][j]=1;
        //Destination Cell
        if(i==n-1&&j==n-1){
            return true;
        }

        //Explore further in all directions
        //top
        if(solveMaze(maze,i-1,j,path)){
            return true;
        }
        //right
        if(solveMaze(maze,i,j-1,path)){
            return true;
        }
        //left
        if(solveMaze(maze,i,j-1,path)){
            return true;
        }
        //down
        if(solveMaze(maze,i+1,j,path)){
            return true;
        }
        return false;

    }
    static void ratInAMaze(int maze[][], int i,int j,int [][]path) {
        int n=maze.length;
        if(i<0||j<0||i>=n||j>=n||maze[i][j]==0||path[i][j]==1){
            //Don't forget to write the conditions in sequence.
           return;
        }
        //Include the cell in Current Path
        path[i][j]=1;
        //Destination Cell
        if(i==n-1&&j==n-1){
           for(int r=0;r<n;r++){
               for(int c=0;c<n;c++){
                   System.out.print((path[r][c]+" "));

               }
           }
            System.out.println();
           path[i][j]=0;
           return;
        }

        //Explore further in all directions
        //top
        ratInAMaze(maze,i,j-1,path);
        //left
        solveMaze(maze,i,j-1,path);
        //down
        solveMaze(maze,i+1,j,path);
path[i][j]=0;

    }
    static void ratInAMaze(int maze[][], int n) {
        int path[][]=new int[n][n];
        ratInAMaze(maze,0,0,path);
    }
    //    public static boolean ratInAMaze(int maze[][],int i,int j){
//        if(i==2&&j==2){
//            if(maze[i][j]==0){
//                return false;
//            }
//            return true;
//        }
//        if(i<3&&j+1<3&&maze[i][j+1]==1){
//            return ratInAMaze(maze,i,j+1);
//        }
//        if(i+1<3&&j<3&&maze[i+1][j]==1 ){
//            return ratInAMaze(maze,i+1,j);
//        }
//        return false;
//    }
    
}
