import java.util.*;

public class TreeUse {
    public static TreeNode<Integer> takeInput(Scanner s){
             //So If we use scanner here then we can't give data at once.
             //Taking input recursively
        System.out.println("Enter next node data :");
        int n=s.nextInt();
        TreeNode<Integer>root=new TreeNode<>(n);
        System.out.println("Enter no. of children for"+ n);
        int childcount=s.nextInt();

        for(int i=0;i<childcount;i++){
            TreeNode<Integer>child=takeInput(s);
            root.children.add(child);
        }

        return root;
    }

    public static void print(TreeNode<Integer>root){
       String s=root.data+":";
       for (int i=0;i<root.children.size();i++){
           s=s+root.children.get(i).data+",";
       }
        System.out.println(s);
       for (int i=0;i<root.children.size();i++){
           print(root.children.get(i));
       }
    }

    public static int numNodes(TreeNode<Integer>root){
        if (root==null){
            return 0;  //Not a base case;
        }
        int count=1;
//        return root.children.size()+1;  //dumb
        for (int i=0;i<root.children.size();i++){
            count+=numNodes(root.children.get(i));
        }
        return count;
    }
    public static int sumOfAllNode(TreeNode<Integer> root){
      int sum=root.data;
      for (int i=0;i<root.children.size();i++){
          sum+=sumOfAllNode(root.children.get(i));
      }
      return sum;
    }

    public static int largest(TreeNode<Integer> root){
        if (root==null){
            return Integer.MIN_VALUE;
        }

        int ans=root.data;
        for (int i=0;i<root.children.size();i++){
            int childlargest=largest(root.children.get(i));
            if (childlargest>ans){
                ans=childlargest;
            }
        }
        return ans;
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        return findSecondLargest(root,largest(root));
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root,int large){
        if (root==null){
            return null;
        }
        if (root.data==large){
            root.data=Integer.MIN_VALUE;
        }
        TreeNode<Integer> ans=root;
        for (int i=0;i<root.children.size();i++){
            TreeNode<Integer>childsecond=findSecondLargest(root.children.get(i),large);
            if (childsecond.data>ans.data){
                ans= childsecond;
            }
        }
        return ans;
    }


        public static int numNodeGreater(TreeNode<Integer> root,int x) {
        Queue<TreeNode<Integer>>pendingnodes=new LinkedList<>();
        pendingnodes.add(root);
        int n=0;
        int ans=root.data;
        while(!pendingnodes.isEmpty()){
            TreeNode<Integer>front=pendingnodes.poll();
            ans= front.data;
            if (ans>x){
                n++;
            }
            for (int i=0;i<front.children.size();i++){
                TreeNode<Integer>child=front.children.get(i);
                pendingnodes.add(child);

            }
        }
return n;
    }

    public static int getHeight(TreeNode<Integer> root){  //Calculating Tree Levels and using it to calculate height.
        Queue<TreeNode<Integer>>pendingnodes=new LinkedList<>();
        pendingnodes.add(root);
        int h=0;
        // System.out.println(root.data);
        while (!pendingnodes.isEmpty()){
            int n= pendingnodes.size();
            for (int i=1;i<=n;i++){
                TreeNode<Integer>front= pendingnodes.poll();
                for (int j=0;j<front.children.size();j++){
                    // System.out.print(front.children.get(j).data+" ");
                    pendingnodes.add(front.children.get(j));
                }
            }
            h++;
            // System.out.println();
        }
        return h;
//        if(root==null){
//            return 0;
//        }
//         if (root.children.size()==0){
//                return 1;
//        }
//      int n=1;
//      Queue<TreeNode<Integer>>pendingnode=new LinkedList<>();
//      pendingnode.add(root);
//
//      while(!pendingnode.isEmpty()){
//          TreeNode<Integer>frontnode=pendingnode.poll();
//          Queue<TreeNode<Integer>>height=new LinkedList<>();
//          for (int i=0;i<frontnode.children.size();i++){
//              TreeNode<Integer>child=frontnode.children.get(i);
//              if (child.children.size()!=0){
//                  pendingnode.add(child);
//                  height.add(child);
//              }
//          }
//         if (!height.isEmpty()){
//             n++;
//         }
//
//      }
//      return n+1;
    }

