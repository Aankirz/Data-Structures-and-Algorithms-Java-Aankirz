public class AppendLastNtoFirst {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<Integer> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
//    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
//    if (head!=null&&n!=0){
//        LinkedListNode<Integer> temp=head;
//        int count=0;
//        while(temp!=null ){
//            temp=temp.next;
//            count++;
//        }
//        int newcount=count-n;
//        count=0;
//        LinkedListNode<Integer> temp1=head;
//        while(count<newcount-1){
//            temp1=temp1.next;
//            count++;
//        }
//        LinkedListNode<Integer> temp2=temp1.next;
//        LinkedListNode<Integer> temp3=temp1.next;
//        while(temp2.next!=null){
//            temp2=temp2.next;
//        }
//        temp2.next=head;
//        temp1.next=null;
//        return temp3;
//    }
//       return head;
//    }
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n){
        int count=0;
        LinkedListNode<Integer>temp=head;
        while (temp.next!=null){
            temp=temp.next;
            count++;
        }
        LinkedListNode<Integer>tail=temp;
        int k=count-n;
        LinkedListNode<Integer>temp1=head;
        for (int i=0;i<k;i++){
            tail.next=temp1;
            tail=tail.next;
            temp1=temp1.next;
        }
        head=temp1.next;

        return head;
    }
}
  //  int i=0;
//      LinkedListNode<Integer>temp=head;
//      while(temp!=null){
//         temp=temp.next;
//          i++;
//      }
//      int count=i-n;
//      i=0;
//      LinkedListNode<Integer>temp1=head;
//      while(i<count-1){
//          temp1=temp1.next;

//      }
//      LinkedListNode<Integer>Newhead=temp1.next;
//      LinkedListNode<Integer>temp2=temp1.next;
//      while(Newhead.next!=null){
//          Newhead=Newhead.next;
//      }
//      Newhead.next=head;
//      temp1.next=null;
//      return temp2;