public class PrintElementsinRange {

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if (root==null){
            return;
        }
        if (k2>= root.data){
            if (k1<= root.data){
                System.out.print(root.data+" ");
                elementsInRangeK1K2(root.left,k1,k2);
                elementsInRangeK1K2(root.right,k1,k2);
            }else {
                elementsInRangeK1K2(root.right,k1,k2);
            }
        }else{
            elementsInRangeK1K2(root.left,k1,k2);
        }
    }

}
