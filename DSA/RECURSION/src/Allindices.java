public class Allindices {
//    public static int[] allIndexes(int input[], int x,int si) {
//        if (si==input.length){
//            return new int[0];
//        }
//        //Recursion's work.
//  int smallans[]=allIndexes(input,x,si+1);//whenever you know that smallans to make last ans, then last to first.
//        //My work for smaller calculation.
//        if (input[si]==x){
//            int ans[]=new int[smallans.length+1];
//            ans[0]=si;
//            for (int i=1;i<ans.length;i++){
//                ans[i]=smallans[i-1];
//            }
//            return ans;
//        }
//        return smallans;
//    }
//    public static int[] allIndexes(int input[], int x) {
//        return allIndexes(input,x,0);
//    }

    public static int[] allIndexes(int input[], int x) {

       return allIndexes(input,x,0);
    }

    private static int[] allIndexes(int[] input, int x, int si) {
      if(si==input.length){
          return null;
      }
      //Rec's work
      int smallans[]=allIndexes(input,x,si++);

      //My Work
        if(input[si]==x){
            int ans[]=new int[smallans.length+1];
            ans[0]=si;
            for(int i=1;i<ans.length;i++){
                ans[i]=smallans[i-1];
            }
           return ans;
        }
        return smallans;
    }


    public static void main(String[] args) {
       int arr1[]={9 ,8 ,10, 8 ,8};
       int n=8;
       int arr[]=allIndexes(arr1,n);
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }

    }
}
// Or what we could do is returning it in an array form.
//so whenever you need to collect only way is making a new array every time ,printing the old one and then adding new elements