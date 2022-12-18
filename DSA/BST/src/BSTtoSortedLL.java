public class BSTtoSortedLL {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        public LinkedListNode(T data)
        {
            this.data = data; }
    }
    static class pair{
        LinkedListNode<Integer>head;
        LinkedListNode<Integer>tail;
    }
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
    pair ans=helper(root);
    return ans.head;
    }

    private static pair helper(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }
        //we will do a smaller calculation rest is of recursion's job.(attaching left part as head and right part as tail.)
        pair lefttree=helper(root.left);//head
        LinkedListNode<Integer>newNode=new LinkedListNode<>(root.data);//mid
        pair righttree=helper(root.right);//tail
        //output shaper.
        pair output=new pair();
        if(lefttree!=null){
            output.head=lefttree.head;
            lefttree.tail.next=newNode;
        }else{
            output.head=newNode;
        }
        newNode.next= righttree.head;
        if(righttree!=null){
            output.tail= righttree.tail;
        }else{
            output.tail=newNode;
        }


        return output;
    }
//    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
//      LinkedListNode<Integer>head=new LinkedListNode<>(root.data);
//      LinkedListNode<Integer>tail=head;
//      LinkedListNode<Integer>getRight=rightSorted(root.right,tail);
//      LinkedListNode<Integer>getLeft=leftSorted(root.left,head);
//      return head;
//    }
//
//    private static LinkedListNode<Integer> leftSorted(BinaryTreeNode<Integer> root, LinkedListNode<Integer> head) {
//        if(root==null){
//            return null;
//        }
//        LinkedListNode<Integer>temp=new LinkedListNode<>(root.data);
//        temp.next=head;
//        head=temp;
//        return head;
//    }
//
//    private static LinkedListNode<Integer> rightSorted(BinaryTreeNode<Integer> root,  LinkedListNode<Integer> tail) {
//      if(root==null){
//          return null;
//      }
//        tail.next=new LinkedListNode<>(root.data);
//        tail=tail.next;
//
//        return  rightSorted(root.right,tail);
//    }

//    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root,LinkedListNode<Integer>ltail) {
//           if (root.left==null){
//               ltail=new LinkedListNode<>(root.data);
//               return new LinkedListNode<>(root.data);
//           }
//           if (root.right==null){
//               return new LinkedListNode<>(root.data);
//           }
//           LinkedListNode<Integer>lefthead=constructLinkedList(root.left,ltail);
//         LinkedListNode<Integer>temp=new LinkedListNode<>(root.data);
//          ltail.next=temp;
//          ltail=temp;
//          LinkedListNode<Integer>righthead=constructLinkedList(root.right,ltail);
//          ltail.next=righthead;
//          ltail=righthead;
//
//          return lefthead;
//
//    }
//    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
//        return constructLinkedList(root,null);
//    }

}
