package com.company;
import java.util.Scanner;
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      long ans=0;
      long pv=1;
       while(n!=0){
           int k=n%2;
           n=n/2;
            ans =ans+k*pv;
            pv=pv*10;
       }
        System.out.println(ans);

    }
}
