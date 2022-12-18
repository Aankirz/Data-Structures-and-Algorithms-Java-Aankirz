import  java.util.Scanner;

public class TotalSalary {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double BS=s.nextInt();
        String grade=s.next();
        char ch=grade.charAt(0);
        double hra=BS/5;
        double da=BS/2;
        double pf=BS*11/100;
        double k=BS+hra+da-pf;
        int a;
//                         MAJOR MISTAKE : hra,da,pf can also be decimal so store it as double,not integer.
        //                        MISTAKE: INT/INT-> INT.
        if(ch ==  'A'){
            a=1700;
        }else if (ch =='B'){
            a= 1500;
        }else {
            a=1300;
        }

        System.out.println(Math.round(k+a));

    }
    }

