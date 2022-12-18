
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
//        if(i%2==0){
//            System.out.println("EVEN");
//        }else {
//            System.out.println("Odd");
//        }
//    }

        if (i % 2 == 0) {
            System.out.println("EVEN");
return;
        }
        System.out.println("Odd");

    }
}
