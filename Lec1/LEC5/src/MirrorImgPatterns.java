import  java.util.Scanner;
public class MirrorImgPatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        //PATTERN 1 MIRROR.
//        while (i<=n){
//            int j=1;
//            while(j<=n-i){
//                System.out.print(" ");
//                j++;
//            }
//            j=1;
//            while(j<=i){
//                System.out.print(1+j-1);
//                j++;
//            }
//            System.out.println();
//            i++;
//
//        }
        //PATTERN 2 INVERTED TRIANGLE.
//        while (i <= n) {
//            int j = 1;
//            while (j <= n - i+1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        //PATTERN 3 INVERTED NUMBER.
        while (i <= n) {
            int j = 1;
            while (j <= n - i+1) {
                System.out.print(4-(i-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
