import java.util.Scanner;
public class CharacterPatterns {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        //PATTERN 1
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                char k= (char)('A'+j-1);
//                System.out.print(k);
//                j++;
//            }
//            System.out.println();
//            i++;
//    }
        //PATTERN 2
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                char k=(char)('A'+j-1+i-1);
//                System.out.print(k);
//                j++;
//            }
//            System.out.println();
//            i++;
//
//        }
                      //PATTERN 2 (ANOTHER METHOD)
        while(i<=n){
            int j=1;
            char Startingchar=(char)('A'+i-1);
            while(j<=n){
                System.out.print(Startingchar);
                Startingchar=(char)(Startingchar+1);
                j++;
            }
            System.out.println();
            i++;
        }
}

}
