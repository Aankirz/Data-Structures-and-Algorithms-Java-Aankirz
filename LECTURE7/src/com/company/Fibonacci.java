package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=0;
       int i=1;
       int j=1;
       int count=p+i;
       if (n==1){
           System.out.println(1);
       }
       while(j<=n){
           if (j==n-1){
               System.out.println(count);
           }

           p=count;
           count=count+i;
           i=p;
           j++;
       }
    }
}
