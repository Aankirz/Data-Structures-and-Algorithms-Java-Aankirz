package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {
    public static void intersections(int arr1[], int arr2[]) {
        HashMap<Integer,Integer>intersection=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            if(intersection.containsKey(arr2[i])){
                intersection.put(arr2[i], intersection.get(arr2[i])+1);
                continue;
            }
            intersection.put(arr2[i],1);
        }
        for(int i=0;i<arr1.length;i++){
            if(intersection.containsKey(arr1[i])&&intersection.get(arr1[i])!=0){
                System.out.print(arr1[i]+" ");
                intersection.put(arr1[i],intersection.get(arr1[i])-1);
            }
        }

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    System.out.println(arr1[i] + " ");
//                    arr2[j] = -2145678;
//                    break;
//                }
//            }
//        }
    }

}