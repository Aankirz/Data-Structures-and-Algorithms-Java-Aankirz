package Array;

import java.util.Locale;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        //Using First Row and COLUMN AS MARKER.
        int row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            if (matrix[i][0]==0){
                for (int j=0;j<col;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<col;j++){
            if (matrix[0][j]==0){
                for (int i=0;i<row;i++){
                    matrix[i][j]=0;
                }
            }
        }
//        String str="";
//       for(int i=0;i<matrix.length;i++){
//           for(int j=0;j<matrix[0].length;j++){
//               if(matrix[i][j]==0){
//                   str=str+i+j;
//               }
//           }
//       }
//
//       int i=0;
//       while(i<str.length()){
//           int row=str.charAt(i)-48;
//           int col=str.charAt(i+1)-48;
//           setZeroMat(row,col,matrix);
//           i+=2;
//       }


    }

    private void setZeroMat(int row, int col, int[][] matrix) {
        for(int j=0;j< matrix[0].length;j++){
            matrix[row][j]=0;
        }
        for(int i=0;i< matrix.length;i++){
            matrix[i][col]=0;
        }
    }

    public static void main(String[] args) {
        String str="";
        str=str+7+9;
        int a='9'-48;
        System.out.println(str.charAt(0));
    }
}
