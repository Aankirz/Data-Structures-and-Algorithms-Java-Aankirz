package com.company;
import java.util.Scanner;
public class REVERSE {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (n==0){
            System.out.println(0);
        }
        int j=0;
       while (n!=0){
           int k=n%10;
           if (k==0){
               n=n/10;
           }
           if(k==0){
               continue;
           }else{
               j=n;

               break;
           }
       }
      while(n!=0){
          j=n%10;
          n=n/10;
          System.out.print(j);
      }
    }
    }

