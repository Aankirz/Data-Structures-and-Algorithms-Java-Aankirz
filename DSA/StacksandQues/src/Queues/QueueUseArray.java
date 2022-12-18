package Queues;

public class QueueUseArray {
    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(3);//use of custom constructor
                  //To add Elements first.
        for (int i=1;i<=5;i++){
           try {
               queue.enqueue(i);     //so if the object of your class contains an exception
               //                    Either you could use psvm throws ___ or try and catch.
           }catch (QueueoverflowException e){

           }
        }
         //To remove elements and prit them as well.
        while(!queue.isEmpty()){
            try{
                System.out.println(queue.dequeue());
            }catch (QueueEmptyException e){

            }
        }


    }
}
