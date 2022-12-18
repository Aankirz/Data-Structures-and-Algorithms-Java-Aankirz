import java.util.ArrayList;

public class Priority_Queue {
    private ArrayList<Integer> heap;

    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {

        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (isEmpty())
            throw new PriorityQueueException();

        return heap.get(0);
    }

//    void insertmin(int element) {
//        heap.add(element);
//        //since min PQ so taking care of HPO using up heapify.
//        int childIndex = heap.size() - 1;
//        int parentIndex = (childIndex - 1) / 2;
//        while (childIndex > 0) {
//            if (heap.get(parentIndex) > heap.get(childIndex)) {
//                //swap;
//                int temp = heap.get(childIndex);
//                heap.set(childIndex, heap.get(parentIndex));
//                heap.set(parentIndex, temp);
//                childIndex = parentIndex;
//                parentIndex = (childIndex - 1) / 2;
//            } else {
//                return;
//            }
//        }
//    }

//   int removeMin() throws PriorityQueueException {
//       if(isEmpty()){
//           // Throw an exception
//           throw new PriorityQueueException();
//       }
//       int temp = heap.get(0);
//       heap.set(0, heap.get(heap.size() - 1));
//       heap.remove(heap.size() - 1);
//       int index = 0;
//       int minIndex = index;
//       int leftChildIndex = 1;
//       int rightChildIndex = 2;
//
//       while(leftChildIndex < heap.size()){
//
//           if(heap.get(leftChildIndex) < heap.get(minIndex)){
//               minIndex = leftChildIndex;   NOT UNDERSTOOD
//           }
//           if(rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
//               minIndex = rightChildIndex;
//           }
//           if(minIndex == index){
//               break;
//           }else{
//               int temp1 = heap.get(index);
//               heap.set(index, heap.get(minIndex));
//               heap.set(minIndex, temp1);
//               index = minIndex;
//               leftChildIndex = 2 * index + 1;
//               rightChildIndex = 2 * index + 2;
//           }
//       }
//       return temp;
//   }

   int getMax(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
   }
    void insert(int element) {
        heap.add(element);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;

        //heapify
        while(childIndex>0){
            if(heap.get(parentIndex)<heap.get(childIndex)){
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }

    }
    int removeMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 0;
        int maxindex = index;
        int cl = 1;
        int cr = 2;
        while (cl < heap.size()) {
            if (heap.get(cl) > heap.get(maxindex)) {
                maxindex = cl;
            }
            if (cr < heap.size() && heap.get(cr) > heap.get(maxindex)) {
                maxindex = cr;
            }
            if (maxindex == index) {
                break;
            } else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(maxindex));
                heap.set(maxindex, temp1);
                index = maxindex;
                cl = 2 * index + 1;
                cr = 2 * index + 2;

            }

        }
        return max;
    }
    }
