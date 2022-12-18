public class Largestroworcolumn {
    public static void findLargest(int mat[][]){
        int row= mat.length;
        int column=mat[0].length;
        int max1=0;
        int max2=0;
        int maxindex1=0;
        int maxindex2=0;
        if (row==0){
            System.out.print("row"+" "+0+" "+"-2147483648");
        }
        for (int i=0;i<row;i++){ // for an ith row.
            int sum=0;
            for (int j=0;j<column;j++){
                sum=sum+mat[i][j];
            }
            if (sum>max1){
                max1=sum;
                maxindex1=i;
            }
        }
        for (int i=0;i<column;i++){ // for an ith column.
            int sum=0;
            for (int j=0;j<row;j++){
                sum=sum+mat[j][i];
            }
            if (sum>max2){
                max2=sum;
                maxindex2=i;
            }
        }
        if (max1>max2||max1==max2){
            System.out.print("row"+" "+maxindex1+" "+max1);
        }
        if (max2>max1){
            System.out.println("column"+" "+maxindex2+" "+max2);
        }
    }

}
