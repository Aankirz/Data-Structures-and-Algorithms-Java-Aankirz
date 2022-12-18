public class ReturnPermutationString {
//    public static String[] permutationOfString(String input){
//      if (input.length()==0){
//          String ans[]={""};
//          return ans;
//      }
//      if (input.length()==1){
//          String ans[]=new String[1];
//          ans[0]=input.charAt(0)+"";
//          return ans;
//      }
//      String smallans[]=permutationOfString(input.substring(1));
//
//    }

//    public static void main(String[] args) {
//        String ans[]=permutationOfString("abc");
//        for (int i=0;i<ans.length;i++){
//            System.out.println(ans[i]);
//
//        }
//    }
//       if (input.length()==0){
//           String ans[]={""};
//           return ans;
//        }
//        if (input.length()==1){
//            String ans[]=new String[1];
//            ans[0]=input.charAt(0)+"";
//            return ans;
//        }
//       String smallans[]=permutationOfString(input.substring(1));//now stopped the input at length 2.
//        String ans[]=new String[input.length()* smallans.length]; //think from 2nd last. smallans has length 1;
//        int k=0;
//        for (int i=0;i< smallans.length;i++){
//            ans[i]=input.charAt(0)+smallans[i];
//            k++;
//        }
//        for (int i=0;i< smallans.length;i++){
//            ans[k]=smallans[i]+input.charAt(0);
//        }
//
//        return ans;

    }
