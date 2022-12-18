public class PrintSubsetssumK {
    public static void printSubsetsSumTok(int input[], int k,int si,int result[]){
        if (si== input.length){
            if (k==0){
                for (int i=0;i< result.length;i++){
                    System.out.print(result[i]+" ");
                }
                System.out.println();
                return;
            } else{
                return;
            }
        }
        printSubsetsSumTok(input,k,si+1,result);
        int newresult[]=new int[result.length+1];
        int i=0;
        for (;i< result.length;i++){
            newresult[i]= result[i];
        }
        newresult[i]=result[si];
        printSubsetsSumTok(input,k-input[si],si+1,newresult);


    }
    public static void printSubsetsSumTok(int input[], int k){
        int result[]=new int[0];
        printSubsetsSumTok(input,k,0,result);
    }
}
