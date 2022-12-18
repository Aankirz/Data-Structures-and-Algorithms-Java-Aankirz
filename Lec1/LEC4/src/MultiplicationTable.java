import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int product = n;
        while (i<=10){
             product= n*i;
            i=i+1;
            System.out.println(product);
        }

    }

}
