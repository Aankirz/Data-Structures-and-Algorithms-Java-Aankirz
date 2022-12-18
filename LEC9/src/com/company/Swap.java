package com.company;

import java.util.Scanner;

public class Swap {
//    public static void swapAlternate(int arr[]) {
//       for (int i=0;i<arr.length;i=i+2){
//           if (i+1<arr.length){
//               int swap=arr[i];
//
//               arr[i]=arr[i+1];
//               arr[i+1]=swap;
//           }
//
//       }
//
//    }
public static void swapAlternate(int arr[]) {
    for(int i=0;i<arr.length;i++){
       if(i+1==arr.length){
           break;
       }
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        i++;
    }
}


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = arr[i - 1];
        }
        
        for (int j = 0; j < arr.length; j += 2) {
            if(j!=n-1){
                arr[j] = arr[j + 1];
            }

        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
