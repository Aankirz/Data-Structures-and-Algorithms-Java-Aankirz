public class QuickSort {
    public static void quickSort(int[] input,int si,int ei){
        if (si>=ei){
            return;
        }
        int pivotpos=partition(input,si,ei) ;//it is   a function which just sets the first element as pivot element and when every element gets into pivot complete array gets sorted.
    quickSort(input, si, pivotpos-1);
    quickSort(input, pivotpos+1, ei);
    }
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];    //if higher element is considered to be pivot then all elemnets have to be smaller.
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;


    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
