public class MinStepstoONE {
              //Recursive Approach (Brute-Force)
    public static int countMinStepsToOne(int n) {
       if (n==1){
           return 0;
       }
       int option1=Integer.MAX_VALUE,option2=Integer.MAX_VALUE;
       if (n%3==0)
        option1=countMinStepsToOne(n/3);
       if (n%2==0)
           option2=countMinStepsToOne(n/2);

       int option3=countMinStepsToOne(n-1);

       return 1+ Math.min(Math.min(option3,option1),option2);
    }
                //Memoization Approach
    public static int countMinStepsToOneM(int n){
        //Storage Array: n length(worst case)
        int storage[]=new int[n];
        for (int i=0;i<storage.length;i++){
            storage[i]=-1;// initialization
        }
        return countMinStepsToOneM(n,storage);
    }
    public static int countMinStepsToOneM(int n,int[] storage){
        if (n==1){   //base case
            storage[n]=0;
            return storage[n];
        }
             //check wether it exists or not
        if (storage[n]!=-1){
            return storage[n];
        }
        int option1=Integer.MAX_VALUE,option2=Integer.MAX_VALUE;
        if (n%3==0)
            option1= countMinStepsToOneM(n/3,storage);
        if (n%2==0)
            option2=countMinStepsToOneM(n/2,storage);

        int option3=countMinStepsToOneM(n-1,storage);
        storage[n]=1+Math.min(Math.min(option3,option1),option2);
        return storage[n];
    }
              //  DP Approach (bottom up)(reaching the result from base case).
                public static int countMinStepstoOneDP(int n){
        // S1: Defining size of array.
        int storage[]=new int[n+1];
        //Bottom=Base Case
       storage[1]=0;
       // answer maker(knowing the fact that index of array =element of array.
                    //Treat your array as recursive calls.
       for (int i=2;i<=n;i++) {
           int min = storage[i - 1];
           if (i % 3 == 0) {
               if (min > storage[i / 3]) {
                   min = storage[i / 3];
               }
           }
           if (i % 2 == 0) {
               if (min > storage[i / 2]) {
                   min = storage[i / 2];
               }
           }
           storage[i] = 1 + min;
       }
                    return storage[n];
    }

}
