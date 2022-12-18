import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int sum=0;
        while(i<=n) {
            int j = 1;
            while(j<=i){
                System.out.print(j);
                sum=sum+j;
                if(j<i){
                    System.out.print("+");
                }
                j++;
            }
            System.out.print("=");
            System.out.print(sum);
            System.out.println();
            sum=0;
            i++;
        }
    }
}
