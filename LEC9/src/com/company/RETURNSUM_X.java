package com.company;

import java.util.Scanner;

public class RETURNSUM_X {
//    public static int[]arr() {
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//          int  arr[] = new int[size];
//            int i = 0;
//            while (i < size) {
//                arr[i] = s.nextInt();
//                i++;
//            }
//            return arr;
//
//
//    }
//public static void sum(int arr[]){
//        int i=0;
//        int sum=0;
//        while(i<arr.length){
//            sum=sum+arr[i];
//            i++;
//        }
//    System.out.println(sum);
//}
//    public static void main(String[] args) {
//         int input[]=arr();
//            sum(input);
//
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("How many array you want to insert : ");
//    int noOfArr = sc.nextInt();
//    System.out.print("Each array should have how many elements : ");
//    int ele = sc.nextInt();
//    int[][] arr = new int[noOfArr][ele];
//
//    for (int i=0 ; i<noOfArr ; i++){
//        System.out.println("Enter array element : ");
//        for (int j=0 ; j<ele ; j++){
//            arr[i][j]= sc.nextInt();
//        }
//    }
//    int sum = 0 ;
//    System.out.println("Sum of respective arrays :");
//    for (int i=0 ; i<noOfArr ; i++){
//        for (int j=0 ; j<ele ; j++){
//            sum+=arr[i][j];
//        }
//        System.out.println(sum);
//        sum=0;
//    }
//}


        public static int InsertAndSum(){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of elements you want to insert in this array : ");
        int size = sc.nextInt();
        int []arr =new int[size];
        System.out.println("Enter your array of "+size+" elements : ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0 ; i< arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many arrays you want to insert : ");
        int noOfArr = sc.nextInt();
        int [] sum = new int[noOfArr];
        for (int i=0 ; i<sum.length ; i++)
            sum[i]=InsertAndSum();
        System.out.println("Sum of respective arrays : ");
        for (int element:sum)
            System.out.println(element);
    }
    }

