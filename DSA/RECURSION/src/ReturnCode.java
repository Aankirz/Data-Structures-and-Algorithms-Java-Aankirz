public class ReturnCode {
    public static String[] getCode(String input) {
       if (input.length()==0){
           String ans[]={""};
           return ans;
       }
       String smallans1[]=getCode(input.substring(1));//Result 1 Recursive call.
        int n=input.charAt(0)-'0';
        char firstchar=(char)('a'+n-1);
        for (int i=0;i< smallans1.length;i++){
            smallans1[i]=firstchar+smallans1[i];
        }
        String smallans2[]=new String[0];
        if (input.length()>=2){
            int m=getint(input.substring(0,2));
            if (m>=10&&m<=26){
                smallans2=getCode(input.substring(2));
                char ch=(char)('a'+m-1);
                for (int i=0;i< smallans2.length;i++){
                    smallans2[i]=ch+smallans2[i];
                }
            }
        }
        String output[]=new String[smallans1.length+ smallans2.length];
       int k=0;
        for (int i=0;i< smallans1.length;i++){
            output[k]=smallans1[i];
            k++;
        }
        for (int i=0;i< smallans2.length;i++){
            output[k]=smallans2[i];
            k++;
        }
        return output;

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
        String ans[] = getCode("1123");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}


