package Link;

public class DeleteNode {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
       if (head==null){
           return head;
       }

        if (pos==0){
            head=head.next;
            return head;
        }
      LinkedListNode<Integer>temp=head;
       int i=0;
       while(i<pos-1&&temp.next!=null){
          temp=temp.next;
//           if (temp.next==null){
//               return head;
//           }
           i++;
       }
       if (temp.next==null){
           return head;
       }

      temp.next=temp.next.next;

       return head;
    }

}

//                DONE</>