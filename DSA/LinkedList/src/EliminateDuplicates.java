
public class EliminateDuplicates {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if (head!=null) {


            LinkedListNode<Integer> head1 = head;
            LinkedListNode<Integer> tail1 = head1;
            LinkedListNode<Integer> tail2 = head1.next;

            while (tail2 != null) {
                if (tail1.data.equals(tail2.data)) {
                    tail2 = tail2.next;
                    if (tail2 == null) {
                        tail1.next = null;
                        tail1 = null;
                    }
                } else {
                    tail1.next = tail2;
                    tail1 = tail2;
                    tail2 = tail2.next;
                }
            }
            return head1;
        }
        return null;
    }
}
