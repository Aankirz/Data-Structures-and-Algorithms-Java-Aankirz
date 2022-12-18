public class Kreverse {
//    class LinkedListNode<T> {
//        T data;
//        LinkedListNode<T> next;
//
//        public LinkedListNode(T data) {
//            this.data = data;
//        }
//    }
//
//    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
//
//        if (head != null) {
//            if (head.next == null || head == null) {
//                return head;
//            }
//            LinkedListNode<Integer> reversedtail = head.next; //storing the tail because it's usual that I have to just make it link with the current i/p
//            // i.e head;
//            LinkedListNode<Integer> smallhead = reverse_I(head.next);
//
//            reversedtail.next = head;      //USING I/P & O/P WISELY.
//            head.next = null;
//            return smallhead;
//        }
//        return null;
//    }
//
//    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
//
//    }
}