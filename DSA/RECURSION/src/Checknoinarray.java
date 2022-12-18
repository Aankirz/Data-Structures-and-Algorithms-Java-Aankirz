public class Checknoinarray {
//    public static boolean checkNumber(int input[], int x){//BASE CASE: input[0]==x then definitely true;
//    if(input.length==1){
//        if (input[0]==x){     //input[]= iss function ke andar jo array ane wala hain,
//            return true;
//        }else{
//            return false;
//        }
//    }
//    int small[]=new int [input.length-1];
//    for (int i=1;i< input.length;i++){
//        small[i-1]=input[i];
//    }
//    boolean check=checkNumber(small,x);
//    if (!check){
//       if (input[0]==x){
//           return true;
//       }else{
//           return false;
//       }
//    }else{
//        return true;
//    }
//    }
    public static boolean checkNumber(int input[], int x,int si) {
        if(si==input.length){
            return false;
        }
        if(input[si]==x){
            return true;
        }
      return checkNumber(input,x,si+1);
    }
    public static boolean checkNumber(int input[], int x){
        return checkNumber(input,x,0);
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,0};
        int x=8;
        boolean ans=checkNumber(arr,x);
        System.out.println(ans);
    }
}
