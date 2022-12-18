package Array;
import java.util.*;
public class TwosumE {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer,Integer>tsum=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            tsum.put(nums[i],i);
//        }

        //so kind of half bridge.
        //Approach not to store in hashmap once and then try do it dir, because(no. once checked, won't be checked again.)
        for(int i=0;i<nums.length;i++){

            if(tsum.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=tsum.get(target-nums[i]);
                return result;
            }
            tsum.put(nums[i],i);
        }
        return null;
//        for(int i=0;i<nums.length;i++){
//            int k=target-nums[i];
//
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]==k){
//                    int arr[]={i,j};
//                    return arr;
//                }
//
//            }
//
//
//        }
//        return null;
    }
}
