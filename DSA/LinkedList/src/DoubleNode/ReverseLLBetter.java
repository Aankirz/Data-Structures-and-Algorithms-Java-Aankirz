package DoubleNode;

import java.util.LinkedList;

public class ReverseLLBetter {
    public DoubleNode Reversell(Node<Integer>head){
        if (head.next==null||head==null){
            DoubleNode ans=new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode smallans=Reversell(head.next);
        smallans.tail.next=head;
        head.next=null;

        DoubleNode ans=new DoubleNode();
        ans.head= smallans.head;
        ans.tail=head;

        return ans;
    }

}
