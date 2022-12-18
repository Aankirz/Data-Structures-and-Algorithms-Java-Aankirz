public class Insertionsort {
//    public static void insertionsort(int arr[]){
//        for (int i=0;i<arr.length;i++){
//          int j=i-1;
//          int sorted=arr[i];
//          while(j>=0&&arr[j]>sorted){
//              arr[j+1]=arr[j];
//              j--;
//          }
//             arr[j+1]=sorted;
//        }
//    }

    public static int findDuplicate(int[] arr) {
        int unique=-1;
        for(int i=0;i<arr.length;i++){
            int n=0;
            for(int j=0;j<arr.length;j++){
                if (i!=j){
                    if (arr[i]==arr[j]){
                        n++;
                        break;
                    }
                }
            }
            if(n==1){
                unique=arr[i];
                return unique;
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        int arr[]={7 ,9, 2, 5, 4, 18, 1, 3, 6,7,8,12,14 };
        long start= System.currentTimeMillis();
        System.out.println(findDuplicate(arr));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
//        insertionsort(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
