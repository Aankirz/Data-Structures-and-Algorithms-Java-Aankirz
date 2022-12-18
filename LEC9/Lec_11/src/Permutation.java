import java.util.Scanner;

public class Permutation {
    public static boolean isPermutation(String str1, String str2){
       if (str1.length()==0){
           return true;
       }
       int n=0;
       for(int i=0;i<str2.length();i++){
           if (str1.charAt(0)==str2.charAt(i)){
               n++;
           }
       }
       if (n==0){
           return false;
       }else{
           return isPermutation(str1.substring(1),str2);
       }
    }

    public static void main (String [] args) {

        int[] arr = {10, 20, 30, 40, 50};
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
