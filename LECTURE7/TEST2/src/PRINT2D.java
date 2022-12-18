public class PRINT2D {
    public static void print2DArray(int input[][]){
        int row=input.length;
        int column=input[0].length;
        for (int i=0;i<row;i++){
            for (int k=1;k<=row-i;k++){
                for (int j=0;j<column;j++){
                    System.out.print(input[i][j]);
                }
                System.out.println();
            }

        }
    }


}
