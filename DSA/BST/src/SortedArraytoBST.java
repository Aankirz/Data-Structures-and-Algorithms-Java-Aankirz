public class SortedArraytoBST {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n,int si,int ei){
        if (si>ei){
            return null;
        }
       int mid=n/2;
       if (n%2==0)
           mid=mid-1;

        BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(arr[mid]);
        root.right=SortedArrayToBST(arr,n,si,mid-1);
        root.left=SortedArrayToBST(arr,n,mid+1,ei);

        return root;
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr,n,0,n-1);
    }
}
