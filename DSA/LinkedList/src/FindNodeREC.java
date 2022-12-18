public class FindNodeREC {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static int findNodeRec(LinkedListNode<Integer> head, int n,int index) {
        if (head==null){
            return -1;
        }
        if (head.data==n){
            return index;
        }

        return findNodeRec(head.next,n,index+1);
    }
    public static int findNodeRec(LinkedListNode<Integer> head, int n){
        return findNodeRec(head,n,0);
    }
}
