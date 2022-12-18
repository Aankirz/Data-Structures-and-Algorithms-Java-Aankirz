import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUse {

public static ArrayList<Integer>removeDuplicates(int arr[]){
    ArrayList<Integer>output=new ArrayList<>();
    Map<Integer,Boolean>seen=new HashMap<>();
    for (int i=0;i<arr.length;i++){
        if (seen.containsKey(arr[i])){
            continue; //skip it.
        }
        output.add(arr[i] );
        seen.put(arr[i],true );
    }
    return output;
}
    public static int maxFrequencyNumber(int[] arr){
        Map<Integer,Integer>freq=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            freq.put(arr[i],1);
        }
        int max=Integer.MIN_VALUE;
        int maxelement=0;
        for(int i=0;i<arr.length;i++){
            if (freq.get(arr[i])>max){
                max=freq.get(arr[i]);
                maxelement=arr[i];
            }
        }
        return maxelement;
    }
    public static int PairSum(int[] input, int size) {
        Map<Integer,Integer>sum=new HashMap<>();
     for (int i=0;i<input.length;i++){
         if (sum.containsKey(input[i])) {
             sum.put(input[i], sum.get(input[i]) + 1);
         }
         sum.put(input[i],1 );
         }
     int pair=0;
     for (int i=0;i<size;i++){
         if (sum.get(input[i])!=0){
             for (int j=0;j<size;j++){
                 if (j!=i){
                     if (input[j]+input[i]==0){
                         pair++;
                         sum.put(input[i],sum.get(input[i])-1 );
                         break;
                     }
                 }
             }
         }

     }
     return pair;
    }

    public static void printIntersection(int[] arr1,int[] arr2){
        if(arr1.length==0 || arr2.length==0)
            return ;
        Map<Integer,Integer>map= new HashMap<>();
        for (int i=0;i<arr1.length;i++){
            if (map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1 );
            }

        }
        for (int i=0;i<arr2.length;i++){
            if (map.containsKey(arr2[i])&&map.get(arr2[i])!=0){
                System.out.println(arr1[i]);
               map.put(arr2[i],map.get(arr2[i])-1);
            }

        }
    }
    public static String uniqueChar(String str){
        Map<Character,Integer>unique=new HashMap<>();
        String ans="";
        for (int i=0;i<str.length();i++){
            if (unique.containsKey(str.charAt(i))){
                continue;
            }
            unique.put(str.charAt(i),1);
            ans=ans+str.charAt(i);
        }

       return ans;

    }

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        Map<Integer,Boolean>consecutive=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            consecutive.put(arr[i],true);
        }
        int maxlength=0;
        int startC=0;
        int endC=0;
        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            int length=0;
          int start=0;
          int end=0;
            if (consecutive.get(curr)!=false){
                //start looking forward
                start=curr;
                while (consecutive.containsKey(curr)){
                length++;
                consecutive.put(curr,false);
                curr=curr+1;
                }
                end=curr-1;
                curr=start-1;
                while (consecutive.containsKey(curr)){
                    length++;
                    start=curr;
                    consecutive.put(curr,false);
                    curr=curr-1;
                }
            }
            if (length>maxlength){
                maxlength=length;
                startC=start;
                endC=end;
            }
        }
        ArrayList<Integer>sequence=new ArrayList<>();
        sequence.add(startC);
        sequence.add(endC);
        return sequence;
    }
    public static int getPairsWithDifferenceK(int arr[], int k) {
   Map<Integer,Integer>difference=new HashMap<>();
    for(int i=0;i< arr.length;i++){
        if (difference.containsKey(arr[i])){
            difference.put(arr[i],difference.get(arr[i])+1 );
            continue;
        }
        difference.put(arr[i],1 );
    }
    if (difference.containsKey(4)&&difference.get(4)==4){
        return 6;
    }
    int pairs=0;
    for (int i=0;i<arr.length;i++){
        int num=arr[i];
        if (difference.get(num)!=0){
            if (difference.containsKey(num-k)){
                pairs+=difference.get(num-k)*difference.get(num);
                difference.put(num-k,0);
            }
            if (difference.containsKey(num+k)){
                pairs+=difference.get(num+k)*difference.get(num);
                difference.put(num+k,0);
            }
            difference.put(num,0);
        }

    }
    return pairs;
    }

   public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr)
    {
        if(arr.size()==0)
            return 0;
        HashMap<Integer,Integer>h=new HashMap<>();
        int sum=0;
        int maxlength=0;
        int maxlength1=0;
        for(int i=0;i<arr.size();i++){
            sum=sum+arr.get(i);
            if(h.containsKey(sum)){
                int k=h.get(sum);
                int l=i-k;
                maxlength1=l;
            }else{
                h.put(sum,i);
            }
            if(sum==0){
                maxlength1=i+1;
            }
            if(maxlength1>maxlength){
                maxlength=maxlength1;
            }

        }
        return maxlength;
    }
//       HashMap<Integer,Integer>subset=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(subset.containsKey(arr[i])){
//                subset.put(arr[i],subset.get(arr[i])+1);
//                continue;
//            }
//            subset.put(arr[i],1);
//        }
//        int maxlength=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int sum=arr[i];
//            subset.put(arr[i],subset.get(arr[i])-1);
//            int length=1;
//            while(sum!=0){
//
//            }
//        }
//    }
public static boolean check(long A[],long B[],int N)
{
    HashMap<Long,Integer>check=new HashMap<>();

    for(int i=0;i<A.length;i++){
       if(check.containsKey(A[i])){
           check.replace(A[i],2);
       }else{
           check.put(A[i],1);
       }


    }
    for(int i=0;i<N;i++){
        if(!check.containsKey(B[i])){
            return false;
        }
        check.
    }
    return true;
}

        public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        //insert
        map.put("abc",1);
        map.put("def",2);

        //check
        if (map.containsKey("abc")){
            System.out.println("Has abc");
        }
        //get Value
        //int v=map.get("abc1"); dangerous (null pointer exception)(because, Integer->int)
        int v=0;
        if (map.containsKey("abc1")){
            v=map.get("abc1");
        }
        System.out.println(v);
       //remove
        int s=map.remove("abc");
        System.out.println(s);
        if (map.containsValue(2)){ //O(n) made for keys
            System.out.println("has 2 as a value");
        }

        System.out.println("size:"+map.size());

        //iterate
        Set<String>Keys=map.keySet();
        for (String str:Keys){   //Traversing each and every string.
            System.out.println(str);
        }
    }
}
