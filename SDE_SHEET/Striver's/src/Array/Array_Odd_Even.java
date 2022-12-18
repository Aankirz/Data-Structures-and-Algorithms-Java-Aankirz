package Array;
import java.util.*;
public  class Array_Odd_Even{
    public static int[] arrOdd(int[]arr){
//        int lastE=0;
//        int lastO=1;
//        int sortA[]=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                if(sortA[lastE]==0){
//                    sortA[lastE]=arr[i];
//                    lastE++;
//                }else{
//                    // if not 0 there's a odd element
//                //swap
//                    int swap=sortA[lastE];
//                    sortA[lastE]=arr[i];
//                    sortA[lastE+1]=swap;
//
//                }
//
//            }else{
//                sortA[lastE+1]=arr[i];
//            }
//        }
        int odd=0;
        int even=0;
        binarySort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                odd++;
            }else{
                even++;
            }
        }
        int evenA[]=new int[even];
        int oddA[]=new int[odd];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                oddA[i]=arr[i];
            }else{
                evenA[i]=arr[i];
            }
        }
        for(int i=0;i<evenA.length;i++){
            arr[i]=evenA[i];
        }
        for(int i=odd;i<oddA.length;i++){
            arr[i]=oddA[i];
        }
        return arr;
    }
    public static void binarySort(int arr[]){

    }

    public static void main(String[] args) {
        int arr[]={12,39,6,14,13,99,77};
    }
}

