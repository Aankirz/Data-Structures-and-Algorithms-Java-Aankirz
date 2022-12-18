import java.util.Scanner;

public class ReverseIterative {
    public static Node<Integer> reverseiterative(Node<Integer> head){
        Node<Integer>prev=null;
        Node<Integer>curr=head;
        Node<Integer>temp;

        while (curr!=null){
            temp=curr.next; ///storing the next element.
            curr.next=prev; // updating the reference of current element to it's previous ,making the link.
            prev=curr;   //
            curr=temp;

        }
        return  prev;
    }
    public static Node<Integer> takeinput(){
        //Initialising head
        Node<Integer>head=null,tail=null;  //No data null reference.
        //Taking Input
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while(data!=-1){
            Node<Integer>NewNode=new Node<>(data);//Making a node form the given data: @150[1,null] (as in the custom constructor)
            if (head==null) {//needed to make a new head (only once)                     ^  address of the node.
                head = NewNode;
                tail=NewNode;
            } else {                      //For 2nd Cycle (data-2),NewNode-@250[2,null]
//                  Node<Integer>temp=head;  // temp=head-> [1,null]  (this will be the new updated head always only once)
//                  while(temp.next!=null){  //temp.next =null(visible)
//                      temp=temp.next;
//                  }//Now In the pre if condition head =NewNode(so complete updation)
//                  temp.next=NewNode;  //But here only temp address got updated
//              }  //temp->[1,@250]

                tail.next=NewNode;   //so tail is copying the address of NewNode.
                tail=NewNode;//or tail=tail.next.  //Because tail updated it's address.
            }
            data=s.nextInt();
        }
        return head;  //so a linked list gets created.
        //[1,@250]-->[2,@350]-->[3,null];
    }
    public static void print(Node<Integer> head){
        Node<Integer>temp=head;    //Basically storing first ref. so to use it again if needed.

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
       Node<Integer>head= takeinput();
        head=reverseiterative(head);  //imp. making the last as head.
        print(head) ;
    }
}
