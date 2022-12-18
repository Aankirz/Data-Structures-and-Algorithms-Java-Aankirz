public class MidPoint {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> midPoint1(LinkedListNode<Integer> head) {
        //Approach-1(General)
        int count=0;
        LinkedListNode<Integer>temp=head;
        while (head!=null){
            head=head.next;
            count++;
        }
        int n=0;
        if(count%2==0){
            n=count/2;
        }else{
            n=(count/2) +1;
        }
        for (int i=1;i<n;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static LinkedListNode<Integer> midPoint2(LinkedListNode<Integer> head) {
        //Approach-2(Pointers)(Better)
        if(head==null){
            return null;
        }
        LinkedListNode<Integer>slow=head,fast=head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
//     if (head!=null){
//         LinkedListNode<Integer>slow=head;
//         LinkedListNode<Integer>fast=head;
//         while(fast.next!=null){
//             fast=fast.next.next;
//             if (fast==null){
//                 return new LinkedListNode<>(slow.data);
//             }
//             slow=slow.next;
//
//         }
//         return new LinkedListNode<>(slow.data);
//     }
//      return null;
}
