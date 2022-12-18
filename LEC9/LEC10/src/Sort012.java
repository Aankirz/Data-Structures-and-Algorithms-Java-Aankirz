public class Sort012 {
    public static void sort012(int[] arr){
        int n=0;
        int m=0;
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                n++;
            }
            if (arr[i]==1){
                m++;
            }
            if (arr[i]==2){
                j++;
            }
        }
        for (int i=0;i<n;i++){
            arr[i]=0;
        }
        for (int i=n;i<n+m;i++){
            arr[i]=1;
        }
        for (int i=n+m;i<n+m+j;i++){
            arr[i]=2;
        }
    }

    public static void main(String[] args) {
        int arr[]={2, 1, 0 ,1, 2, 0};
        sort012(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
