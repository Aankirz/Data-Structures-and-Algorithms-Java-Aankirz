public class FirstIndex {


    public static int firstIndex(int input[],int x){
        return firstIndex(input,x,0);
    }

    private static int firstIndex(int[] input, int x, int si) {
        if(si==input.length){
            return -1;
        }
        if(input[si]==x){
            return si;
        }
        return firstIndex(input,x,si++);
    }

    public static void main(String[] args) {
        int arr[]={9,4,5,9,0,4};
        System.out.println(firstIndex(arr,4));
    }
}
