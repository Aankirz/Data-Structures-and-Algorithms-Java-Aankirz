public class LargestBST {

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
       if (root==null){
           return 0;
       }
       if (isBST(root)){
           return height(root);
       }else{
           return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
       }
    }
public static int height(BinaryTreeNode<Integer>root){
    if (root==null){
        return 0;
    }
    int leftheight=height(root.left);
    int rightheight=height(root.right);

    return 1+Math.max(leftheight,rightheight);
}
    public static boolean isBST(BinaryTreeNode<Integer>root,int min,int max){
        if (root==null)
            return true;
        if (root.data<min||root.data>max)
            return false;

        boolean leftoutput=isBST(root.left,min,root.data-1);
        boolean rightoutput=isBST(root.right, root.data+1,max);

        return leftoutput&&rightoutput;
    }
    public static boolean isBST(BinaryTreeNode<Integer>root){
        return isBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

}
