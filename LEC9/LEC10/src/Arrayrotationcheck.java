public class Arrayrotationcheck {
    public static int arrayRotateCheck(int[] arr){
      int n=0;
      if (arr.length!=0){
          int n1=arr[arr.length-1];
          for(int i=0;i<arr.length;i++){
              if(arr[i]>n1){
                  n++;
              }
          }
      }

      return n;
    }

    public static void main(String[] args) {
        int arr[]={6,7,8, 1, 2, 3, 4,5};
        int i=arrayRotateCheck(arr);
        System.out.println(i);
    }
}
