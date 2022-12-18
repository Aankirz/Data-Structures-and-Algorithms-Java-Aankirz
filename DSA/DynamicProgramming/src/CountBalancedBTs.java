public class CountBalancedBTs {
            //modulo
    public static long balancedBTs(long n){
        int mod=(int)Math.pow(10,9)+7;
        return balancedBTs(n,mod);
    }
    public static long balancedBTs(long n,int mod){
        if (n==0||n==1){ //base case
            return 1;
        }                 //too big to be stored in an integer so long.
               //NOT UNDERSTOOD
        //NOT UNDERSTOOD
        //NOT UNDERSTOOD
                 //x=lh, y=rh  lh-rh=-1,0,1;(sum of all possible configurations);
        long lh=balancedBTs(n-1);
        long rh=balancedBTs(n-2);

        long value1=(lh*lh)%mod;
        long value2=(2*lh*rh)%mod;
                  //so compress by mod in each step.
        return (value1+value2)%mod;// product of total different type of configurations possible.
    }
    //Dp
   public static int balancedBTs(int height){
        if(height==0||height==1)
        return 1;
        if(height==2)
            return 3;
        int storage[]=new int[height+1];
        storage[0]=0;
        storage[1]=1;
        storage[2]=3;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=3;i<storage.length;i++){
          int lh=storage[i-1];
          int rh=storage[i-2];

            long value1=(lh*lh);
            long value2=(2*lh*rh);

            int a=(int )(value1%mod);
            int b=(int)(value2%mod);

            storage[i]=(a+b)%mod;

        }
       return storage[height];
   }
//    int x = countBalancedBTs( h - 1);

//    int y = countBalancedBTs(h - 2);
//    long res1 = (long)x * x;
//    long res2 = (long)x * y * 2;
//    int value1 = (int)(res1 % mod);
//    int value2 = (int)(res2 % mod);
//		return  (value1 + value2) % mod;
    //Memoization Approach
//    public static long balancedBTsM(long n){
//        long storage[]=new long[(int) (n*n)];
//        return balancedBTsM(n,storage);
//    }
//    public static long balancedBTsM(long n,long storage[]){
//
//    }
    }
