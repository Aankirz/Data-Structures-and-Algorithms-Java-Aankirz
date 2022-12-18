public class Removechar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
       String str1="";
        for (int i=0;i<str.length();i++){
           if (str.charAt(i)==ch){
               continue;
           }
           str1=str1+str.charAt(i);
       }
        return str1;
    }
}
