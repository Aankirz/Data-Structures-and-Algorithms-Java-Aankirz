public class PrintKeypad {
    public static void printKeypad(int input,String outputsofar){
     if (input==0){
         System.out.println(outputsofar);  //making it reach 0 to print.

         return;
     }         // first come to last so that i could make output.
       String ans=helper(input%10);
     String smallans="";          //Technique of Recreating a new string (using it as a collector and reset after job gets done).
     for (int i=0;i<ans.length();i++){
         smallans=ans.charAt(i)+outputsofar;
         printKeypad(input/10,smallans);
     }
    }
    public static void printKeypad(int input){
        printKeypad(input,"");
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
        printKeypad(234);
    }
}
