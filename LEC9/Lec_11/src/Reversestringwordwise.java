public class Reversestringwordwise {
    public static String reverseWordWise(String input){
        String str1="";
        for (int i=0;i<input.length();i++){
            str1=input.charAt(i)+str1;
        }
        // reverse each word.
        String ans="";
        int i=0;
        int currentwordstart=0;
        for (;i<str1.length();i++){
            if (str1.charAt(i)==' '){
                int currentwordend=i-1;
                String reversedword="";
                for (int j=currentwordstart;j<=currentwordend;j++){
                    reversedword=str1.charAt(j)+reversedword;
                }
                    ans=ans+reversedword+" ";
                currentwordstart=i+1;
            }
        }
        int currentwordend=i-1;
        String reversedword="";
        for (int j=currentwordstart;j<=currentwordend;j++){
            reversedword=str1.charAt(j)+reversedword;
        }
        ans=ans+reversedword;

        return ans;
    }

    public static void main(String[] args) {
        String str="Welcome to Coding Ninjas";
        String ans=reverseWordWise(str);
        System.out.println(ans);
    }
}
