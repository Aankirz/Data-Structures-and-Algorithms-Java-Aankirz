public class CalculatePower {
    public static int power(int x, int n){
        if (n==0){//Base case (indicates what is to be broken)
            return 1;
        }
        int smallans=power(x,n-1);
        return x*smallans;
    }

    public static void main(String[] args) {
        int x=2;
        int n=10;
        int ans=power(x,n);
        System.out.println(ans);
    }
}
