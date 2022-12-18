public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s){
        if (s.length()==0){
            return "";          //In going forward recursive approach pure ke liye solve karna jaruuri nhi,
        }                                           // sirf pehle element ke baare mein socho aur uske liye solve karo.
        int n=0;
       for (int i=0;i<s.length();i++){
           if (s.charAt(0)==s.charAt(i)){
            n++;
           }else{
               break;
           }
       }
       return s.charAt(0)+removeConsecutiveDuplicates(s.substring(n));
    }
    public static String replaceCharacter(String input, char c1, char c2) {
        if (input.length()==0){
            return "";
        }
        if (input.charAt(0)==c1){
            return c2+replaceCharacter(input.substring(1),c1,c2);
        }
        return input.charAt(0)+replaceCharacter(input.substring(1),c1,c2);
    }

    public static void main(String[] args) {
        String ans="xxxyyyzwwzzz";
        System.out.println(removeConsecutiveDuplicates(ans));
    }
}
