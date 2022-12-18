import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n){
            int j=1;
            while (j<=n-i+1){
                System.out.print(2*(i+j-1)-1);
                j++;
            }
            j=1;
            while (j<i){
                System.out.print(2*j-1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
