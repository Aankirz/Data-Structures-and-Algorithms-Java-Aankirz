public class DeleteAlternateNodes {
    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
    public static void deleteAlternateNodes(Node<Integer> head) {
        if (head.next==null){
            return ;
        }
       Node<Integer>temp=head;
       Node<Integer>prev=head;
       Node<Integer>curr=head.next.next;

       while(curr!=null){

           prev.next=curr;
           prev=curr;
           head=head.next;
           curr=head.next.next;
       }
      prev.next=null;
    }
}
