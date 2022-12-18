package com.company;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char C = str.charAt(0);
        System.out.println(C);
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int Avg = (m1 + m2 + m3) / 3;
        System.out.println(Avg);
    }
}
