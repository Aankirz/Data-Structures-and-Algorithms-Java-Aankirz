import java.util.Scanner;

public class BINARYSEARCH {
    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=8;
       int n= binarySearch(arr,x);
        System.out.println(n);
    }
}
