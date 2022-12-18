public class Unique {
//    public static int findUnique(int[] arr,int si) {
//        if (si== arr.length-1){
//            return arr[arr.length-1];
//        }
//   return arr[si]^findUnique(arr,si+1);
//    }
//    public static int findUnique(int[] arr){
//        return findUnique(arr,0);
//    }
public static int findUnique(int[] arr) {
    int ans=arr[0];
    for (int i=0;i< arr.length;i++){
        ans=ans^arr[i];
    }
    return ans;
}

    public static void main(String[] args) {
        int arr[]={1 ,3, 1, 3, 6, 6, 7, 10, 7};
        System.out.println(findUnique(arr));
    }
}
