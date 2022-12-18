import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int n1=(n+1);
        int n2=n;
        while(i<=n1){
            System.out.print("*");
            int j=1;
            while (j<i){
                System.out.print(j);
                j++;
            }
            j=1;
            while (j<i-1){
                System.out.print(i-2-(j-1));
                j++;
            }
            j=1;
           if(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i=1; // do start it again because now i has increased.
       while(i<=n2){
           System.out.print("*");
           int j=1;
           while(j<=n2-i){
               System.out.print(j);
               j++;
           }
           j=1;
           while(j<=n2-i-1){
               System.out.print(n2-2-(j-1)-(i-1));
               j++;
           }
           if(i!=n2){
               System.out.print("*");
           }
           System.out.println();
           i++;
       }
    }
}


// M: SOLVE THE PROBLEM FOR GENERIC, NOT FOR THAT EXAMPLE.