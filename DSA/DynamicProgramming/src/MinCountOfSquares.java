public class MinCountOfSquares {
    //Recursion Approach
    public static int minCount(int x) {
        if (x<=0){
            return 0;
        }
        int y=Integer.MAX_VALUE,z=Integer.MAX_VALUE;
        int a=minCount(x-1);
        if (x>=4){
             y=minCount(x-4);
        }
       if (x>=9){
            z=minCount(x-9);
       }

        return 1+Math.min(a,Math.min(y,z));
    }
                       //Memorization Approach
    public static int minCountM(int n) {
        int storage[]=new int[n+1];
        return minCountM(n,storage);
    }
    public static int minCountM(int n,int[] storage) {
        if (n<=0){
            return 0;
        }
        if (storage[n]!=0){
            return storage[n];
        }
        int y=Integer.MAX_VALUE,z=Integer.MAX_VALUE;
        int x=minCount(n-1);
        if (n>=4){
            y=minCount(n-4);
        }
        if (n>=9){
            z=minCount(n-9);
        }
     storage[n]=1+Math.min(x,Math.min(y,z));
        return storage[n];

    }

    //DP Approach(bottom to top)
    public static int minCountDP(int n){
        //S1:Size of Array
        int[] storage=new int[n+1];
        //Bottom = Base Case but not condition direct order.
       storage[0]=0;
       storage[1]=1;
       //Recursive calls -> arrays(Aim: adding up the ways to get n in minimum case possible)
       for (int i=2;i<=n;i++){
           int y=Integer.MAX_VALUE,z=Integer.MAX_VALUE;
           int x=storage[i-1];  //i not n because building it up.

           if (i>=4){
               y=storage[i-4];
           }
           if (i>=9){
               z=storage[i-9];
           }
           storage[i]=1+Math.min(x,Math.min(y,z));
       }
       return storage[n];
    }
}
