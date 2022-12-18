public class EvenafterOddLL {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        if (head!=null){
            LinkedListNode<Integer>temp=head;
            if (head==null||head.next==null){
                return head;
            }
            LinkedListNode<Integer>oddH=null,oddT=null,evenH=null,evenT=null;

            while(temp!=null){
                if (temp.data%2!=0){
                    //Odd
                    if (oddH==null){
                        oddH=temp;
                        oddT=temp;
                    }else{
                        oddT.next=temp;
                        oddT=temp;
                    }
                }else{
                    //Even
                    if (evenH==null){
                        evenH=temp;
                        evenT=temp;
                    }else {
                        evenT.next=temp;
                        evenT=temp;
                    }
                }
                temp=temp.next;
            }
            if (oddH==null){
                evenT=null;
                return evenH;
            }
            oddT.next=evenH;
            evenT=null;
            return oddH;
        }
        return null;
    }
}
