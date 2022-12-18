public class BinarySearch_Rec {
    public static int binarySearch(int input[], int element,int si,int ei){//"Go forward"
        if (si>ei){
            return -1;
        }
        int mid=(si+ei)/2;
        if (input[mid]==element){
            return mid;
        }else if(input[mid]>element){
            return binarySearch(input,element,si,mid-1);
        }else if (input[mid]<element){
            return binarySearch(input,element,mid+1,ei);
        }
        return 0;
    }
    public static int binarySearch(int input[], int element){
        return binarySearch(input,element,0, input.length-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,5));
    }
}
