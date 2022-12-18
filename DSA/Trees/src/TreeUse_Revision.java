import java.util.*;

public class TreeUse_Revision {
    public static TreeNode<Integer>takeInput(Scanner s){
        System.out.println("Enter next Node data:");
        int n=s.nextInt();
        TreeNode<Integer>root=new TreeNode<>(n);
        System.out.println("Enter no. of children for"+n);
        int childcount=s.nextInt();

        for (int i=0;i<childcount;i++){
            TreeNode<Integer>child=takeInput(s);
            root.children.add(child);
        }
        return root;
    }
    public static void print(TreeNode<Integer>root){
        // Better Version
        String s=root.data+":";
        for (int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+",";

        }
        System.out.println(s);
        for (int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }

//        System.out.print(root.data+":")

//        for (int i=0;i<root.children.size();i++){
//            System.out.print(root.children.get(i).data+",");
//        }
//        System.out.println();
//        for (int i=0;i<root.children.size();i++){
//            print(root.children.get(i));
//        }
    }
    
    public static int numNodeGreater(TreeNode<Integer> root,int x) {
        if (root==null){
            return 0;
        }
        int count=0;
        if (root.data>x){
            count++;
        }
        for (int i=0;i<root.children.size();i++){
            count+=numNodeGreater(root.children.get(i),x );
        }
        return count;
    }
}
