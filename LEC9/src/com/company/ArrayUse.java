package com.company;

import java.util.Scanner;

public class ArrayUse {
//    PRINTING AN ARRAY..........
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=s.nextInt();
        }
     for (int i=0;i<size;i++){
         System.out.print(input[i]+" ");
     }
        System.out.println(input);

    }
              //CREATING  AN ARRAY USING FUNCTIONS.
//    public static int []arr(){
//        Scanner s=new Scanner(System.in);
//        int size=s.nextInt();
//        int arr[]=new int[size];
//        int i=0;
//        while(i<size){
//            arr[i]=s.nextInt();
//            i++;
//        }
//  return arr;
//    }
//    //PRINTING AN ARRAY USING FUNCTIONS.
//    public static void print(int arr[]){
//        int i=0;
//        while(i<arr.length){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
//    }
//
//    public static void main(String[] args) {
//          int input[]=arr();
//          print(input);
//    }
}
