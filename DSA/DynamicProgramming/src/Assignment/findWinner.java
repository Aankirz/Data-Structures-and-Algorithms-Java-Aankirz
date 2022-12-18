package Assignment;

public class findWinner {
    public static String findWinner(int n, int x, int y,int i) {
       String ans;
        if (i%2!=0){
            ans="Beerus";
        }else{
            ans="Whis";
        }
     if (n-1==0||n-x==0||n-y==0){
         return ans;
     }
     return findWinner(n-1, x, y, i++);

    }
    public static String findWinner(int n, int x, int y){
        return findWinner(n,x,y,1);
    }
}
