public class CheckAB {
    public static boolean checkAB(String input){
        if (input.length()==0){
            return true;
        }
        if (input.charAt(0)=='a'){      //observe patters and try to do it in a singular manner
            if (input.substring(1).length()>1&&input.substring(1,3).equals("bb")){
                return checkAB(input.substring(3));
            }else{
                return checkAB(input.substring(1));
            }
        }
        return false;
    }
//    public static boolean checkAB(String input,int startindex){  //Going Forward.
//        if (input.length()==0){
//            return true;
//        }
//     if (input.charAt(0)=='a'&&startindex==0){
////         System.out.println("true");
//         return checkAB(input.substring(1),startindex+1);   //do deep dive in rather than returning trues.
//     }else if(input.charAt(0)!='a'&&startindex==0){
//         System.out.println(startindex);
//         return false;     //false could be concluded even if one case doesn't follows but true can't.
//     }
//     if (input.charAt(0)=='a'){
//
//
//         return checkAB(input.substring(1),startindex+1);
//     }
//     if (input.charAt(0)=='b'&&input.length()>=2){
//         if (input.charAt(1)=='b'){
//             return checkAB(input.substring(2),startindex+1);
//         }else{
//             return false;
//         }
//     }else{
//         return false;
//     }
//    }
//    public static boolean checkAB(String input){
//        return checkAB(input,0);
//    }
//
//
}
