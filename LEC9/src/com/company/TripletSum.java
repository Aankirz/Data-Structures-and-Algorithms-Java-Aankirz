package com.company;

import java.util.*;

public class TripletSum {
    public static int findTriplet(int[] arr, int x){

        int n=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                for (int k=0;k<arr.length;k++){
                    if(i!=j&&i!=k&&j!=k){
                        if(arr[i]+arr[j]+arr[k]==x){
                            n++;
                        }

                    }
                }

            }
        }
        return n;
    }

}
