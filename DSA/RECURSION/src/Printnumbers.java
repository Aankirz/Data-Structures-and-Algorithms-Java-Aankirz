public class Printnumbers {
    public static void print (int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);   //By thinking abt the input and output of that specific call we colud reach to our answer.
    }
    public static void main(String[] args) {
        int n=10;
       print(10);
        System.out.println(count(2567800));

        }
        public static int count(int n){
        if (n==0){
            return 0;
        }
       int smallans= count(n/10);
        return smallans+1;       //because small ans is returning nothing except 0,it remains0.
    }

}
