package LinkedList;

import java.util.LinkedList;

class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class RemoveNthNode {
     // Approach 1
    public ListNode removeNthFromEnd1(ListNode head, int n) {
     int count=0;
     ListNode temp=head;
        while(head!=null){
         head=head.next;
         count++;
     }

        return DeleteNode(temp,count-n);
    }

    private ListNode DeleteNode(ListNode head, int pos) {
        if(pos==0){
            head=head.next;
            return head;
        }
        head.next=DeleteNode(head.next,pos-1);

        return head;
    }
    // Approach-2
/*Two Pointers Approach*/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head,fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
                    return head;
        }
         while(fast==null||fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return head;
    }
}
