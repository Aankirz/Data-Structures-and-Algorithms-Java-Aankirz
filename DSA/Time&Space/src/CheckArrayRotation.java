public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
      int first=Integer.MAX_VALUE;
      int firstindex=0;
       for (int i=0;i<arr.length;i++){
           if (first>arr[i]){
               first=arr[i];
               firstindex=i;
           }
       }
       return firstindex;
    }
}
