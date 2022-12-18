public class BinarySearchTree {
   static class BinaryTreeNode<T> {
  		T data;
  		BinaryTreeNode<T> left;
  		BinaryTreeNode<T> right;
  		public BinaryTreeNode(T data)
  		{
  			this.data = data;
  		}
  }
  private BinaryTreeNode<Integer>root;
   public void insert(int data){
   insertData(data,root);
   }

 private BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
    if (root==null){
     return new BinaryTreeNode<>(data);
    }
    if (root.data>=data){
     root.left=insertData(data,root.left);
    }else{
     root.right=insertData(data,root.right);
    }
    return root;
 }
 public void remove(int data){
   root= removeHelper(data,root);
 }

 private BinaryTreeNode<Integer> removeHelper(int data, BinaryTreeNode<Integer> root) {
    if (root==null){
     return null;
    }
    if(data< root.data){
      root.left=removeHelper(data,root.left);
      return root.left;
    }
    if (data>root.data){
     root.right=removeHelper(data,root.right);
     return root.right;
    }
    else{
     if(root.left==null){
      return root.right;
     }
     if (root.right==null){
      return root.left;
     }else{
      BinaryTreeNode<Integer>minNode=root.right;
//      while(minNode.left)
     }

    }
    return root;
 }
}
