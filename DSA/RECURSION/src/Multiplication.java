public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n,int i){
      if (i==n){
          return 0;
      }

        int sum=multiplyTwoIntegers(m,n,i+1);
        return m+sum;
    }
    public static int multiplyTwoIntegers(int m, int n){
        return multiplyTwoIntegers(m,n,0);
    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(3,5,0));
    }
}
