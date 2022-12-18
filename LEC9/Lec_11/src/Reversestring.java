public class Reversestring {
    public static String reverse(String str){
        String str1="";
        for (int i=0;i<str.length();i++){
            str1=str.charAt(i)+str1;             // a small trick rather than doing a+b, we are doing b+a;
        }
        return str1;              // APPROACH 1.
    }

//    public static String reverse(String str){
//       int n=str.length();
//       String str1="";
//        for (int i=str.length()-1;i>=0;i--){
//           str1+=str.charAt(i);
//
//        }
//        return str1;                // APPROACH 2.
//    }

    public static void main(String[] args) {
        String str="abcd";
       String reverse= reverse(str);
        System.out.print(reverse);
    }

}
