import java.util.Scanner;
public class SEO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sume=0;
        int sumo=0;
        while (N/10!=0){
            int i=N%10;
            if(i%2==0){
                sume=sume+i;
            }else{
                sumo=sumo+i;
            }
            N=N/10;
        }
        if(N/10==0){
            if(N%2==0){
                sume=sume+N;
            }else{
                sumo=sumo+N;
            }
        }
        System.out.println(sume+" "+sumo);
    }
}
