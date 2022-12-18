public class Countzeroes {
    public static int countZerosRec(int input) {
    if (input==0){
        return 1;      //BASE CASE.
    }
    if (input<10){   //ACTUAL BASE CASE.
        return 0;
    }
    int n=input%10;  //SMALLEST CALCULATION(ek kaam mein karunga baaki recursion karega)
    if (n==0){
        return 1+countZerosRec(input/10);
    }
    return countZerosRec(input/10);
    }

    public static void main(String[] args) {
     int n=0 ;                 //SO YOU NEED TO THINK WISELY ;
        System.out.println(countZerosRec(n));
    }
}
