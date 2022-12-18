public class Mergesort {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer>slow=head;
            LinkedListNode<Integer>fast=head;
            while(fast.next!=null){
                fast=fast.next.next;
                if (fast==null){
                    return new LinkedListNode<>(slow.data);
                }
                slow=slow.next;
            }
        return new LinkedListNode<>(slow.data);
            }
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        LinkedListNode<Integer>t1=head1,t2=head2,head3=null,tail3=null;

        if (t1.data>=t2.data){
            head3=t2;
            tail3=t2;
            t2= t2.next;
        }else{
            head3=t1;
            tail3=t1;
            t1= t1.next;
        }

        while(t1!=null&&t2!=null){
            if (t1.data>t2.data){
                tail3.next=t2;
                tail3=t2;
                t2=t2.next;
            }else{
                tail3.next=t1;
                tail3=t1;
                t1=t1.next;
            }
        }
        if (t1==null){
            tail3.next=t2;
        }else{
            tail3.next=t1;
        }
        return head3;
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
       if (head==null){
           return null;
       }
      LinkedListNode<Integer>mid=midPoint(head);
       LinkedListNode<Integer>head1=head,head2=null;
       while(head1.data!=mid.data){
           head1 = head1.next;
       }
       head2=head1.next;
       while(head2!=null){
           head2=head2.next;
       }
       head1=mergeSort(head1);
       head2=mergeSort(head2);
      mergeTwoSortedLinkedLists(head1,head2);
      return head;
    }

}
