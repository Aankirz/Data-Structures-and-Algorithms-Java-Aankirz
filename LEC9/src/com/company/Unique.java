package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Unique {
//    Best Approach
    public static int findUnique(int[] arr) {
        int ans=0;
         for(int i=0;i<arr.length;i++) {
             ans = ans ^ arr[i];
         }
         return ans;

    }
//    public static int findUnique(int[] arr) {
//      int n=0;
//        int b=0;
//       for (int i=0;i<arr.length;i++){
//
//           for (int j=0;j<arr.length;j++){
//               if (i!=j){
//                   if (arr[i]==arr[j]){
//                     b++;
//
//                   }
//                   }
//               }
//
//           if(b==0){
//               n=arr[i];                   //Time Complexity: O(n^2).
//               return n;
//           }
//       }
//  return n;
//    }
//public static int findUnique(int[] arr) {
//           for(int i=0;i<arr.length;i++){
//               for(int j=i+1;j<arr.length;j++){
//                   if(arr[i]==arr[j]){
//                       arr[j]=Integer.MIN_VALUE;   //Time Complexity: O(n^2).
//                       arr[i]=Integer.MIN_VALUE;
//                   }
//               }
//           }
//           for(int i=0;i< arr.length;i++){
//               if(arr[i]>Integer.MIN_VALUE){
//                   return arr[i];
//               }
//           }
//           return -1;
//}

    public static void main(String[] args) {
        int arr[]={1, 3, 1, 3, 6, 6, 7, 10, 7};
        int n=findUnique(arr);
        System.out.println(n);
    }
}