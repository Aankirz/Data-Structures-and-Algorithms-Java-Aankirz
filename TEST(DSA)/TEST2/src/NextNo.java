public class NextNo {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }

        public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
            if (head == null) {
                return null;
            }
//             LinkedListNode<Integer>temp=head;
//             int m=head.data;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             int k=temp.data;
//
//             if (k==9){
//                 LinkedListNode<Integer>newtemp=head;
//                 LinkedListNode<Integer>newhead=null;
//                 if (m==9){
//                    newtemp.data=1;
//                    newhead.data=0;
//                    newhead.next=newtemp.next;
//                    newtemp.next=newhead;
//                    newtemp=newtemp.next;
//                 }
//                 newtemp=newtemp.next;
//                 while(newtemp!=null){
//                     if (newtemp.data==9){
//                         newtemp.data=0;
//                     }else{
//                        newtemp.data+=1;
//                     }
//                     newtemp=newtemp.next;
//                 }
//
//             }else{
//                 temp.data+=1;
//             }
//
//
//        return head;
            LinkedListNode<Integer> current = head;
            LinkedListNode<Integer> prev = null;
            int length = 0;
            LinkedListNode<Integer> last = current;
            while (current != null) {
                length++;
                if (current.data != 9)
                    prev = current;

                last = current;
                current = current.next;
            }// Now last is pointing to last digit.
            //  Prev is pointing to last non 9.
            if (prev == null) {
                //case when number is all 9
                LinkedListNode<Integer> newhead = new LinkedListNode<Integer>(1);
                newhead.next = head;

                while (head != null) {
                    head.data = 0;
                    head = head.next;
                }
                return newhead;
            } else {
                prev.data = prev.data + 1;
                prev = prev.next;
                while (prev != null) {
                    prev.data = 0;
                    prev = prev.next;
                }
                return head;


            }
        }
    }
}