    public static void printatK(TreeNode<Integer>root,int k){
        if (k<0){
            return;
        }
        if (k==0){
            System.out.println(root.data);
        return;}
        for (int i=0;i<root.children.size();i++){
            printatK(root.children.get(i),k-1);
        }
    }

    public static int countLeafNodes(TreeNode<Integer> root){
        Queue<TreeNode<Integer>>pendingnode=new LinkedList<>();
        pendingnode.add(root);
        Queue<TreeNode<Integer>> height = new LinkedList<>();
        while(!pendingnode.isEmpty()) {
            TreeNode<Integer> frontnode = pendingnode.poll();

            for (int i = 0; i < frontnode.children.size(); i++) {
                TreeNode<Integer> child = frontnode.children.get(i);
                if (child.children.size() == 0) {
                    height.add(child);
                }
                pendingnode.add(child);
            }
        }
return height.size();
    }

    public static void preorder(TreeNode<Integer> root){
        if (root==null){
            return;
        }

        System.out.print(root.data+" ");

        for(int i=0;i<root.children.size();i++){
            preorder(root.children.get(i));
        }
    }

    public static void printPostOrder(TreeNode<Integer> root){
        if (root==null){
            return;
        }

        for(int i=0;i<root.children.size();i++){
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
     if(root==null){
         return false;
     }
     if (root.data==x){
         return true;
     }
for (int i=0;i<root.children.size();i++){
   if (checkIfContainsX(root.children.get(i),x)){
       return true;
    }
}
return false;
    }

    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
     if (root1.data!=root2.data){
         return false;
     }
        for (int i=0;i<root1.children.size();i++){
            if (!checkIdentical(root1.children.get(i),root2.children.get(i))){
                return false;
            }
        }
        return true;
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root,int n){
    root.data=n;
    for(int i=0;i<root.children.size();i++){
        replaceWithDepthValue(root.children.get(i),n+1);
    }
    }
    public static void replaceWithDepthValue(TreeNode<Integer> root){
         replaceWithDepthValue(root,0);
    }
//    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
//        if (root==null){
//            return null;
//        }
//        TreeNode<Integer>ans=null;
//        for (int i=0;i<root.children.size();i++){
//            ans=maxSumNode(root.children.get(i));
//        }
//         int largestsum=sumchild(root);
//           for (int i=0;i<root.children.size();i++){
//         int maxsum=sumchild(root.children.get(i));
//                if (maxsum>largestsum){
//                    ans=root.children.get(i);
//                }
//           }
//           return ans;
//    }

//    public static int sumchild(TreeNode<Integer>root){
//        int sum= root.data;
//        for (int i=0;i<root.children.size();i++){
//            sum+=root.children.get(i).data;
//        }
//        return sum;
//    }

//        public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n,int max){
//  if(root.data>n) {
//
//  }
//     for (int j=0;j<root.children.size();j++){
//        return findNextLargerNode(root.children.get(j),n,max);
//
//     }
//     return root;
//    }
//    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
//        return findNextLargerNode(root,n,0);
//    }
//public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
//
//}

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root==null){
            return null;
        }
        TreeNode<Integer>ans=root;
        int sum=SumImmediateChild(root);
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer>childmax=maxSumNode(root.children.get(i));
              int sumchild=SumImmediateChild(childmax);
            if (sumchild>sum){
                sum=sumchild;
                ans=childmax;
            }
        }
        return ans;
    }
    public static int SumImmediateChild(TreeNode<Integer>root){
        int sum=0;
        for (int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
        return root.data+sum;
    }


        public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        TreeNode<Integer>Root=takeInput(s);
//print(Root);

        TreeNode<Integer>root=new TreeNode<>(4);
        TreeNode<Integer>node1=new TreeNode<>(2);
        TreeNode<Integer>node2=new TreeNode<>(3);
        TreeNode<Integer>node3=new TreeNode<>(5);
        TreeNode<Integer>node4=new TreeNode<>(20);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

//        print(root);
//        System.out.println(numNodes(root));
        System.out.println(largest(root));
    }
}
