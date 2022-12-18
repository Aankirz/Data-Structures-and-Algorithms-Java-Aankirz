public class Pair_TripletSum {
    public static int pairSum(int[] arr, int num) {
     int n=0;
      for (int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
          if (arr[i]+arr[j]==num){
              n++;
          }
        }
      }
      return n;
    }
    public static int tripletSum(int[] arr, int num) {
        mergeSort(arr);
        int n=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==num){
                        n++;
                    }
                }

            }
        }
        return n;
    }
    public static void mergeSort(int[] input,int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(input,si,mid);//Part 1 Array
        mergeSort(input,mid+1,ei);//Part 2 Array (using induction hypothesis). Both are sorted array.
        merge(input,si,ei);
    }
    public static void merge(int input[],int si,int ei){
        int mid=(si+ei)/2;
        int ans[]=new int[ei-si+1];     //we are passing a segment of array.
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if (input[i]<input[j]){
                ans[k]=input[i];
                k++;
                i++;
            }else{
                ans[k]=input[j];
                k++;
                j++;
            }
        }
        while (i<=mid){
            ans[k]=input[i];
            k++;
            i++;
        }
        while(j<=ei){
            ans[k]=input[j];
            k++;
            j++;
        }
        for (int index=0;index<ans.length;index++){
            input[index+si]=ans[index];
        }
    }

    public static void mergeSort(int[] input){
        mergeSort(input,0, input.length-1);
    }
}
