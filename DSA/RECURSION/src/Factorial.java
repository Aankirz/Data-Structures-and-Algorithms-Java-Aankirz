public class Factorial {
    public static int fact(int n){
       if (n==0){ //Base Case
           return 1;
       }
        int smallcase=fact(n-1);  // so understand the input and output wisely and also use it manipulatively if you can.
        return n*smallcase;
    }

    public static void main(String[] args) {
        int n=100;
        int ans=fact(n);
        System.out.println(ans);
    }
}
