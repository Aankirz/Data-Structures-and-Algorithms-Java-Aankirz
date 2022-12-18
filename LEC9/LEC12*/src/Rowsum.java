public class Rowsum {
    public static void rowWiseSum(int[][] mat){
        int row=mat.length;
        if(row==0){
            return;
        }
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
//    int row=mat.length;
//    int column=mat[0].length;
//  if (row!=0&&column!=0){
//      for (int i=0;i<row;i++){
//          int sum=0;
//          for (int j=0;j<column;j++){
//              sum=sum+mat[i][j];
//          }
//          System.out.print(sum+" ");
//  }
//
//    }else{
//      System.out.println();
//  }

    }

    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4},{5,6},{7,8}};
        rowWiseSum(arr);

    }

}
