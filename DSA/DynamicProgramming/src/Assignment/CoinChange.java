package Assignment;

public class CoinChange {
    //    public static int countWaysToMakeChange(int denominations[], int value){//Recursion
//       //Base Case
//        if(value==1){
//            return 1;
//        }
//        if(value<=0){
//            return 0;
//        }
//        int ways[]=new int[denominations.length];
//        for (int i=0;i< denominations.length;i++){
//            ways[i]=countWaysToMakeChange(denominations,value-denominations[i]);
//        }
//        int sum=0;
//        for(int i=0;i<ways.length;i++){
//            sum+=ways[i];
//        }
//        return sum;
//    }
    public static long countWaysToMakeChangeM(int denominations[], int value) {//Memoization
        long storage[] = new long[denominations.length];
        for (int i = 0; i < storage.length; i++) {
            storage[i] = -1;  //storage is for final output not for possibilities.
        }
        return countWaysToMakeChange(denominations, value, storage);
    }

    private static long countWaysToMakeChange(int[] denominations, int value, long[] storage) {
        if (value == 1) {
            storage[1] = 1;
            return 1;
        }
        if (value <= 0) {
            storage[0] = 0;
            return 0;
        }
        if (storage[value] != -1) {
            return  storage[value];
        }
        long ways[] = new long[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            ways[i] = countWaysToMakeChange(denominations, value - denominations[i], storage);
        }
        int sum = 0;
        for (int i = 0; i < ways.length; i++) {
            sum += ways[i];
        }
        storage[value] = sum;
        return  storage[value];

    }

//    public static int countWaysToMakeChangeDP(int[] denominations, int value){//DP
//      int storage[]=new int[];
//    }
}

