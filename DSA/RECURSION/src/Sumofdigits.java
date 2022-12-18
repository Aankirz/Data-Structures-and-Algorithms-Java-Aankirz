public class Sumofdigits {
    public static int sumOfDigits(int input){
        if(input==0){    //BASE CASE:since processed to input/10 -> 0 then end the code.
            return 0;
        }
        int n=input%10;   //small problem calculation
        int sum=sumOfDigits(input/10);   //processing.
        return n+sum;
    }
                    //    "PMI AS A PARMARTH"
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123456789));
    }
}
