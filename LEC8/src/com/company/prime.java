package com.company;

import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n){
        int d=2;
        while (d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void printprimes(int n){
        for( int d=2;d<=n;d++){
            boolean ans=isPrime(d);
            if(ans){
                System.out.println(d);
            }
        }
    }

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
           int n=s.nextInt();
       printprimes(n);
    }
}
