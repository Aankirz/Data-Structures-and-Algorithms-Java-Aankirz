import java.util.*;
import java.util.Stack;
public class BinaryTreeuse {
    static class LinkedListNode<T>
	  {
	  		T data;
	  		LinkedListNode<T> next;
	  		public LinkedListNode(T data)
                 		{
                  		this.data = data;
	   	}
	   }
    public static BinaryTreeNode<Integer>takeInput(Scanner s){
        int rootData;
        System.out.println("Enter root data");
        rootData=s.nextInt();
        if (rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(rootData);
        root.left=takeInput(s);
        root.right=takeInput(s);
        return root;
    }
    public void PrintTree(BinaryTreeNode<Integer>root){
        if (root==null)
            return;

        String tobePrinted=root.data+" ";
        if (root.left!=null){
            tobePrinted+="L:"+root.left.data+",";

        }
        if (root.right!=null){
            tobePrinted+="R:"+root.right.data+",";
        }
        System.out.println(tobePrinted);
        PrintTree(root.left);
        PrintTree(root.right);

    }

    public static BinaryTreeNode<Integer>takeInputLevelwise(){
        Scanner s =new Scanner(System.in);

        Queue<BinaryTreeNode<Integer>>pendingnodes=new LinkedList<>();
        System.out.println("Enter root data");
        int rootdata=s.nextInt();
        if (rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(rootdata);
        pendingnodes.add(root);

        while (!pendingnodes.isEmpty()) {
            BinaryTreeNode<Integer>front=pendingnodes.poll();
            System.out.println("Enter the left node data for"+front.data);
            int leftdata=s.nextInt();
           if (leftdata!=-1){
               BinaryTreeNode<Integer>child=new BinaryTreeNode<>(leftdata);
               pendingnodes.add(child);
               front.left=child;
           }
            System.out.println("Enter the right node data for"+front.data);
            int rightdata=s.nextInt();
            if (rightdata!=-1){
                BinaryTreeNode<Integer>child=new BinaryTreeNode<>(rightdata);
                pendingnodes.add(child);
                front.right=child;
            }
        }
        return root;
    }
    public static void printLevelWise1(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>>pendingnodes=new LinkedList<>();
        pendingnodes.add(root);

        while(!pendingnodes.isEmpty()){
            BinaryTreeNode<Integer>front=pendingnodes.poll();
            System.out.print(front.data+":");
                BinaryTreeNode<Integer>leftchild=front.left;
                if (leftchild!=null){
                    System.out.print("L:"+leftchild.data+",");
                    pendingnodes.add(leftchild);
                }else{
                    System.out.print("L:"+-1+",");
                }

            BinaryTreeNode<Integer>rightchild=front.right;
                if (rightchild!=null){
                    System.out.print("R:"+rightchild.data);
                    pendingnodes.add(rightchild);
                }else{
                    System.out.print("R:"+-1);
                }

            System.out.println();
        }
    }

    public static int countNodes(BinaryTreeNode<Integer>root){
       if(root==null){
           return 0;
       }
        int ans=1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);
        return ans;

    }
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if (root==null) {
            return false;

        }
        if (root.data == x) {
            return true;
        }

        boolean ans1=isNodePresent(root.left,x);
        boolean ans2=isNodePresent(root.right,x);



        return ans1||ans2;
    }

    public static int Height(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        int leftheight=Height(root.left);
        int rightheight=Height(root.right);

        return 1+Math.max(leftheight,rightheight);
   }
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
     root=mirror(root);
     mirrorBinaryTree(root.left);
     mirrorBinaryTree(root.right);
    }
    public static BinaryTreeNode<Integer>mirror(BinaryTreeNode<Integer>root){
        if (root!=null){
            BinaryTreeNode<Integer>front=root.left;

            root.left=root.right;
            root.right=front;
        }
        return root;
    }
    public static int diameter(BinaryTreeNode<Integer>root){
        if (root==null)
            return 0;
        int option1=height(root.left)+height(root.right);
        int option2=height(root.left);
        int option3=height(root.right);

        return Math.max(option1,Math.max(option2,option3));
    }
