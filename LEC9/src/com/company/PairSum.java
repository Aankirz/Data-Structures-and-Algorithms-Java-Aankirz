package com.company;

import java.util.*;

public class PairSum {
    public static int pairSum(int arr[], int x){
        HashMap<Integer,Integer>pairs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(pairs.containsKey(arr[i])){
                pairs.put(arr[i],pairs.get(arr[i])+1);
                continue;
            }
            pairs.put(arr[i],1);
        }
        int pair=0;
        for(int i=0;i<arr.length;i++){
            if(pairs.containsKey(x-arr[i])){
                pair=pair+pairs.get(x-arr[i]);

            }
        }
        return pair/2;
//        int k=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                if (i!=j){
//                    if(arr[i]+arr[j]==x){
//                        k++;
//                    }
//                }
//
//            }
//        }
//        return k/2;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int size=s.nextInt();
          int arr[]=new int[size];
          for (int i=0;i<size;i++){
              arr[i]=s.nextInt();
          }
          int x=s.nextInt();
        int k=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i!=j){
                    if(arr[i]+arr[j]==x){
                        k++;
                    }
                }

            }
        }
        System.out.println(k/2);
    }
}
