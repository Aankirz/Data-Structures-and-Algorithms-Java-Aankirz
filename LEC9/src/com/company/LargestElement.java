package com.company;

import java.util.Scanner;

public class LargestElement {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //MOVING ARRAYS INTO A FUNCTION.
    public static  int[] takeinput(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input[]=new int[size];
        for (int i=0;i<size;i++){
            input[i]=s.nextInt();
        }
return input;
    }
    //PRINTING ARRAYS.
    public static void print(int input[]){
        int size=input.length;
        for(int i=0;i<size;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
              int arr[]=takeinput();
              print(arr);
              int lar=largest(arr);
        System.out.println("largest"+lar);
    }
}
