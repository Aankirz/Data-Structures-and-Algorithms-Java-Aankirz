public class secondlargest {
    public static int secondLargestElement(int[] arr){
        int len = arr.length;
        int first;
        int second;

        first = second = Integer.MIN_VALUE;
        for (int i = 0; i<len; i++){ //////###### APPROACH TO LEARN.
            if (first<arr[i]){
                first = arr[i];   //Approach-1 to find the max value.
            }
        }

        for (int j = 0; j<len; j++){
            if (arr[j] != first){  //Approach-2 to find the max value.
                second = Math.max(second, arr[j]);
            }
        }

        return second;
    }
public static void main(String[] args) {
   int arr[]={2,8,1,9,4};
    System.out.println(secondLargestElement(arr));
}
}
