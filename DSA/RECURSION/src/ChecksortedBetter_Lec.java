public class ChecksortedBetter_Lec {
public static boolean checkbetter(int arr[],int startindex){
    if (startindex>=arr.length-1){
        return true;           //BASE CASE.
    }
    if (arr[startindex]>arr[startindex+1]){
        return false;                     //CHECK
    }
    boolean smallans=checkbetter( arr, startindex+1);  //PREVIOUSLY WE WERE CHANGING ARR,NOW INDEX.
    return smallans;
}
public static boolean checkbetter(int arr[]){
    return checkbetter(arr,0);
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(checkbetter(arr));
    }
}
