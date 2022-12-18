
import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
//        Stack<Integer> Stock=new Stack<>();
//        int max=0;
//        int arr[]=new int[price.length];
//        for (int i=0;i<price.length;i++){
//            if (i==0){
//                max=price[i];
//                Stock.push(i);
//                arr[i]=1;
//                continue;
//            }
//            if (max<price[i]){
//                Stock.pop();
//                Stock.push(i);
//
//                max=price[i];
//               arr[i]=i+1;
//            }else {
//               int n=1;
//               for (int j=Stock.peek();j<i;j++){
//                   System.out.println(Stock.peek());
//                   if (price[j]<price[i]){
//                       n++;
//                   }
//               }
//               arr[i]=n;
//            }
//        }
//        return arr;
        Stack<Integer>maxprice=new Stack<>();
        Stack<Integer>maxspan=new Stack<>();
        int span[]=new int[price.length];
        span[0]=1;
//        if span value 1 then needs to be added since it's his identity
        maxprice.add(price[0]);
        maxspan.add(1);
        for (int i=1;i<price.length;i++){
            if (price[i]<price[i-1]){
//                Normal case
                span[i]=1;
                maxprice.add(price[i]);
                maxspan.add(span[i]);
            }else{
//                Edge Cases
                for(int j=0;j<maxprice.size();j++){
                    if(price[i]>maxprice.peek()){
                      int n=  maxprice.pop();
                        span[i]+=maxspan.pop();
                        System.out.println(n);
                    }else{
                        break;
                    }

                }
                maxprice.add(price[i]);
                span[i]+=1;
                maxspan.add(span[i]);
            }
        }
        return span;
    }
}
