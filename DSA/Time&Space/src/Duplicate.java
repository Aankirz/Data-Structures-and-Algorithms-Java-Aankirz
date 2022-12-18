public class Duplicate {
    public static int findDuplicate(int[] arr) {
      int sum=0;
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
      }
      int sumformula=((arr.length-2)*(arr.length-1))/2;
      return sum-sumformula;//Magical.
    }

    public static void main(String[] args) {
        int arr[]={0 ,7, 2, 5, 4, 7, 1, 3, 6};
        System.out.println(findDuplicate(arr));
    }
}
