public class Staircase {
    public static int staircase(int n){
       if (n<0){//Base Case Variation 1.
           return 0;
       }
        if (n==0){//  Base Case Variation 2.
            return 1;
        }

        int x=staircase(n-1);//Recursive calls or recursive work.
        int y=staircase(n-2);
        int z=staircase(n-3);

        return x+y+z ; //Answer maker or our work.
    }



    public static void main(String[] args) {
        System.out.println(staircase(4));
    }
}
