package com.company;

public class FindDuplicate {
    //Best Approach Condn given
    //Xor is Associative and commutative.
    public static int duplicateNumber(int arr[]) {
       int ans=0;
       int n=arr.length;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
            for(int j=0;j<=n;j++){
                ans=ans^j;
            }
        }
        return ans;
    }


    public static int duplicateNumber1(int arr[]) {
        int duplicate=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate=arr[i];
                    return duplicate;
                }
            }
        }
        return duplicate;
    }
}
