import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
//M:FORGETTING PSVM.
        while(S<=E){
            int c=(int)((5.0/9)*(S-32));
            System.out.println(S+" "+c);
            S=S+W;
    }

    }



}
