import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int i=1;
//        int sum=0;
//        while(i<=n){
//             sum=sum+i;
//             i= i+1;
//        }
//        System.out.println(sum);
//        int i=2;
//        while(i<10)
//        {
//            System.out.print(i);
//            i*=2;
//        }
//        int i=10;
//        while(i>0)
//        {
//            if(i%2==0)
//            {
//                System.out.print(10-i);
//            }
//            i--;
//        }
        int i=0;
        int sum=0;
        int n=s.nextInt();
        while(i<=n){
            sum = sum+i;
            i=i+2;
        }
        System.out.println(sum);
    }
}
