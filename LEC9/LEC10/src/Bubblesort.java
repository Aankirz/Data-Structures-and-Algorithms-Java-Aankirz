public class Bubblesort {
    public static void bubblesort(int arr[]){
      int k=0;
        while(k<arr.length-1){
            for (int i=0;i<arr.length-k-1;i++){
                int min=arr[i];// this is needed so that there is no data loss.
                int minindex=i;
                int j=i+1;
                if (arr[j]<arr[i]){
                    min=arr[j];
                    minindex=j;
                }
                if(minindex!=i){
                    arr[minindex]=arr[i];
                    arr[i]=min;
                }

            }
k++;
        }

    }

    public static void main(String[] args) {
        int arr[]={84,239,23,49,2,32,4,4,3,239,289};
        bubblesort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
