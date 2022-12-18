public class CompressString {
    public static String getCompressedString(String str){
       String str1="";
       int n=1;
        for (int i=0;i<str.length();i++){
            if (i+1<str.length()){
                if (str.charAt(i)==str.charAt(i+1)){
                    n++;
                }else{
                    if (n!=1){
                        str1=str1+str.charAt(i)+n;
                    }
                  if (n==1){
                      str1=str1+str.charAt(i);
                  }
                    n=1;
                }
            }
        }
        n=1;
      for (int i=str.length()-1;i>0;i--){
          if (str.charAt(i)==str.charAt(i-1)){
              n++;
          }else{
              if (n!=1){
                  str1=str1+str.charAt(i)+n;
              }
              if (n==1){
                  str1=str1+str.charAt(i);
              }
              return str1;
          }
      }
      if (str.charAt(str.length()-1)==str.charAt(0)){
          if (n!=1){
              str1=str1+str.charAt(0)+n;
          }
          if (n==1){
              str1=str1+str.charAt(0);
          }
      }
      return str1;
    }

    public static void main(String[] args) {
        String str="aaaa";
        String str1=getCompressedString(str);
        System.out.println(str1);
    }
}
