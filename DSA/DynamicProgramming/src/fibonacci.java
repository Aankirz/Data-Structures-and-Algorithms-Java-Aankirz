public class fibonacci {
    public static int fib(int n){
        if(n==0||n==1){
            return n;  //O(2^n): as calculating same data again and again.
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fibM(int n){ //Better Approach
//Making a storage array to store n+1 elements(fib(i)->ith index)
        int storage[]=new int[n+1];
        for (int i=0;i< storage.length;i++){
            storage[i]=-1; //initially
        }
        return fibM(n,storage);
    }
                           ///MEMOIZATION TECHNIQUE :memorising things and storing them so not to calculate again and again.
                  //TOP DOWN APPROACH
    private static int fibM(int n, int[] storage) {
     if(n==0||n==1){
         storage[n]=n;
         return storage[n];
     }
     if (storage[n]!=-1){          //Total (2n-1) calls.
         return storage[n];   //O(2n-1);
     }
     storage[n]=fibM(n-1,storage)+fibM(n-2,storage);
     return storage[n];
    }

           //DYNAMIC PROGRAMMING
    public static int fibDP(int n){
        int storage[]=new int[n+1];
        storage[0]=0;
        storage[1]=1;
        for (int i=0;i< storage.length;i++){
            storage[i]=storage[i-1]+ storage[i-2];
        }
        return storage[storage.length-1];
    }

    public static void main(String[] args) {
        int n=44;
        System.out.println(fib(n));
        System.out.println(fibM(n));
        System.out.println(fibDP(n));
    }
}
