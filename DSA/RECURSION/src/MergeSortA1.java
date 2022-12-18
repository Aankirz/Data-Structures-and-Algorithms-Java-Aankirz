public class MergeSortA1 {
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

    public static void main(String[] args) {
        int arr[]={2,8,4,6,3,9};
        mergeSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
