public class KnapSack {
    //Recursion
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight,int i) {
        if (i==n||maxWeight==0){
            return 0;// leave the value.
        }
        if (weights[i]>maxWeight){
            return knapsack(weights, values, n, maxWeight, i+1);
        }
          //Two Options either leave it or puck it.
        int opt1=values[i]+knapsack(weights, values, n, maxWeight-weights[i], i+1);
        int opt2=knapsack(weights,values,n,maxWeight,i+1);

        return Math.max(opt1,opt2);
    }
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight){
        return knapsack(weights, values, n, maxWeight,0);
    }
//Memoization
    public static int knapsackM(int[] weights, int[] values, int n, int maxWeight){
        int storage[]=new int[n+1];
        for (int i=0;i< storage.length;i++){
            storage[i]=-1;
        }
        return knapsackM(weights,values,n,maxWeight,storage,0);
    }

    private static int knapsackM(int[] weights, int[] values, int n, int maxWeight, int[] storage,int i) {
        if (i==n||maxWeight==0){
            storage[i]=0;
            return 0;// leave the value.
        }
        if (storage[i]!=-1){
            return storage[i];
        }
        if (weights[i]>maxWeight){
            storage[i]=knapsackM(weights, values, n, maxWeight, storage,i+1);
            return storage[i] ;
        }
        int opt1=values[i]+knapsackM(weights, values, n, maxWeight-weights[i],storage,i+1);
        int opt2=knapsackM(weights,values,n,maxWeight,storage,i+1);
    storage[i]=Math.max(opt1,opt2);
        return storage[i];
    }

}
