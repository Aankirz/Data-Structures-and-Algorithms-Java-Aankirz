public class Sumoftwoarrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]){
        for (int i=arr1.length-1;i>=0;i--){
            int n=(int)Math.pow(10,arr1.length-i-1);
            arr1[i]=n*arr1[i];
        }
       int sum1=0;
        for (int i=0;i<arr1.length;i++){
            sum1=sum1+arr1[i];
        }
        for (int i=arr2.length-1;i>=0;i--){
            int n=(int)Math.pow(10,arr2.length-i-1);
            arr2[i]=n*arr2[i];
        }
        int sum2=0;
        for (int i=0;i<arr2.length;i++){
            sum2=sum2+arr2[i];
        }
       int  sum=sum1+sum2;
        for (int i=output.length-1;i>=0;i--){
            output[i]=sum%10;
            sum=sum/10;
        }
    }

    public static void main(String[] args) {
       int arr1[]={9,7,6,1};
        int arr2[]={9,7,6,1};

    }
}
