import java.util.LinkedList;

public class Dequeue {
   private int size;

   private LinkedList<Integer>front;
    public Dequeue(int size){
        this.size=size;

        front=new LinkedList<>();
    }

    public void insertFront(int element){
        if (front.size()==size){
            System.out.println(-1);
            return;
        }

        front.addFirst(element);



    }
    public void insertRear(int element){
        if (front.size()==size){
            System.out.println(-1);
            return;
        }

       front.addLast(element);



    }
    public void deleteFront(){
        if (front.isEmpty()){
            System.out.println(-1);
            return;
        }
        front.pollFirst();

    }
    public void deleteRear(){
        if (front.isEmpty()){
            System.out.println(-1);
            return;
        }
        front.pollLast();

    }

    public int getFront(){
        if (front.isEmpty()){
            return -1;
        }
       return front.getFirst();
    }
    public int getRear() {
        if (front.isEmpty()) {
            return -1;
        }
        return front.getLast();
    }

}
