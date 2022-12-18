package com.company;

public class SORT01 {
    public static void sortZeroesAndOne(int[] arr){
        //Pointers Approach : Bringing 0's to first position  TC:O(n)
        int zeropos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=arr[zeropos];
                arr[zeropos]=0;
                zeropos+=1;//so pos of 0 moved.
            }
        }
        
//        //Swap 01  O(n^2)
//        for(int i=0;i<arr.length;i++){
//           if(arr[i]==1){
//               for(int j=i;j<arr.length;j++){
//                   if(arr[j]==0){
//                       int temp=arr[i];
//                       arr[i]=arr[j];
//                       arr[j]=temp;
//                       break;
//                   }
//               }
//           }
//
//        }

        //Count 01  TC: O(n)
//        int j=0;
//
//        int k=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==0){
//               j++;
//               continue;
//            }
//            if (arr[i]==1){
//                k++;
//            }
//
//        }
//
//        for (int i=0;i<j;i++){
//            arr[i]=0;
//        }
//        for (int i=j;i<k+j;i++){
//            arr[i]=1;
//        }
    }
}
