public class InserDuplicateNode {
    public static void insertDuplicateNode(BinaryTreeNode<Integer>root){
        if (root==null){
            return;
        }
        BinaryTreeNode<Integer>temp=new BinaryTreeNode<>(root.data);
        temp.left=root.left;
        root.left=temp;
        insertDuplicateNode(temp.left);
        insertDuplicateNode(root.right);
    }
}
