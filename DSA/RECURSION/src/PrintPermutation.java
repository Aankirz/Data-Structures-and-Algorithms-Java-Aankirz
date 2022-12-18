public class PrintPermutation {
    public static void FindPermutations(String str,String outputsofar) {
   if (str.length()==0){
    System.out.println(outputsofar);
     }


    }
    public static void main(String[] args) {
        FindPermutations("ab","");
    }
//    public static void FindPermutations(String str,String outputsofar){
//        if (str.equals(outputsofar)){
//            System.out.println(str);
//
//            return;
//        }
//        String ans="";
//        outputsofar=ans+str;
//        for (int i=0;i<str.length();i++){
//        FindPermutations(str.substring(1),str.charAt(i)+"");
//        }
//
//        FindPermutations(str,outputsofar);
//
//
//    }
}
