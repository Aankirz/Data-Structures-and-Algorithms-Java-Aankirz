public class TotalSumBoundariesAndDia {
    public static void totalSum(int[][] mat) {
       int n=mat.length;
       int sum=0;
       //boundaries

            for(int j=0;j<mat[0].length;j++){
              sum+=mat[0][j];
           }
            for(int i=1;i<mat.length-1;i++){
                    sum+=mat[i][0];
                    sum+=mat[i][mat[i].length-1];
            }
            for(int j=0;j< mat[mat.length-1].length;j++){
                sum+=mat[mat.length-1][j];
            }
       //Diagonals
            for(int i=1;i<=n-2;i++){
                sum+=mat[i][i];
            }
            for(int i=0;i<=n-2;i++){
                for(int j=n-2;j>=1;j--){
                    sum+=mat[i+1][j];
                }
            }
            if(mat[0].length!=n){
                sum+=mat[0][n-1];
            }
            if (mat[n-1].length!=n){
                sum+=mat[n-1][n-1];
            }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String  str=new String("Hello");
        String str1="Hello";
        System.out.println(str1.indexOf('e'));

    }
}
