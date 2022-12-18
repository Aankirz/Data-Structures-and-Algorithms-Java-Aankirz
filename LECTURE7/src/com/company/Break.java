package com.company;
import  java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean divided=false;
        int d=2;
        while(d<n){
              if(n%d==0){
                  divided=true;
                  break;

              }
              d=d+1;
        }
        if(divided){
            System.out.println("NOT PRIME");
        }else{
            System.out.println("PRIME");
        }

    }
}
