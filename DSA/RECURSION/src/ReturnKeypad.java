public class ReturnKeypad {
    public static String[] keypad(int n) {
        if (n==0){
            String ans[]={""};
            return ans;
        }
        String smallans[]=keypad(n/10);  //it is the carrier.
        String small=helper(n%10);
        String ans[]=new String[small.length()*smallans.length];   // it is the output shaper/maker. //String size == permutation buddy.
        int k=0;               //recreating by copying the old one.
        for (int i=0;i<smallans.length;i++){
            for (int j=0;j<small.length();j++){
                ans[k]=smallans[i]+small.charAt(j);
                k++;
            }
        }
        return ans;
    }

    public static String helper(int n) {
       if (n==2){
           return "abc";
        }
       if (n==3){
           return "def";
       }
        if (n==4){
            return "ghi";
        }
        if (n==5){
            return "jkl";
        }
        if (n==6){
            return "mno";
        }
        if (n==7){
            return "pqrs";
        }
        if (n==8){
            return "tuv";
        }
        if (n==9){
            return "wxyz";
        }
        else{
            return "";
        }
    }
public static void main(String[] args) {
   String ans[]=keypad(23);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
}

}

