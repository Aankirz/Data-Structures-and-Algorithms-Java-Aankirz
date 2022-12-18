public class MergeSort {
    public static int[] merge(int arr1[], int arr2[]) {
       int i = 0,j=0,n=0;
       int arr[]=new int[arr1.length+arr2.length];
       while(i<arr1.length&&j< arr2.length){
           if (arr1[i]<=arr2[j]){
               arr[n]=arr1[i];
               n++;
               i++;
           } else{
               arr[n]=arr2[j];
               n++;
               j++;
           }
       }
        while(i<arr1.length){
            arr[n]=arr1[i];
            n++;
            i++;
        }
        while(j<arr2.length){
            arr[n]=arr2[j];
            n++;
            j++;
        }

       return arr;
    }
}
