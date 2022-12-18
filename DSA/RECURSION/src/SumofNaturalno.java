public class SumofNaturalno {
    public static int sum(int n){
       if (n==1){
           return 1;
       }
//        int small=sum(n-1);
//        return n+small;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        int ans=sum(n);
        System.out.println(ans);
    }
}
