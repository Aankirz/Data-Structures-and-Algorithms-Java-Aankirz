public class ReverseLLBetter {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){

        if (head==null || head.next==null){

            return head;
        }
        LinkedListNode<Integer>revtail=head.next;

        LinkedListNode<Integer>finalhead=reverse_I(head.next);

        revtail.next=head;
        head.next=null;

        return finalhead;
    }
}
