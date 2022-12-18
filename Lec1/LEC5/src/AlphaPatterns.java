import java.util.Scanner;
public class AlphaPatterns {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        //PATTERN 1 (ALPHA PATTERNS)
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                char k=(char)('A'+i-1);
//                System.out.print(k);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        //PATTERN 2 (CHARACTER PATTERN)
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                char k=(char)('A'+j-1+i-1);
//                System.out.print(k);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        //PATTERN 3 (INTERESTING ALPHABETS)
        while(i<=n){
            int j=1;
            while(j<=i){
                char k=(char)('A'+n-1-(i-j));
                System.out.print(k);
                j++;
            }
            System.out.println();
            i++;
        }
        //PATTERN 4 (REVERSE NO. PATTERN)
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print(1+i-j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

    }
}
