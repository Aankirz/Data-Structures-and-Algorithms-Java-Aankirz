import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=n;
        int h=n;
       int i=0;
        int sum=0;
        while(n!=0){
            n=n/10;
            i++;
        }
        while(a!=0){
            int k=a%10;
            a=a/10;
            int j=(int)Math.pow(k,i);
            sum=sum+j;
        }
        System.out.println(sum);
      boolean arm=true;
        if(sum==h){
            arm=true;
        }else if(sum!=h){
            arm=false;
        }
        System.out.println(arm);
    }
}
