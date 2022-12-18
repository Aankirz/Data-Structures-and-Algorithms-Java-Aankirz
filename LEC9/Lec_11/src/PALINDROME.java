public class PALINDROME {
    public static boolean isPalindrome(String str){
        String str1="";
        for (int i=0;i<str.length();i++){
            str1=str.charAt(i)+str1;
        }
        return (str1.equals(str));
    }
    public static void main(String[] args) {
        String str="malayalam";
        boolean strr= isPalindrome(str);
        System.out.print(strr);

    }
}
