public class CheckSorted_Lec {
public static boolean checksorted(int arr[]){
    if (arr.length==1) {
        System.out.println(arr[0]);
        return true;       //because if there is one element then the array is always sorted;
    }                 //base case: the smallest case whose calculation is known.
    int smallarr[]=new int[arr.length-1];
    for (int i=1;i<arr.length;i++){   //convert your writings into code.
        smallarr[i-1]=arr[i];
    }
    boolean smallans=checksorted(smallarr);
    if (!smallans){
        return false;
    }
    if (arr[0]<=arr[1]){
        return true;
    }else{
        return false;
    }
}
public static boolean checksorted2(int arr[]){
    if (arr.length==1) {
        return true;       //because if there is one element then the array is always sorted;
    }                 //base case: the smallest case whose calculation is known.

    if (arr[0]>arr[1]){
        return false;
    }

    int smallarr[]=new int[arr.length-1];
    for (int i=1;i<arr.length;i++){   //convert your writings into code.
        smallarr[i-1]=arr[i];
    }
    boolean smallans=checksorted2(smallarr);
    return smallans;
}

    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        boolean ans=checksorted(arr);
        System.out.println(ans);
    }

}
