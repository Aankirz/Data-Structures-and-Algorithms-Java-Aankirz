public class ReturnSubsetArray2D {
    public static int[][] subsets(int arr[], int si) {
   if (si== arr.length){
       return new int[1][0];
   }
       int smallans[][]=subsets(arr,si+1);  //Recursive calls or Recursion's work.

       int ans[][]=new int[2* smallans.length][];
       int k=0;
       for (int i=0;i< smallans.length;i++){
           ans[i]=new int[smallans[i].length];
           for (int j=0;j< smallans.length;j++){
               ans[i][j]=smallans[i][j];
           }
           k++;
       }
       for (int i=0;i< smallans.length;i++){
       ans[k]=new int[smallans.length+1];
       ans[k][0]=arr[si];
       for (int j=0;j< smallans.length;j++){
           ans[k][j+1]=smallans[i][j];
       }
       k++;
       }
       return ans;
    }
    public static void print(int[][] output){
        for (int i=0;i<output.length;i++){
            for (int j=0;j<output[i].length;j++){
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input[]={1,2,3};
        int output[][]=subsets(input,0);
       print(output);
    }

}