public static pair< Integer,Integer>heightDiameter(BinaryTreeNode<Integer>root){
        if (root==null){
            pair<Integer,Integer>NewPair=new pair<>();
            NewPair.first=0;  //First->Height;
            NewPair.second=0; //Second->Diameter;
            return NewPair;
        }
          pair<Integer,Integer>lo=heightDiameter(root.left);
        pair<Integer,Integer>ro=heightDiameter(root.right);
        int height=1+Math.max(lo.first,ro.first);
        int option1= lo.first+ro.first;
        int option2=lo.second;//left's diameter
        int option3=ro.second;//right's diameter
        int Diameter=Math.max(option1,Math.max(option2,option3));
        pair<Integer,Integer>output=new pair<>();
        output.first=height;
        output.second=Diameter;
        return output;
}
    private static int height(BinaryTreeNode<Integer> root) {
        if (root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);

        return 1+Math.max(lh,rh);
    }

    public static void inorder(BinaryTreeNode<Integer>root){
        if (root==null)
            return;
        inorder(root.left);

    System.out.print(root.data+" ");

    inorder(root.right);
}

    public static void preOrder(BinaryTreeNode<Integer> root) {
       if (root==null){
           return;
       }
        System.out.print(root.data+" ");

       preOrder(root.left);
       preOrder(root.right);
    }
    public static void postOrder(BinaryTreeNode<Integer> root) {
       if (root==null)
           return;
       postOrder(root.left);
       postOrder(root.right);

        System.out.print(root.data+" ");
    }

    public static BinaryTreeNode<Integer> buildTree1(int[] preOrder, int[] inOrder,int preS,int preE,int inS,int inE) {
     if(inS>inE){
         return null;
     }
     int rootData=preOrder[preS];
     BinaryTreeNode<Integer>root=new BinaryTreeNode<>(rootData);
     int rootindex=-1;
     for (int i=inS;i<=inE;i++){
         if (inOrder[i]==rootData){
             rootindex=i;
             break;
         }
     }
        int leftinS=inS;
        int leftinE=rootindex-1;
        int leftpreS=preS+1;
        int leftpreE=leftpreS+leftinE-leftinS;
        int rightinS=rootindex+1;
        int rightinE=inE;
        int rightpreS=leftpreE+1;
        int rightpreE=preE;

        root.left=buildTree(preOrder,inOrder,leftpreS,leftpreE,leftinS,leftinE);
        root.right=buildTree(preOrder,inOrder,rightpreS,rightpreE,rightinS,rightinE);

        return root;
    }
    public static BinaryTreeNode<Integer> buildTree1(int[] preOrder, int[] inOrder){
        return buildTree1(preOrder,inOrder,0,preOrder.length-1,0, inOrder.length-1);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int postS,int postE,int inS,int inE) {
       //Base Case
        if (inS>inE){
            return null;
        }
        int rootdata=postOrder[postE];
        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(rootdata);
        int rootINindex=-1;
        for (int i=inS;i<=inE;i++){
            if (inOrder[i]==rootdata){
                rootINindex=i;
                break;
            }
        }


        int leftinS=inS;
        int leftinE=rootINindex-1;
        int leftpostS=postS;
        int leftpostE=leftinE-leftinS+leftpostS;
        int rightpostS=leftpostE+1;
        int rightpostE=postE-1;
        int rightinS=rootINindex+1;
        int rightinE=inE;

        root.left=buildTree(postOrder,inOrder,leftpostS,leftpostE,leftinS,leftinE);
        root.right=buildTree(postOrder,inOrder,rightpostS,rightpostE,rightinS,rightinE);

        return root;
    }
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder){
        return buildTree(postOrder,inOrder,0,postOrder.length-1,0, inOrder.length-1);
    }


    public static int getSum(BinaryTreeNode<Integer> root){
       if (root==null){
           return 0;
       }
       int sum=root.data;
       sum+=getSum(root.left);
       sum+=getSum(root.right);

       return sum;
    }
    public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
  if (root==null){
    return true;
  }
    int lh=Height(root.left);
  int rh=Height(root.right);
   if((Math.max(lh,rh)-Math.min(lh,rh))<=1){
      return true;
        }
        else{
      return false;
        }

    }
