public class PrintSubsequeces {
    public static void printsubsequences(String input,String outputsoFar){  //going forward approach.
  if (input.length()==0){
      System.out.println(outputsoFar);
      return;
  }
  //we chose not to include the first character
        printsubsequences(input.substring(1),outputsoFar); //leaving out the first character :Recursive calls.
        ///we chose  to include the first character,"but in the output".
        printsubsequences(input.substring(1),outputsoFar+input.charAt(0));

    }
public static void  printsubsequences(String input){
     printsubsequences(input,"");
}
public static void main(String[] args) {
    printsubsequences("xyz","");
}
}
