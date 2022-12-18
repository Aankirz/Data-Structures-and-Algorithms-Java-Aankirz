import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUseLevelwise {
    public static TreeNode<Integer> takingInputLevelwise(){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the root data : ");

        TreeNode<Integer>root=new TreeNode<>(s.nextInt());

        Queue<TreeNode<Integer>>pendingnodes=new LinkedList<>();
        pendingnodes.add(root);

        while (!pendingnodes.isEmpty()){
           TreeNode<Integer>frontnode=pendingnodes.poll();  //front node has the root data.

            System.out.println("Enter the num of children of "+ frontnode.data);

            int numchildren=s.nextInt();

            for (int i=0;i<numchildren;i++){
                System.out.println("Enter the"+(i+1)+ "th child of "+frontnode.data);
               TreeNode<Integer>childnode=new TreeNode<>(s.nextInt());
                frontnode.children.add(childnode);  //adding in the array.
               pendingnodes.add(childnode);// adding to the queue.

            }

        }

        return root;
    }

//    public static void printLevelWise(TreeNode<Integer> root,int  i){
//        if (i==0){
//            System.out.println(root.data);
//            i++;
//        }
//        for (int j=0;j<root.children.size();j++){
//            System.out.print(root.children.get(j).data+" ");
//        }
//        System.out.println();
//        for (int j=0;j<root.children.size();j++){
//            printLevelWise(root.children.get(j),i );
//        }
//
//    }
//    public static void printLevelWise(TreeNode<Integer> root){
//        printLevelWise(root,0);
//    }
public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>>pendingnodes=new LinkedList<>();
        pendingnodes.add(root);

    System.out.println(root.data);
        while (!pendingnodes.isEmpty()){
           int n= pendingnodes.size();
           for (int i=1;i<=n;i++){
               TreeNode<Integer>front= pendingnodes.poll();
               for (int j=0;j<front.children.size();j++){
                   System.out.print(front.children.get(j).data+" ");
                   pendingnodes.add(front.children.get(j));
               }
           }
            System.out.println();
        }
}


    public static void main(String[] args) {
        TreeNode<Integer>root=takingInputLevelwise();
        printLevelWise(root);
    }
}
