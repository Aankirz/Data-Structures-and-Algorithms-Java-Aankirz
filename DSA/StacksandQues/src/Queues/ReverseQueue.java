package Queues;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        int arr[]=new int[input.size()];
        for (int i=arr.length-1;i>=0;i--){
            arr[i]=input.peek();
            input.poll();
        }
        for (int i=0;i<arr.length;i++){
            input.add(arr[i]);
        }
    }
}
