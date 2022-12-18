public class getLCA {
    public static int getLCA(BinaryTreeNode<Integer>root,int a ,int b){
        if (root==null){
            return -1;
        }

       if (root.data==a||root.data==b){
           return root.data;
       }


       int ans1=getLCA(root.left,a,b);
       int ans2=getLCA(root.right,a,b);

        if (ans2==-1&&ans1!=-1){
            return ans1;
        }
       if (ans1==-1&&ans2!=-1){
           return ans2;
       }

        if (ans1==-1&&ans2==-1){
            return -1;
        }else{
               return root.data;
        }

    }
}
