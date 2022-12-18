package Stack;


public class StackusingLL { //So you need to show generic form in the public class.
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   private Node head;             //Making of dataset first.
    private int size;       //so we need A head node and int as size.
                //Making custom constructors.
    public StackusingLL(){
        head=null;
        size=0;
    }
              //Size of stack.
    int getSize(){
        return size;
    }
    boolean isEmpty(){
        return size==0 ;
    }
    //                Add Element.
    public void push(int element){
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode ;
        }
        size++;
    }
    public int pop(){
        if (head==null){
            size=0;
            return -1;
        }else{
            size--;
            int temp= head.data;
            head=head.next;
            return temp;
        }

    }
    public int top(){
        if (head==null){
            return -1;
        }
        else{
            return head.data;
        }
    }


}
