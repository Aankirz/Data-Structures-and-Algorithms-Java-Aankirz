package com.company;

import java.util.Scanner;

public class PassByNParray {
//    public static int[]arr(){
//        Scanner s=new Scanner(System.in);
//        int size=s.nextInt();
//        int arr[]=new int[size];
//        for (int i=0;i<size;i++){
//            arr[i]=s.nextInt();
//        }
//        return arr;
//    }
//    public static void print(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static int[] increment(int[] arr){
//        arr=new int[5];
//        for (int i=0;i<arr.length;i++){
//            arr[i]++;
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int input[]=arr();
//        increment(input);
//        print(input);
////        System.out.println(input[4]);
//    }

    public static void main(String args[]){
        int arr[] = new int[5];
        arr[1] = 10;
        arr = new int[2];
        System.out.println(arr[1]);
    }


}
