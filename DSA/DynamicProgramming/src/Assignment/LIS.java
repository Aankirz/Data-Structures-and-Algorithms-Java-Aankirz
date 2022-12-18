package Assignment;

public class LIS {
    public static int lis(int arr[],int i) {
    if (i>=arr.length){
        return 0;
    }
    if (i-1>=0){
        if (arr[i-1]>arr[i]){
            return lis(arr,i+1);
        }
    }


    return lis(arr,i+1);
    }
    public static int lis(int arr[]){
        return lis(arr,0);
    }


}
