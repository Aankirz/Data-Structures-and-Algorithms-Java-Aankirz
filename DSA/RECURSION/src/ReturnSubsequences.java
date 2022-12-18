public class ReturnSubsequences {
public static String[] findsubsequences(String s){
    if (s.length()<=0){
        String ans[]={""};
        return ans;//1 because to manipulate to get answer.
    }
    String smallans[]=findsubsequences(s.substring(1));
    String ans[]=new String[2* smallans.length];int k=0;
    for (int i=0;i< smallans.length;i++){
        ans[i]=smallans[i];
        k++;
    }
    for (int i=0;i< smallans.length;i++){
        ans[k]=s.charAt(0)+smallans[i];
        k++;
    }

    return ans;
}
public static void main(String[] args) {
       String ans[]=findsubsequences("xyz");
       for (int i=0;i<ans.length;i++){
           System.out.println(ans[i]);
       }
    }
//    public static String[] findsubsequences(String str){
//        if (str.length()==0){
//           String ans[]={""};           //small ans does the recursive process and ans takes help of smallans to make the output.
//            return ans;
//        }
//        String smallans[]=findsubsequences(str.substring(1));  //RECURSIVE STEP
//        String ans[]=new String[2*smallans.length];           // MAKING THE OUTPUT.
//
//        for (int i=0;i< smallans.length;i++){
//            ans[i]=smallans[i];                     //LAST SE SOCHO.
//        }
//        for (int i=0;i< smallans.length;i++){
//            ans[i+ smallans.length]=str.charAt(0)+smallans[i];
//        }
//        return ans;
//    }

    }
