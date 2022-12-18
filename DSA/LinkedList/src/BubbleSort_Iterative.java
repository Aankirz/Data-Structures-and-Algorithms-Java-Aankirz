public class BubbleSort_Iterative {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer>swap(LinkedListNode<Integer>prev,LinkedListNode<Integer>curr,LinkedListNode<Integer>future){
        prev.next=curr.next;
        curr.next=future.next;
        future.next=curr;
        return prev;
    }
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
          LinkedListNode<Integer>temp1=head;
         int count=0;
         while(temp1!=null){
             count++;
             temp1=temp1.next;
         }
        System.out.println(count);
        LinkedListNode<Integer>temp=head;
        LinkedListNode<Integer>prev=null;
         for (int i=0;i<count;i++){
             temp=head;prev=null;
             for (int j=i+1;j<count;j++){
                 int n=0;
                 LinkedListNode<Integer>curr=temp;
                 LinkedListNode<Integer>future=temp.next;
                 if ( curr.data> future.data){
                     n++;
                     if (prev!=null){
                         swap(prev,curr,future);
                     }else{
                         curr.next=future.next;
                         future.next=curr;
                         head=future;
                     }
                 }
                 if (n==0){
                     prev=curr;
                 }else{
                     prev=future;
                 }
                 temp=temp.next;
             }

         }
   return head;
    }

}
