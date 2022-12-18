public class Sumarray_Lec {
    //Recursion
//    public static int sum(int input[]){
//        if (input.length==1){
//           return input[0];
//        }
//        int small[]=new int [input.length-1];
//        for (int i=1;i< input.length;i++){
//            small[i-1]=input[i];
//        }
//
//        int sumof=sum(small);
//        return input[0]+sumof;
//
//    }
    public static int sum(int input[],int si){
        if(si==input.length){
            return 0;
        }
        return input[si]+sum(input,si++);
    }
    public static int sum(int input[]){
        return sum(input,0);
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int ans=sum(arr);
        System.out.println(ans);
    }
}
