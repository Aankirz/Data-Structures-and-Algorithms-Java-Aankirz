package com.company;

import java.util.Scanner;

public class Allprime {
    public static void checkprime(int n){
       if(n>1){
           System.out.println(2);
           if(n==2){
               return;
           }
           System.out.println(3);
           if(n==3){
               return;
           }
           if(n==4){
               return;
           }
           System.out.println(5);
           if(n==5){
               return;
           }
       }

        for (int i=6;i<=n;i++){
            if (i%2!=0&&i%3!=0&&i%5!=0){
                if(i==7){
                    System.out.println(7);
                }
                if((i+1)%6 ==0||(i-1)%6==0){
                    System.out.println(i);
                }
            }

     }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       checkprime(n);
    }
}
