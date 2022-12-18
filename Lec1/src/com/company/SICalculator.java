package com.company;
import java.util.Scanner;
public class SICalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int P=s.nextInt();
        int R=s.nextInt();
        int T=s.nextInt();
        int SI= P*R*T/100;
        System.out.println(P*R*T/100);
        long a=s.nextLong();
        float f= s.nextFloat();
        double d= s.nextDouble();
        double k= a+f*d/100;
        System.out.println(k);

    }
}
