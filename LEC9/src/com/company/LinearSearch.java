package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int x){
        int n=arr.length;
        for (int i=1;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }




//    public static void arrange(int[] arr, int n){
//    for (int k=0;k<arr.length;k++){
//        if(arr[k]==n){
//            System.out.println(k);
//            return;
//        }
//    }
//        System.out.println(-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int t=s.nextInt();
//        for (int i=1;i<=t;i++){
//            int size=s.nextInt();
//            int arr[]=new int[size];
//            for (int j=0;j<size;j++){
//                arr[j]=s.nextInt();
//            }
//            int n=s.nextInt();
//            arrange(arr,n);
//        }
//    }


//  public static void ls(){
//      Scanner s=new Scanner(System.in);
//          int size=s.nextInt();
//          int arr[]=new int[size];
//          for (int i=0;i<size;i++){
//              arr[i]=s.nextInt();
//          }
//          int n=s.nextInt();
//      for(int i=0;i<size;i++){
//          if(arr[i]==n){
//              System.out.println(i);
//              return;
//          }
//      }
//      System.out.println(-1);
//  }
//
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int t=s.nextInt();
//        for (int i=1;i<=t;i++){
//            ls();
//        }
//    }

//   public static int[]arr(){
//       Scanner s=new Scanner(System.in);
//       int size=s.nextInt();
//      int arr[]=new int[size];
//       int i=0;
//       while(i<size){
//           arr[i]=s.nextInt();
//           i++;
//       }
//       return arr;
//   }
//   public static void ls(int arr[]){
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     int i=0;
//     while(i<arr.length){
//         if (arr[i]==n){
//             System.out.println(i);
//             return;
//         }
//         i++;
//     }
//       System.out.println(-1);
//     }
//
//
//    public static void main(String[] args) {
//       int input[]=arr();
//       ls(input);
//
//    }
}
