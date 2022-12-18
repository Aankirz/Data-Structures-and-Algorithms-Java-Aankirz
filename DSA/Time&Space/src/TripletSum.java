import java.util.Arrays;
public class TripletSum {
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n= arr.length;
        int numTriplets=0;

        for (int i=0;i<n;i++){
            int pairsumfor=num-arr[i];
            int numPairs=pairSum(arr,pairsumfor,i+1,n-1);
            numTriplets+=numPairs;
        }
        return numTriplets;
    }
   public static int pairSum(int[] arr,int num,int si,int ei){
        Arrays.sort(arr);
        int numPair=0;

        while(si<ei){
            if (arr[si]+arr[ei]<num){
                si++;
            }else if(arr[si]+arr[ei]>num){
                ei--;
            }else{
                int elmatstart=arr[si];
                int elmatend=arr[ei];

                if(elmatstart==elmatend){
                    int testarttoend=(ei-si)+1;
                    numPair+=(testarttoend*(testarttoend-1)/2);

                    return numPair;
                }
                int tempsi=si+1;
                int tempei=ei-1;

                while(tempsi<=tempei && arr[tempsi]==elmatstart){
                    tempsi+=1;
                }
                while(tempei>=tempsi && arr[tempei]==elmatend){
                    tempei-=1;
                }
                int totelmfrmsi=(tempsi-si);
                int totelmfrmei=(ei-tempei);
                numPair+=(totelmfrmsi*totelmfrmei);
                si=tempsi;
                ei=tempei;
            }

        }
return numPair;
   }

//    public static int pairSum(int[] arr,int num){
//        return pairSum(arr,num,0,arr.length-1);
//    }
}
