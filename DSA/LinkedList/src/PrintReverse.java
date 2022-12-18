public class PrintReverse {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static void printReverse(LinkedListNode<Integer> head) {
        if (head!=null){
            if (head.next==null){
                System.out.print(head.data+" ");
                return ;
            }
            printReverse(head.next);
            System.out.print(head.data+" ");
        }

    }

}
