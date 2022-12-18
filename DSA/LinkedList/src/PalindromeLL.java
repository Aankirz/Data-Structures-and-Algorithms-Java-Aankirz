public class PalindromeLL {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){

        if (head!=null){
            if (head.next==null||head==null){
                return head;
            }

            LinkedListNode<Integer>reversedtail=head.next; //storing the tail because it's usual that I have to just make it link with the current i/p
            // i.e head;
            LinkedListNode<Integer>smallhead=reverse_I(head.next);

            reversedtail.next=head;      //USING I/P & O/P WISELY.
            head.next=null;
            return smallhead;
        }
        return null;
    }
    private static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        LinkedListNode<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;}
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
            LinkedListNode<Integer>temp=head,mid,head2;
            mid=midPoint(temp);
            head2=mid.next;
            mid.next=null;
            head2 = reverse_I(head2);
            boolean flag=false;
            while(temp.next!=null&&head2.next!=null){
                flag=false;
                if (temp.data.equals(head2.data)){
                    flag=true;
                    temp=temp.next;
                    head2 = head2.next;
                }
            }
            return flag;
    }
}
