import java.util.ArrayList;

public class Longestleaftorootpath {
    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        if (root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer>leftarraylist=longestRootToLeafPath(root.left);
        ArrayList<Integer>rightarraylist=longestRootToLeafPath(root.right);

        if (leftarraylist.size()>=rightarraylist.size()){
            leftarraylist.add(root.data);
            return leftarraylist;
        }else{
            rightarraylist.add(root.data);
            return rightarraylist;
        }

    }

}
