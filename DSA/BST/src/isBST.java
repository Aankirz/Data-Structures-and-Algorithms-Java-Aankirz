public class isBST {
      //        My Approach
    public static boolean isBST(BinaryTreeNode<Integer> root) {
     if (root.right!=null){
         if (root.right.data< root.data){
             return false;
         }
         boolean small=isBST(root.right);
     }
   if (root.left!=null){
       if (root.left.data> root.data){
           return false;
       }
       boolean smallans=isBST(root.left);
   }
   return true;
    }

                    //       CheckBST 1 (Beauty of Recursion)
                   public static int maximum(BinaryTreeNode<Integer> root) {
                     if (root==null){
                         return Integer.MIN_VALUE;
                     }
                     return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }
    public static boolean isBST1(BinaryTreeNode<Integer>root){
        if (root==null)
        return true;

        int leftMax=maximum(root.left); //The max of left should be smaller than the root.
        int rightMin=minimum(root.right);//The min of right should be larger than the root.

        if (leftMax>= root.data){
            return false;
        }
        if (rightMin< root.data){
            return false;
        }

        boolean left=isBST1(root.left);
        boolean right=isBST1(root.right);
        if (left&&right){
            return true;
        }else{
            return false;
        }
    }

               //Check BST 2 (Usage of class/pair class(pair within a pair))

    public static pair<Boolean,pair<Integer,Integer>>isBST2(BinaryTreeNode<Integer>root){
        if (root==null){
            pair<Boolean,pair<Integer,Integer>>output=new pair<Boolean,pair<Integer,Integer>>();
            output.first=true;
            output.second.first=Integer.MAX_VALUE;     //Minimum
            output.second.second=Integer.MIN_VALUE;  //Maximum
            return output;
        }                //Recursion
        pair<Boolean,pair<Integer,Integer>>leftoutput=isBST2(root.left);
        pair<Boolean,pair<Integer,Integer>>rightoutput=isBST2(root.right);

        int min=Math.min(root.data,Math.min(leftoutput.second.first,rightoutput.second.first));
        int max=Math.max(root.data,Math.max(leftoutput.second.second,rightoutput.second.second));

        boolean isBST=(root.data>leftoutput.second.second)&&(root.data<rightoutput.second.first)&& leftoutput.first&& rightoutput.first;
        pair<Boolean,pair<Integer,Integer>>output=new pair<Boolean,pair<Integer,Integer>>();
        output.first=isBST;
        output.second.first=min;
        output.second.second=max;
        return output;
    }

    public static boolean isBST3(BinaryTreeNode<Integer>root,int min,int max){
        if (root==null)
            return true;
        if (root.data<min||root.data>max)
            return false;

        boolean leftoutput=isBST3(root.left,min,root.data-1);
        boolean rightoutput=isBST3(root.right, root.data+1,max);

        return leftoutput&&rightoutput;
    }
    public static boolean isBST3(BinaryTreeNode<Integer>root){
        return isBST3(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }


}
