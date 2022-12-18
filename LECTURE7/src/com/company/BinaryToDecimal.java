package com.company;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int sum=0;

       for(int i=0;n!=0;i++){
            int k=n%10;
            n/=10;
            if (k==0){
                continue;
            }

            int j= (int) Math.pow(2,i);
            sum=sum+j;

        }
        System.out.println(sum);
    }

}
