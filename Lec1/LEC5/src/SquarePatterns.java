
import java.util.Scanner;
public class SquarePatterns {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //PATTERN 1
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        //PATTERN 2
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        //PATTERN 3
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(n-j+1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }


}
