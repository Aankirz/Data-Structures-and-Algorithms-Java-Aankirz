package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MedianofTwosorted_H {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            result.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            result.add(nums2[i]);
        }
        Collections.sort(result);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

        int num=result.size();
        if(num%2==0){
            int i=num/2;
            double median= (result.get(i)+ result.get(i+1))/2;
            return median;
        }
        double median=result.get(num/2);
        return median;
    }
}
