public class MaximumProfit {
    public static int maximumProfit(int budget[]) {
        mergeSort(budget);
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<budget.length;i++){
            ans=Math.max(ans,budget[i]*(budget.length-i));
        }
        return ans;
    }

    public static void mergeSort(int[] input){
        if (input.length<=1){
            return;
        }
        int mid=input.length/2;
        int part1[]=new int[mid];
        int part2[]=new int[input.length-mid];
        int k=0;
        for (int i=0;i< part1.length;i++){
            part1[i]=input[k];
            k++;
        }
        for (int i=0;i< part2.length;i++){
            part2[i]=input[k];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(input,part1,part2);
    }
    public static void merge(int[] input,int part1[],int part2[]){
        int i=0;int j=0;int k=0;
        while(i< part1.length&&j< part2.length){
            if (part1[i]<part2[j]){
                input[k]=part1[i];
                k++;i++;
            }else{
                input[k]=part2[j];
                k++;j++;
            }
        }
        while(i< part1.length){
            input[k]=part1[i];
            k++;i++;
        }
        while(j< part2.length){
            input[k]=part2[j];
            k++;j++;
        }

    }










//    public static int maximumProfit(int budget[]) {
//        mergeSort(budget);
//        int maxprofit=0;
//                int max=0;
//        for (int i=0;i<budget.length;i++){
//            int n=0;
//            if (budget[i]==max){
//                continue;
//            }
//           for (int j=0;j<budget.length;j++){
//               if (budget[i]<=budget[j]){
//                   n++;
//               }
//           }
//           int maxpro=budget[i]*n;
//           if (maxpro>maxprofit){
//               maxprofit=maxpro;
//               max=budget[i];
//           }
//        }
//        return maxprofit;
//    }
//    public static void mergeSort(int[] input){
//        if (input.length<=1){
//            return;
//        }
//        int mid=input.length/2;
//        int part1[]=new int[mid];
//        int part2[]=new int[input.length-mid];
//        int k=0;
//        for (int i=0;i< part1.length;i++){
//            part1[i]=input[k];
//            k++;
//        }
//        for (int i=0;i< part2.length;i++){
//            part2[i]=input[k];
//            k++;
//        }
//        mergeSort(part1);
//        mergeSort(part2);
//        merge(input,part1,part2);
//    }
//    public static void merge(int[] input,int part1[],int part2[]){
//        int i=0;int j=0;int k=0;
//        while(i< part1.length&&j< part2.length){
//            if (part1[i]<part2[j]){
//                input[k]=part1[i];
//                k++;i++;
//            }else{
//                input[k]=part2[j];
//                k++;j++;
//            }
//        }
//        while(i< part1.length){
//            input[k]=part1[i];
//            k++;i++;
//        }
//        while(j< part2.length){
//            input[k]=part2[j];
//            k++;j++;
//        }
//
//    }

//
//    public static int maximumProfit(int budget[],int maxprofit,int si,int maxind) {
//   if (si>=budget.length){
//       return maxprofit;
//   }
//   if (maxind==budget[si]){
//       return maximumProfit(budget,maxprofit,si+1,maxind);
//   }
//   int n=0;
//   for(int i=0;i<budget.length;i++){
//       if (budget[si]<=budget[i]){
//          n++;
//       }
//   }
//   int maxpro=budget[si]*n;
//   if (maxpro>maxprofit){
//       maxprofit=maxpro;
//       maxind=budget[si];
//   }
//   return maximumProfit(budget,maxprofit,si+1,maxind);
//    }
//    public static int maximumProfit(int budget[]) {
//        return maximumProfit(budget,0,0,0);
//    }

}
