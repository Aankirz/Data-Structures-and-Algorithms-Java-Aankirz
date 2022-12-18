public class SkipDelete {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
         LinkedListNode<Integer>temp=head;
         if (M==0){
             return null;
         }
         int n=0;
         while(temp!=null){
             int i=0;
             if (n==0){
                 i++;
             }
             int j=0;
             while(i<M){
                 temp=temp.next;
                 if(temp==null){
                     return head;
                 }
                 i++;
                 n++;
             }
             LinkedListNode<Integer>temp1=temp;
             while (j<N){
               temp1=temp1.next;
               if (temp1==null){
                   temp.next=null;
                   return head;
               }
               j++;
             }
             temp.next=temp1.next;
         }
         return head;
    }
}
