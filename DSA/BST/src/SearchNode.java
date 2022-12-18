public class SearchNode {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
     if (root==null){
         return false;
     }
      if (root.data==k){
          return true;
      }
      boolean smallans=true;
      if (k> root.data){
          smallans=searchInBST(root.right,k);
      }else {
          smallans=searchInBST(root.left,k);
      }
      return smallans;
    }
}
