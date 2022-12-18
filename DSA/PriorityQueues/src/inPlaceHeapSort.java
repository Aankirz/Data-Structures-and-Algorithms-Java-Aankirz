import java.util.*;

public class inPlaceHeapSort {
    static class MaxPQComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1<o2){
return 1;
            }else if(o1>o2){
              return -1;
            }
            return 0;
        }
    }
    static class Stringcomparator implements Comparator<String>{

        @Override      //min
        public int compare(String o1, String o2) {
            if (o1.length()<o2.length()){
                return -1;
            }else if(o1.length()>o2.length()){
                return 1;
            }
            return 0;
        }
    }
    public static void inplaceHeapSort(int arr[])  {
       for (int i=0;i<arr.length;i++){
           insertintoVirtualHeap(arr,i);
       }
            for (int i=0;i< arr.length;i++){
                arr[arr.length-i-1]=removeMin(arr, arr.length-i);
            }

    }
    public static boolean checkMaxHeap(int arr[]) {
        //Should have done considering each index as parent index;
        for (int i=0;i<arr.length;i++){
            int pi=i;
            int li=2*i+1;
            int ri=2*i+2;
            if (li< arr.length&&arr[li]>arr[pi]){
                return false;
            }
            if (ri< arr.length&&arr[ri]>arr[pi]){
                return false;
            }
        }
return true;
    }
    public static int kthLargest(int n, int[] input, int k) {
           inplaceHeapSort(input);
return input[k-1];
    }

public static void sortKsorted(int[] arr,int k){
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int i=0;
    //first adding K elements into pq
    for (;i<k;i++){
        pq.add(arr[i]);
    }
    //i=k;
    for (;i<arr.length;i++){
        //now the element to be removed from pq
        arr[i-k]=pq.remove();
        //for again the process to repeat, adding the next element to pq.
        pq.add(arr[i]);
    }
    //now only arr[] elements upto arr.length-k is filled to fill rest present already in heap;
    for(int j=arr.length-k;j<arr.length;j++){
        arr[j]=pq.remove();
    }


}
        //for min priority queue
    public static void insertintoVirtualHeap(int[]arr,int i){
        // so inplace method the element already added into array so just heapify
        int childIndex=i;      // last place
        int parentIndex=(childIndex-1)/2;

        while (childIndex>0){
            if (arr[parentIndex]>arr[childIndex]){
                int temp=arr[childIndex];
                arr[childIndex]=arr[parentIndex];
                arr[parentIndex]=temp;
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }else {
                return;
            }
        }
    }
    // for remove priority queue
    public static int removeMin(int[]arr,int heapsize){
                //same
        int min=arr[0];
        arr[0]=arr[heapsize-1];
       heapsize--;
        int pi=0;
        int minindex=pi;
        int cl=1;
        int cr=2;
        while(cl<heapsize){
            if (arr[cl]<arr[minindex]){
                minindex=cl;        //NOT UNDERSTOOD
            }
            if (cr<heapsize&&arr[cr]<arr[minindex]){
                minindex=cr;
            }
            if (minindex==pi){
                break;
            }else{
                int temp=arr[pi];
                arr[pi]=arr[minindex];
                arr[minindex]=temp;
                pi=minindex;
                cl=2*pi+1;
                cr=2*pi+2;
            }
        }
        return min;
    }

    public static ArrayList<Integer> kLargest(int input[], int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        ArrayList<Integer>result=new ArrayList<>();

        for (int i=0;i<input.length;i++){
            pq.add(input[i]);
        }
        for (int i=0;i< input.length-k;i++){
            input[i]=pq.remove();
        }
        for (int i=0;i<k;i++){
            result.add(pq.remove());
        }
return result;
    }

    public static void findMedian(int arr[])  {
        PriorityQueue<Integer>maxpq=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>minpq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
           // Element MaxHeap , Minheap
            if (maxpq.isEmpty()){
                maxpq.add(arr[0]);
                System.out.print(arr[0]+" ");
                continue;
            }
            if (arr[i]< maxpq.element()){
                maxpq.add(arr[i]);
                if (maxpq.size()-minpq.size()>1){
                    minpq.add(maxpq.remove());
                }
            }else if(arr[i]>minpq.element()){
                minpq.add(arr[i]);
                if (minpq.size()-maxpq.size()>1){
                    maxpq.add(minpq.remove());
                }
            }
         if (maxpq.size()>minpq.size()){
             System.out.print(maxpq.element()+" ");
         }else if (minpq.size()>maxpq.size()){
             System.out.print(minpq.element()+" ");
         }else {
             System.out.print((maxpq.element()+minpq.element())/2+" ");
         }
        }
    }
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input)  {
        ArrayList<Integer>arr=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<input.size();i++){
            ArrayList<Integer>temp=input.get(i);
 for(int j=0;j<temp.size();j++)
     pq.add(temp.get(i));
        }
        while(!pq.isEmpty()){
            arr.add(pq.remove());

        }
        return arr;
    }



        public static void main(String[] args) {
        int arr[]={2,1,4,9,6,8};
        int k=3;
        sortKsorted(arr,k);
        MaxPQComparator max=new MaxPQComparator();
        PriorityQueue<Integer>pq=new PriorityQueue<>(max);
                   //or
            PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
                     //Now Making priority queue for STRINGS
            String arr1[]={"this","at","a","their","queues"};
        Stringcomparator str=new Stringcomparator();
        PriorityQueue<String> pqs=new PriorityQueue<>(str);
        for (int i=0;i< arr1.length;i++){
            pqs.add(arr1[i]);
        }
       while (!pqs.isEmpty()){
           System.out.print(pqs.remove()+" ");
       }
    }
    }
