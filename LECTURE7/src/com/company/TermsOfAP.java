package com.company;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       for(int i=1;i<=n;i++){
           int k=(3*i)+2;
         if (k%4==0){
             n++;
         }else{
             System.out.print(k+" ");
         }
       }

    }
}
