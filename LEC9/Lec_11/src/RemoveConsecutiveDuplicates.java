public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        String str1="";
        for (int i=0;i<str.length();i++){
            if (i+1<str.length()){
                if (str.charAt(i)==str.charAt(i+1)){
                    continue;
                }else{
                    str1=str1+str.charAt(i);

                }
            }

        }
        for (int i=str.length()-1;i>0;i--){
            if (str.charAt(i)==str.charAt(i-1)){
                continue;
            }else{
                str1=str1+str.charAt(i);
                return str1;
            }
        }
        if (str.charAt(str.length()-1)==str.charAt(0)){
            str1=str1+str.charAt(0);
        }
        return str1;
    }

    public static void main(String[] args) {
        String str="aaaa";
        String str1=removeConsecutiveDuplicates(str);
        System.out.println(str1);
    }
}
