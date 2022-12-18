public class Scontainst {
    public static boolean checkSequence(String a, String b) {
        if (b.length()==0){
            return true;
        }
        if (a.length()==0){
            return false;
        }
        int n=Integer.MIN_VALUE;
        for (int i=0;i<a.length();i++){
            if (b.charAt(0)==a.charAt(i)){
                n=i;
                break;
            }
        }
        if (n>=0){

            return checkSequence(a.substring(n+1),b.substring(1));
        }else{
            return false;
        }
    }
}
