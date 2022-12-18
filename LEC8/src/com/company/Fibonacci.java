package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static boolean checkMember(int n){
        int p=0;
        int i=1;
        int count=p+i;
        int j=0;
        if(n==0){
            return true;
        }

        while(j<=n){
          if (count==n){
              return true;
          }
            p=count;
            count=count+i;
            i=p;

            j++;
        }
        return false;

    }


}
