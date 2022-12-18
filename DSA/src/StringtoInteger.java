public class StringtoInteger {
    public static int convertStringToInt(String input){
        if (input.length()==0){
            return 0;
        }
        if (input.charAt(0)==0){    // NOW WE HAVE BROKEN 1|234 FIRST PART WE WILL HANDLE REST WILL BE HANDLED BY RECURSION.
            return 0+convertStringToInt(input.substring(1));
        }
        int n=(input.charAt(0)-48)*((int)Math.pow(10,input.length()-1));
      int smallans=n+convertStringToInt(input.substring(1));
return smallans;

    }

    public static void main(String[] args) {
        String str="0001023400";
        System.out.println(convertStringToInt(str));
    }
}
//THINK IN A SMALLER CASES BREAKING WAY  OR GO AHEAD APPROACH.
//DRY RUN: 0 IN THE MIDDLE AND THE LST WAS SAVED BECAUSE OF THE POWER ADD.