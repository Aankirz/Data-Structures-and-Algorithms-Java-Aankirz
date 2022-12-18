public class LastIndex {

    public static int lastIndex(int input[], int x){
        return lastIndex(input,x, input.length-1);
    }

    private static int lastIndex(int[] input, int x, int ei) {
        if(ei<0){
            return -1;
        }
        if(input[ei]==x){
            return ei;
        }
        return lastIndex(input,x,ei-1);
    }

    public static void main(String[] args) {
        int arr[]={8,4,5,8,0,4};
        System.out.println(lastIndex(arr,9));
    }

}
