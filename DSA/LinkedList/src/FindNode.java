public class FindNode {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static int findNode(LinkedListNode<Integer> head, int n) {
        int index=0;
        while (head!=null){
            if(head.data.equals(n)){
                return index;
            }
            index++;
            head=head.next;
        }
        return -1;
    }
//      if (head!=null){
//          int index=0;
//          LinkedListNode<Integer>temp=head;
//          while(temp.data!=n&&temp.next!=null){
//              temp=temp.next;
//              index++;
//          }
//                   if (index!=0&&temp.next==null){
//                       return -1;
//                   }
//          if (index==0&&temp==null){
//              return -1;
//          }
//          return index;
//      }
//     return -1;
//    }
}
