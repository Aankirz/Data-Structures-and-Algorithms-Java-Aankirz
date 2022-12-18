public class ReturnSubsetssumK {
    public static int[][] subsetsSumK(int input[], int k,int si){
        if (si == input.length){
            if (k==0){
                return new int[1][0];
            }else{
               return new int[0][0];
            }
        }
        int output1[][]=subsetsSumK(input,k-input[si],si+1);  //small ans or collector.
        int output2[][]=subsetsSumK(input,k,si+1);
        int output[][]= new int[output1.length+ output2.length][];
        int l=0;
        for (int i=0;i< output2.length;i++){
            output[i]=new int[output2[i].length];
            for (int j=0;j< output2[i].length;j++)
                output[l][j]=output2[i][j];//////
            l++;
        }
        for (int i=0;i< output1.length;i++){
            output[i+l]=new int[output1[i].length+1];
            output[i+l][0]=input[si];
            for (int j=1;j<=output1[i].length;j++){
                output[i+l][j]=output1[i][j-1];
            }

        }
        return output;
    }
    public static int[][] subsetsSumK(int input[], int k){
        return subsetsSumK(input, k,0);
    }


    public static void main(String[] args) {
        int input[]={3,2,5,6};
        int result[]=new int[0];
        int ans[][]=subsetsSumK(input,8,0);
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
