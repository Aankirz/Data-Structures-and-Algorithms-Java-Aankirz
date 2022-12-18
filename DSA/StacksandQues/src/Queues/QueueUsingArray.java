package Queues;

import java.util.Queue;
          // CIRCULAR QUEUE (only if space exists).All fn at O(1).
public class QueueUsingArray {
               //       data types along with values required for the class.
   private int[] data;
    private int  front;
    private int rear;
    private int size;
                          //Making of custom constructors.
    public QueueUsingArray(){
        data=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public QueueUsingArray(int capacity){
        data=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }
                // To know size.
    int size(){
        return size;
    }
          // To check empty.
    boolean isEmpty(){
        return size==0;
    }
                         //To know the element at top.
    int front() throws QueueEmptyException{
        if (size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
                         //To add element AND  Making of Double Capacity.
    void enqueue(int element) throws QueueoverflowException {
        if (size== data.length){
          //  throw new QueueoverflowException();
           DoubleCapacity();
        }
        if (size==0){
            front=0;
        }
        rear=(rear+1)% data.length;              //SO HERE RESETTING OF FRONT AND REAR MEANS CIRCULAR QUEUE
//        rear++;
//        if (rear== data.length){
//            rear = 0;   //resetting the rear element.
//        }
        data[rear]=element;
        size++;
    }
    private void DoubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        int index=0;
        for (int i=front;i<temp.length;i++){
            data[index]=temp[i];
            index++;
        }
        for(int i=0;i<=front-1;i++){
            data[index]=temp[i];
            index++;
        }
        front=0;
        rear=temp.length-1;

    }
    //     To remove Element
    int dequeue() throws QueueEmptyException {
       if (size==0){
           throw new QueueEmptyException();
       }
        int temp=data[front];
       front=(front+1)% data.length;
//        front++;
//        if (front== data.length){
//            front=0;
//        }
        size--;
        if (size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }


}
