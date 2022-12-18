package Array;
import java.util.*;
public class Pascal {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
    ArrayList<ArrayList<Long>>pascal=new ArrayList<>();
    ArrayList<Long>temp=new ArrayList<>();

    long num=1;
    temp.add(num);
    pascal.add(0,temp);
    if(n==1){
        return pascal;
    }
        ArrayList<Long>temp1=new ArrayList<>();
        temp1.add(num);
        temp1.add(num);
        pascal.add(1,temp1);
        if(n==2){
            return pascal;
        }
        for(int i=2;i<n;i++){ //if i=2 size of that array list =3, no need to worry for start and end;
        ArrayList<Long>tempo=new ArrayList<>();
        tempo.add(0,num);
        tempo.add(i,num);
        for(int j=1;j<i;j++){
           ArrayList<Long>val=pascal.get(i-1);
           long ans=val.get(j-1)+val.get(j);
            tempo.add(j,ans);
        }
        pascal.add(i,tempo);
        }
return pascal;
    }
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    { int n=permutation.size();
         int temp=permutation.get(n-1);
         permutation.set(n-1,permutation.get(n-2));
         permutation.set(n-2,temp);
         return permutation;
    }
}
