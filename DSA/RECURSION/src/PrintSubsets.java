public class PrintSubsets {
    public static void printSubsets(int input[],int output[],int si){
     if (si== input.length){
         for (int i=0;i< output.length;i++){
             System.out.print(output[i]+" ");
         }
         System.out.println();
         return;
     }
     // not including the element.
     printSubsets(input,output,si+1);
     //including the element.
     int newoutput[]=new int[output.length+1];
     int k=0;
     for (int i=0;i< output.length;i++){
         newoutput[i]=output[i];
         k++;
     }
     newoutput[k]=input[si];
     printSubsets(input,newoutput,si+1);
    }
    public static void printSubsets(int input[]){
        printSubsets(input,new int[0],0);
    }
}
