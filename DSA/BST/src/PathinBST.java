import java.util.ArrayList;

public class PathinBST {

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if (root==null){
            return null;
        }
        if (root.data==data){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(root.data);
            return list;
        }
//        ArrayList<Integer>output=new ArrayList<>();
//        if (root.data>data){
//            if (root.left!=null)
//            output=getPath(root.left,data);
//        }else{
//            if (root.right!=null)
//            output=getPath(root.right,data);
//        }
//        output.add(root.data);
//
//        return output;
        ArrayList<Integer>leftoutput=getPath(root.left,data);
        if (leftoutput!=null){
            leftoutput.add(root.data);
            return leftoutput;
        }
        ArrayList<Integer>rightoutput=getPath(root.right,data);

        if (rightoutput!=null){
            rightoutput.add(root.data);
            return rightoutput;
        }else{
            return null;
        }

    }

}
