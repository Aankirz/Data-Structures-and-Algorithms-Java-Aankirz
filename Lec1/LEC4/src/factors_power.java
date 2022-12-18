import java.util.Scanner;
public class factors_power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//       FACTORS
        int N=s.nextInt();
        int i=2;
        while(i>1&&i<N){
            if(N % i == 0){
                System.out.print(i+" ");
            }
            i=i+1;
        }
//        POWER
//        int x=s.nextInt();
//        int n=s.nextInt();
//        int k= (int)Math.pow(x,n);
//        System.out.println(k);

    }
}
