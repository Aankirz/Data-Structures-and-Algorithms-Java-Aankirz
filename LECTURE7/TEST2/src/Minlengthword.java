public class Minlengthword {
    public static String minLengthWord(String input){
       int currentwordstart=0;
        int min=10;
       String str2="";
       int i=0;
        for (;i<input.length();i++){
            int n=0;
           if (input.charAt(i)==' '){
               String str1="";
               int currentwordend=i-1;
               for (int j=currentwordstart;j<=currentwordend;j++){
                   str1=str1+input.charAt(j);
                   n++;
               }
               System.out.println(n);
               if (n<min){
                   min=n;
                   str2=str2+str1;
               }
               currentwordstart=i+1;
           }

        }

        int currentend=input.length()-1;
        int n=0;
        String str1="";
        for (int j=currentwordstart;j<=currentend;j++){
            str1=str1+input.charAt(j);
            n--;
        }
        System.out.println(n);
        if (n>min){
            min=n;
            str2=str2+str1;
        }
return str2;
    }

    public static void main(String[] args) {
        String str="Welcome to Coding Ninjas";
        String ans=minLengthWord(str);
        System.out.println(ans);


    }
}
