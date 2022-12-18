import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheckCousins {
    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    public static boolean isCousin(BinaryTreeNode<Integer> root,int p,int q) {


        return !isSiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);


 
    }
    public static boolean isSiblings(BinaryTreeNode<Integer> root,int p,int q) {

        if(root==null) {
            return false;
        } 
        if(root.left!=null && root.right!=null) {

            if(root.left.data == p && root.right.data == q) {
                return true; 
            }

        }
        return isSiblings(root.left, p, q) || isSiblings(root.right, p, q);

    }
    public static int level(BinaryTreeNode<Integer> root,int k,int p) {

        if(root==null)
            return -1;
        if(root.data == p) {
            return k;
        }
        int left  = level(root.left, k+1, p);
        int right = level(root.right, k+1, p);
        if(left==-1) {
            return right;
        }
        if(right==-1) {
            return left;
        }

        return -1;

    }
}
