package Array;
import java.util.*;
public class Stocks {
    public int maxProfit(int[] prices) {
//Creating a profit array
       ArrayList<Integer>profit=new ArrayList<>();
       int index=0;
       for(int i=0;i< prices.length;i++){
           int min=prices[i];
           for(int j=i+1;j< prices.length;j++){
               if(min<prices[j]){
                   profit.add(prices[j]-min);
                   index=j;
               }else{
                   break;
               }
           }
           i=index;
       }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<profit.size();i++){
            if(max<profit.get(i)){
                max=profit.get(i);
            }
        }
       return max;
    }
}
