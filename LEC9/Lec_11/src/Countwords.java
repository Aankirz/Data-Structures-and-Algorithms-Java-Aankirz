public class Countwords {
    public static int countWords(String str){
      int n=0;
      if (str.length()!=0){
          for (int i=0;i<str.length();i++){
              if (str.charAt(i)==' '){
                  n++;
              }
          }
          return n+1;
      }

      return n;
    }

    public static void main(String[] args) {
        String str="cod nin";
      int n=  countWords(str);
        System.out.print(n);
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));// PRINT CHAR.
        }
    }
}
