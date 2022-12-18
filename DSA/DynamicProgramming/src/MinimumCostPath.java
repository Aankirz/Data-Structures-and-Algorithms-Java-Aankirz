public class MinimumCostPath {

                    //RECURSION
    public static int minCostPath(int[][] input) {
       return minCostPath(input,0,0); //rather than passing on a 2d array
        //pass it the range.
    }
    //we need to travel from a(0,0)-->a(m-1,n-1);
    public static int minCostPath(int[][] input,int i,int j){
        int m=input.length;   //defining range
        int n=input[0].length;

        if (i==m-1 && j==n-1){
            return input[i][j]; //Base Case
        }
        if (i>=m||j>=n){  //check wether element in the grid or not
            return Integer.MAX_VALUE;
        }
        //Possible ways to reach the target.
        int opt1=minCostPath(input,i+1,j);
        int opt2=minCostPath(input,i,j+1);
        int opt3=minCostPath(input,i+1,j+1);

        //Adding the cost of particular node.
        return input[i][j]+Math.min(opt1,Math.min(opt2,opt3));
    }

             //MEMORIZATION( if the path is redundant use it from memory(storage[]) don't calculate again)
    public static int minCostPathM(int[][] input){
        int m = input.length;
        int n = input[0].length;
        int storage[][] = new int[m][n];
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                storage[i][j] = -1;
            }
        }
        return minCostPathM(input,0,0,storage);
    }
//Goal: to reach from a(0,0) to target a(m-1,n-1)
    private static int minCostPathM(int[][] input, int i, int j, int[][] storage) {
        int m=input.length;
        int n=input[0].length;
        if (i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if (i==m-1 && j==n-1){
            storage[m-1][n-1]=input[i][j];
            return  storage[i][j];
        }

        if(storage[i][j]!=-1){ //means the path is redundant.
            return storage[i][j];
        }
            int opt1=minCostPathM(input,i,j+1,storage);
            int opt2=minCostPathM(input,i+1,j+1,storage);
            int opt3=minCostPathM(input,i+1,j,storage);

            storage[i][j]=input[i][j]+Math.min(opt1,Math.min(opt2,opt3));
        return storage[i][j];

    }

    public static void main(String[] args) {
        int arr[][]={{1,1,1},{4,5,2},{7,8,9}};
        System.out.println(minCostPathM(arr));
    }
}
