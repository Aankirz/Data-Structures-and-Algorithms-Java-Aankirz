public class Replacepi {
    public static String replace(String input){
      if (input.length()<=1){
          return input;
      }
      if (input.charAt(0)=='p'&&input.charAt(1)=='i'&&input.length()>=2){
          return "3.14"+replace(input.substring(2));
      }
      return input.charAt(0)+replace(input.substring(1));
    }

    public static void main(String[] args) {
        String str="xpipix";
        System.out.println(replace(str));

//        System.out.println(replace(str,0,""));
    }
//     if (input.length()-1<=start){ //BASE CASE FAKE
//        return "";
//    }
//        if (input.charAt(start)=='p'){  // SMALL CALCULATION
//        if (input.charAt(start+1)=='i'){
//            for (int i=0;i<input.length();i++){
//                if (i==start){
//                    str1=str1+"3.14";
//                    i++;
//                }else{
//                    str1=str1+input.charAt(i);
//                }
//            }
//        }
//    }
//    str1=replace(input,start+1,str1);
//
//        return str1;
}
