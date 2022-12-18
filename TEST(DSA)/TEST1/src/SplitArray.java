public class SplitArray {
    public static boolean splitArray(int input[]) {
        return splitArray(input ,0,0,0);
    }

    private static boolean splitArray(int input[] ,int si,int lsum ,int rsum){
        if(input.length == si){
            return  lsum==rsum;
        }

        if(input[si] % 3 == 0){
            lsum += input[si];
        }else if(input[si] % 5 == 0){
            rsum += input[si];
        }else{
            return splitArray(input,si+1,lsum+input[si],rsum) || splitArray(input,si+1,lsum,rsum+input[si]) ;
        }

        return splitArray(input,si+1,lsum,rsum) ;

    }



//    public static boolean splitArray(int input[],int si) {
////        if (si==input.length){
////            return false;
////        }
////        int temp1[]=new int[si+1];
////        int k=0;
////        for (int i=0;i<temp1.length;i++){
////            temp1[i]=input[i];
////            k++;
////        }
////        int temp2[]=new int[input.length- temp1.length];
////        for (int i=0;i<temp2.length;i++){
////            temp2[i]=input[k];
////            k++;
////        }
////        int sum1=sum(temp1,0);
////        int sum2=sum(temp2,0);
////        if (sum1==sum2){
////            int n=0;k=0;
////            for(int i=0;i<temp1.length;i++){
////                if (temp1[i]%3==0&&temp1[i]%5!=0){
////                    n++;
////                }
////            }
////            for(int i=0;i<temp2.length;i++){
////                if (temp2[i]%3==0&&temp2[i]%5!=0){
////                    k++;
////                }
////            }
////            if (n== temp1.length||k== temp2.length){
////              return true;
////            }
////        }
////        return splitArray(input,si+1);
////    }
////    public static int sum(int input[],int si){
////        if (si== input.length){
////            return 0;
////        }
////       return input[si]+sum(input,si+1);
////    }
////    public static boolean splitArray(int input[]) {
////        return splitArray(input,0);
////    }
//
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4};
//        System.out.println(sum(arr,0));
//    }
}