public static void printLevelWise(BinaryTreeNode<Integer> root) {
    Queue<BinaryTreeNode<Integer>>pendingnode=new LinkedList<>();
    pendingnode.add(root);
    System.out.println(root.data);
    while (!pendingnode.isEmpty()){
        int n= pendingnode.size();

        for (int i=1;i<=n;i++){
            BinaryTreeNode<Integer>temp=pendingnode.poll();
            if (temp.left!=null){
                System.out.print(temp.left.data+" ");
                pendingnode.add(temp.left);
            }
            if (temp.right!=null){
                System.out.print(temp.right.data);
                pendingnode.add(temp.right);
            }
        }
        System.out.println();
    }
}

    public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        if (root.left==null&&root.right==null){
            return null;
        }
        if (root.left!=null){
            root.left=removeAllLeaves(root.left);
        }
        if (root.right!=null){
            root.right=removeAllLeaves(root.right);
        }


        return root;
    }
//    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
//     Queue<BinaryTreeNode<Integer>>pendingnodes=new LinkedList<>();
//     pendingnodes.add(root);
//
//    }
public static void printZigZag(BinaryTreeNode<Integer> root){
    Stack<BinaryTreeNode<Integer>>pendingnodeRL=new Stack<>();
    Stack<BinaryTreeNode<Integer>>pendingnodeLR=new Stack<>();
    pendingnodeRL.add(root);
    int z=4;
    while (!pendingnodeRL.isEmpty()||!pendingnodeLR.isEmpty()){
        if (z%2==0){
            int n= pendingnodeRL.size();
            for (int i=1;i<=n;i++){
                BinaryTreeNode<Integer>temp=pendingnodeRL.pop();
                System.out.print(temp.data+" ");
                if (temp.left!=null)
                pendingnodeLR.add(temp.left);
                if (temp.right!=null)
                pendingnodeLR.add(temp.right);
            }
            z++;
        }else{
            int n= pendingnodeLR.size();
            for (int i=1;i<=n;i++){
                BinaryTreeNode<Integer>temp=pendingnodeLR.pop();
                System.out.print(temp.data+" ");
                if (temp.right!=null)
                pendingnodeRL.add(temp.right);
                if (temp.left!=null)
                pendingnodeRL.add(temp.left);
            }

            z++;
        }
        System.out.println();
    }
}
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
      if (root!=null){
          if (root.left.left==null&&root.left.right==null&&root.right.left==null&&root.right.left==null){
              System.out.print(root.data+" ");
          }
          printNodesWithoutSibling(root.left);
          printNodesWithoutSibling(root.right);
      }
    }

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        Queue<BinaryTreeNode<Integer>>pendingnode=new LinkedList<>();
        pendingnode.add(root);
        ArrayList<LinkedListNode<Integer>>output=new ArrayList<>();
        LinkedListNode<Integer>head=new LinkedListNode<>(root.data);
        output.add(head);
        while (!pendingnode.isEmpty()){
            int n= pendingnode.size();
            LinkedListNode<Integer>head1 = null,tail1=null;
            for (int i=1;i<=n;i++){
                BinaryTreeNode<Integer>temp=pendingnode.poll();
                if (temp.left!=null){
                    if (head1==null){
                        head1=new LinkedListNode<>(temp.left.data);
                        output.add(head1);
                        tail1=head1;
                    }else{
                        tail1.next=new LinkedListNode<>(temp.left.data);
                        tail1=tail1.next;
                    }
                    pendingnode.add(temp.left);
                }
                if (temp.right!=null){
                    if (head1==null){
                        head1=new LinkedListNode<>(temp.right.data);
                        output.add(head1);
                        tail1=head1;
                    }else{
                        tail1.next=new LinkedListNode<>(temp.right.data);
                        tail1=tail1.next;
                    }

                    pendingnode.add(temp.right);
                }
            }

        }
        return output;
    }

        public static void main(String[] args) {

        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer>node1=new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer>node2=new BinaryTreeNode<>(3);
        root.left=node1;
        root.right=node2;
    }
}
