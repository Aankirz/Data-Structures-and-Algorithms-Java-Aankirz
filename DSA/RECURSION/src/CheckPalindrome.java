public class CheckPalindrome {
    public static boolean isStringPalindrome(String input,int start,int last){
        if (start>=input.length()-1){  //BASE CASE(SOMETIMES YOU HAVE TO FAKE IT TO "JUST END" THE CODE)
            return true;
        }
        if (input.charAt(start)!=input.charAt(last)){   //SMALL PROBLEM SOLN.
            return false;
        }
        boolean ans=isStringPalindrome(input,start+1,last-1); //PROCESSING.
        return ans;
    }
    public static boolean isStringPalindrome(String input){
        return isStringPalindrome(input,0,input.length()-1);
    }


    public static void main(String[] args) {
        String s="racecar";
        System.out.println(isStringPalindrome(s));
    }
}
