public class Selectionsort {
    public static void selctionsort(int arr[]){// 0 to length -2
      for (int i=0;i<arr.length-1;i++){
          int min=arr[i];
          int minindex=i;
          for (int j=i+1;j<arr.length;j++){//choosing minimum.
              if(min>arr[j]){     //because input [i] is changing so min.
                  min=arr[j];     // understand it.
                  minindex=j;
              }
          }
          if(minindex!=i){// sending the mi value to the ith place.
              arr[minindex]=arr[i];
              arr[i]=min;
          }
      }


    }

    public static void main(String[] args) {
        int arr[]={45,76,26,38,183,181,120};
        selctionsort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
