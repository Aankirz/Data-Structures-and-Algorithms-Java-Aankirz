package com.company;

import java.util.Scanner;

public class Numbersequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]num=new int [n];
        int count = 0 , temp=0;
        for (int i=0;i<n;i++)
        {
            num [i] = scan.nextInt();
        }
        for(int i = 0 ; i<n-1;i++)
        {
            if(count==0)
            {
                if(num[i]<num[i+1])
                {
                    count++;
                }
            }
            else if(count==1)
            {
                if(num[i]>num[i+1])
                {
                    count++;
                }
            }
            else if(count>1)
            {
                break;
            }
        }
        if(count==0||count==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}