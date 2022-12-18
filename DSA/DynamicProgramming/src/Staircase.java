public class Staircase {

    //StairCase
    public static int staircase(int n){//Recursion
        if (n==1||n==2){
            return n;       //all possible ways.
        }
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        return staircase(n-1)+staircase(n-2)+staircase(n-3);
    }
    public static int staircaseM(int n){//Memoization
        int storage[]=new int[n+1];
        for (int i=0;i<storage.length;i++){ //initialization necc to track only in memo
            storage[i]=-1;
        }
        return staircaseM(n,storage);
    }

    private static int staircaseM(int n, int[] storage) {
        if (n==1||n==2){ //base case
            storage[n]=n;  // just instead of dir returning o/p first store in array.
            return storage[n];
        }
        if (n==0){
            storage[0]=1;
            return storage[0];
        }
        if (n<0){
            return 0;
        }
        if (storage[n]!=-1){ //just an extra check
            return storage[n];
        }
        storage[n]=staircaseM(n-1,storage)+staircaseM(n-2,storage)+staircaseM(n-3,storage);
        return storage[n];
    }
    public static int staircaseDP(int n){//Dynamic Programming
        if(n==1){
            return 1;
        }
        int storage[]=new int[n+1];
        storage[0]=1;
        storage[1]=1;
        storage[2]=2;
        for (int i=3;i<storage.length;i++){
            storage[i]=storage[i-1]+storage[i-2]+ storage[i-3];
        }
        return storage[n];
    }
}
