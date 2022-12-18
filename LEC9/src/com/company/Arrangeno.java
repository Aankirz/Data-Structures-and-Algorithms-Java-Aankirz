package com.company;

public class Arrangeno {
//    public static void arrange(int[] arr, int n){
//        n=arr.length;
//        if (n==0){
//            return;
//        }else{
//            int j=1;
//            int n1=(n/2)+1;
//            int n2=1;
//            if (n%2==0){
//                n2=n1-2;
//            }else{
//                n2=n1-1;
//            }
//            for(int i=0;i<n1;i++){
//                if(j<n){
//                    arr[i]=j;
//                }else{
//                    arr[i]=n;
//                }
//                j=j+2;
//            }
//            int k=n/2;
//            for (int i=n1;i<n2+n1;i++){
//                arr[i]=2*k;
//                k--;
//            }
//        }
//
//
//    }
public static void main(String[] args) {
    int n=17;
    int arr[]=new int[n];
    int j=1;
        int n1=(n/2)+1;
        int n2=1;
        if (n%2==0){
             n2=n1-2;
        }else{
             n2=n1-1;
        }
        for(int i=0;i<n1;i++){
            if(j<n){
                arr[i]=j;
            }else{
                arr[i]=n;
            }
           j=j+2;
        }
    int k=1;
    if (n%2==0){
        k=n/2-1;
    }else{
        k=n/2;
    }
        for (int i=n1;i<n2+n1;i++){
            arr[i]=2*k;
            k--;
        }
    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void arrange(int[] arr, int n) {
   //it's just like placing odd and evens
        int j=0,k=n-1;
    for (int i=1;i<=n;i++){
        if(i%2!=0){
            arr[j]=i;
            j++;
            continue;
        }
        arr[k]=i;
        k--;
    }
    }
}
