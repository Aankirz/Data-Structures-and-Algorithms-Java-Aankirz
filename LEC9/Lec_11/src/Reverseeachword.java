public class Reverseeachword {
    public static String reverseEachWord(String str){
       String ans="";
       int currentwordstart=0;
       int i=0;
        for ( ;i<str.length();i++){
            if (str.charAt(i)==' '){
                //reverse current word.
                int currentwordend=i-1;
                String reversedword="";
                for (int j=currentwordstart;j<=currentwordend;j++){
                    reversedword=str.charAt(j)+reversedword;
                }
                //
               ans=ans+reversedword+" ";
                currentwordstart=i+1;
            }
        }
        int currentwordend=i-1;
        String reversedword="";
        for (int j=currentwordstart;j<=currentwordend;j++){
            reversedword=str.charAt(j)+reversedword;
        }
        ans=ans+reversedword;
        currentwordstart=i+1;
        return ans;
    }

    public static void main(String[] args) {
        String str="abc def ghi";
        String ans=reverseEachWord(str);
        System.out.println(ans);
    }
}
