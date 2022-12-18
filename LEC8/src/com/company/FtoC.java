package com.company;

import java.util.Scanner;

public class FtoC {
    public static void printFahrenheitTable(int start, int end, int step) {
        while (start <= end) {
            int c = (int) ((5.0 / 9) * (start - 32));
            System.out.println(start + " " + c);
            start = start + step;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        printFahrenheitTable(s,e,w);
    }
//public static void func2()
//{
//    System.out.print("#");
//}
//    public static void func1()
//    {
//        System.out.print("*");
//        func2();
//    }
//    public static void main (String[] args) {
//        func2();
//        func1();
//    }

}
