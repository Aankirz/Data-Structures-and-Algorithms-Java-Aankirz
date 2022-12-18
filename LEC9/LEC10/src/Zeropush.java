public class Zeropush {
    public static void pushZerosAtEnd(int[] arr){
        int input[]=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){

                input[j]=arr[i];
                j++;
                }
            }
        for (int i=0;i<input.length;i++){
            arr[i]=input[i];
        }

    }



    public static void main(String[] args) {
        int arr[]={2,6,0,0,2,9,0,8,0};
        pushZerosAtEnd(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
