import java.util.LinkedList;
import java.util.Queue;

public class PathSumRoottoLeaf {
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, Queue<Integer>q) {
       if (k==0){
           print(q);
       }
       if (k<0){
           return;
       }
      q.add(root.data);
        if (root.left!=null){
            rootToLeafPathsSumToK(root.left,k- root.data,q);
        }
        if (root.right!=null){
            rootToLeafPathsSumToK(root.right,k-root.data,q);
        }
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k){
        rootToLeafPathsSumToK(root,k,new LinkedList<>());
    }

    public static void print(Queue<Integer>q){
       while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println();
        return;
    }
}
