import java.util.Scanner;
public class TriangularPatterns {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }

    }

}
