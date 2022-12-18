package com.company;
import java.util.Scanner;
public class SqRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int k=1;
        while(k<n){
             k=(int)Math.pow(i,2);
             if(k==n){
                 i+=2;
                 break;
             }
             i+=1;

        }
        if (n==0){
            System.out.println(0);
            return;
        }
        System.out.println(i-2);
    }
}
