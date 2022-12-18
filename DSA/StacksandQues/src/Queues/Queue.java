package Queues;

public class Queue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    private Node front;
    private Node rear;
    private int size;

    public Queue(){   //not needed.
        front=null;  //since non primitive already default set.
        rear=null;
        size=0;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
       return size==0;
    }
    public void enqueue(int data) {
       Node NewNode=new Node(data);
       if (size==0){
           front=NewNode;
           rear=NewNode;
       }else{
           rear.next=NewNode;
           rear=NewNode;
       }
     size++;
    }
    public int dequeue() {
        if (size!=0){
            int temp= front.data;
            front=front.next;
            size--;
            return temp;
        }else{
            return -1;
        }

    }
    public int front() {
        if (size!=0){
            return front.data;
        }else{
            return -1;
        }

    }

}
