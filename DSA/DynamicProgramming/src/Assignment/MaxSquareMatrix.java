package Assignment;

public class MaxSquareMatrix {

    public static int findMaxSquareWithAllZeros(int[][] input){
        int storage[][]=new int[input.length][input[0].length];
       if (input.length==0){
           return 0;
       }

        //BASE CASE :for 1st row and 1st column.
        for (int j=0;j<input[0].length;j++){
            if (input[0][j]==0){
                storage[0][j]=1;
            }else{
                storage[0][j]=0;
            }
        }
        for (int i=1;i<input.length;i++){
            if (input[i][0]==0){
                storage[i][0]=1;
            }else{
                storage[i][0]=0;
            }
        }
int max=Integer.MIN_VALUE;
        //Recursive Call
        for (int i=1;i<input.length;i++){
            for (int j=1;j<input[0].length;j++){
                if (input[i][j]==0){// remember:[0] element itself 1 square.
                      storage[i][j]=1+Math.min(storage[i-1][j-1],Math.min(storage[i-1][j],storage[i][j-1]));
                }else{
                    storage[i][j]=0;
                }
                if (storage[i][j]>max){
                    max=storage[i][j];
                }
            }
        }
        return max;
    }
}
