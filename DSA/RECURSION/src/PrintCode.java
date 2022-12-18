public class PrintCode {
    public static void printAllPossibleCodes(String input,String outputsofar){
       if (input.length()==0){
           System.out.println(outputsofar);
           return;
       }
        int n=input.charAt(0)-'0';
        char ch=(char)('a'+n-1);
        outputsofar=outputsofar+ch;
        printAllPossibleCodes(input.substring(1),outputsofar);
      if (input.length()>=2){
          int n1=getint(input.substring(0,2));
          char ch1=(char)('a'+n1-1);
          outputsofar=outputsofar+ch1;
          printAllPossibleCodes(input.substring(2),outputsofar);
      }
    }
    public static int getint(String input) {
        int sum = 0;
        int i = 0;
        int k = 1;
        int j = input.length();
        for (; i < input.length(); i++) {
            k = (int) Math.pow(10, j - 1);
            sum = sum + (k * (input.charAt(i) - '0'));
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s="1123";
        printAllPossibleCodes(s,"");
    }
}
