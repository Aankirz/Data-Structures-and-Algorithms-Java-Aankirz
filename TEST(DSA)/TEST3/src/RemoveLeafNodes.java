import java.util.ArrayList;

public class RemoveLeafNodes {
   static class TreeNode<T> {
        T data;
        ArrayList<TreeNode<T>> children;

        TreeNode(T data) {
            this.data = data;
            children = new ArrayList<TreeNode<T>>();
        }
    }
        public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
            if (root.children.size() == 0){
                root = null;
                return root;
            }


            for(int i=root.children.size()-1 ; i >= 0 ; i--){
                if (removeLeafNodes(root.children.get(i)) == null){
                    root.children.remove(root.children.get(i));
                }
            }
            return root;
        }
}

