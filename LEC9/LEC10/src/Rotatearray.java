public class Rotatearray {
    public static void rotate(int[] arr, int d,int si,int temp0[]){
   if (d==si){
    return;
   }
   int temp[]=new int[arr.length-si];
   for (int i=1;i<temp.length;i++){
       temp[i-1]=arr[i];
   }
   temp[arr.length-si-1]=arr[0];

   rotate(arr,d,si+1,temp);

    }
    public static void rotate(int[] arr, int d){
        rotate(arr,d,0,new int[0]);
    }
//    public static void rotate(int[] arr, int d){
//        int temp[]=new int[d];
//        for (int i=0;i<d;i++){
//         temp[i]=arr[i];
//        }
//        for (int i=d;i<arr.length;i++){
//            arr[i-d]=arr[i];
//        }
//        int k=0;
//        for (int i=arr.length-d;i<arr.length;i++){
//            arr[i]=temp[k];
             // k++;
//        }
//    }


        public static void main(String[] args) {
        int arr[]={1 ,3, 6, 11, 12, 17};
        int d=4;
        rotate(arr, d);
    }
}