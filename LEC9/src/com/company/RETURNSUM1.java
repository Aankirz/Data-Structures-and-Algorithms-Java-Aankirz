package com.company;

import java.util.Scanner;

public class RETURNSUM1 {
//    public static int sum(int[]arr){
//        int ans=0;
//        for (int i=0;i<arr.length;i++){
//            ans+=arr[i];
//        }
//        return ans;
//    }

    public static int sum(int[] arr) {
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
             sum+=arr[i];
        }
        return sum;
    }

    public static int sumR(int[] arr,int i) {
         if(i== arr.length)
             return 0;
         return arr[i]+sumR(arr,i++);
    }
    public static int sumR(int[] arr){
       return sumR(arr,0);
    }
}
