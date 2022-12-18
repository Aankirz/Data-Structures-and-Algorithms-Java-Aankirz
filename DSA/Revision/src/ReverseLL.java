public class ReverseLL {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
       if (head==null||head.next==null){
           return head;
       }

       LinkedListNode<Integer>Finalhead=reverseLinkedListRec(head.next);//Redursion's Job

       LinkedListNode<Integer>temp=Finalhead;
       while(temp.next!=null){
           temp=temp.next;
       }
      temp.next=head;
       head.next=null;
       return Finalhead;
    }
}
