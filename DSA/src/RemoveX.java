public class RemoveX {
    public static String removeX(String input){
        if (input.length()<1){ //BASE CASE:
            return input;
        }
       if (input.charAt(0)=='x'){        //in smaller calc think about the starting elements.
           return removeX(input.substring(1)) ;
       }
       return input.charAt(0)+removeX(input.substring(1));
    }
}
    /*CODE LOGIC:
    SUBSTRINGS APPROACH-RETURN PART OF STRING
    IN SMALL CALCULATION: THINK THAT HOW YOU WILL DO IT FOR SMALLERC CASES OR  SMALL TO BIG APPROACH.
    DRY RUN:         FROM LAST TO FIRST .
     */