public class LengthLL_Printith {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        LinkedListNode (T data) {
            this.data = data;
        }
                  //Length LL
        public static int length(LinkedListNode<Integer> head){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }
//        int count=0;
//           while(head.data!=6){
//            count++;
//            head=head.next;
//        }
//           return count;
//        LinkedListNode<Integer>temp=head;  //Use address as a help not the elements.
//        int count=0;
//            while(temp!=null){   //don't write temp.length !=null ,null pointer exception.
//            count++;
//            temp=temp.next;
//        }
//            return count;

                   // Print ith Node
                   public static void printIthNode(LinkedListNode<Integer> head, int i){

                  if (head!=null){
                      if (i==0){
                          System.out.println(head.data);
                          return;
                      }
                      printIthNode(head.next,i-1);
                  }

                   }
    }

}
