public class pairsum {
//    public static void pairSum(BinaryTreeNode<Integer>root,int sum,BinaryTreeNode<Integer>temp){
//        if (root==null)
//            return;
//         boolean ans= print(temp,sum-root.data,root.data);
//         if (ans==true){
//             root.data=Integer.MIN_VALUE;
//         }
//
//        if (root.left!=null){
//            pairSum(root.left,sum,temp);
//        }
//
//        if (root.right!=null){
//            pairSum(root.right,sum,temp);
//        }
//
//
//    }
//    public static void pairSum(BinaryTreeNode<Integer>root,int sum){
//        pairSum(root,sum,root);
//        return;
//    }
//   public static boolean print(BinaryTreeNode<Integer>root,int k,int n){
//        if (k<=0)
//            return false;
//        if (root.data==k&&root.data!=n){
//            System.out.print(n+" ");
//            System.out.print(k+" ");
//            System.out.println();
//            return true;
//        }
//       if (root.left!=null)
//        print(root.left,k,n);
//       if (root.right!=null)
//        print(root.right,k,n);
//
//       return false;
//   }
static void pairSum(BinaryTreeNode<Integer> root, int sum) {
  if(sum==0){
      return;
  }
  if(root==null){
      return;
  }
    int n=sum-root.data;
    if(n>root.data){
        pairSum(root.right,sum-root.data);
        
    }

}
}
