import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c= s.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=c&&b>=a){
            System.out.println(b);

        }else{
            System.out.println(c);
        }
int i=s.nextInt();
        int j=s.nextInt();

        if (i==1){
            System.out.println("One");
        }
        if (j==2){
            System.out.println("Two");
        }
        if (i==2){
            System.out.println("Two");

        }else {
            if(i==3){
                System.out.println("Three");
            }
        }
//int l=50;
//        System.out.println(l/0); (RUN TIME ERROR)
int l=0;
        while (l<10){
            l=l+1;
            System.out.println(l);
            l=l+1;
        }



    }
}
