public class SwapNodes {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
     if (i==j){
         return head;
     }
if (i>j){
    int u=i;
    i=j;
    j=u;
}
      LinkedListNode<Integer>temp=head;
      int count=0;
      if (i==0){
          LinkedListNode<Integer>c1=temp;
          int n=1;
          while(n<j){
              temp=temp.next;
          }
          LinkedListNode<Integer>p2=temp;
          temp=temp.next;
          LinkedListNode<Integer>c2=temp;

          p2.next=c1;
          c1.next=c2.next;
          c2.next=p2;
          return head;
      }

                         //Normal Cases.
      while (count<i-1){
          temp=temp.next;
          count++;
      }
      LinkedListNode<Integer>p1=temp;
      temp=temp.next;
      LinkedListNode<Integer>c1=temp;
     int n=1;
      while(n<j-i){
          temp=temp.next;
          n++;
      }
      LinkedListNode<Integer>p2=temp;
      temp=temp.next;
      LinkedListNode<Integer>c2=temp;

      p1.next=c2;
      p2.next=c1;
      c1.next=c2.next;
      c2.next=p2;
      return head;
    }
}
