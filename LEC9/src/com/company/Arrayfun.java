package com.company;

import java.util.Scanner;

public class Arrayfun {
    public static int[] takeI(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input[]=new int[size];
        for (int i=0;i<size;i++){
            input[i]=s.nextInt();
        }
        return input;                       // her in psv we need to print an array&it's elements.
    }
    public static void printI(int input[]){       // here int input[] this doesn't mean the upper one its showing the
            int size= input.length;
        for(int i=0;i<size;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=takeI();
        printI(arr);
    }
}
