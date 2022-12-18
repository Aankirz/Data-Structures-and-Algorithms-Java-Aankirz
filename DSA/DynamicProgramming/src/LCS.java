public class LCS {
    //Recursion
    public static int LCS(String s1,String s2){
        if (s1.length()==0||s2.length()==0){
            return 0;//BaseCase
        }

        if (s1.charAt(0)==s2.charAt(0)){
            return 1+LCS(s1.substring(1),s2.substring(1));
        }else{
            int opt1=LCS(s1.substring(1),s2.substring(1));
            int opt2=LCS(s1,s2.substring(1));
            int opt3=LCS(s1.substring(1),s2);
            return Math.max(opt1,Math.max(opt2,opt3));
        }
    }
    //Memoization
    public static int LCSM(String s1,String s2){
        // GO WITH ASCII VALUE NOT STRING ARRAY
        int storage[][]=new int[s1.length()+1][s2.length()+1];
        //initialize
        for (int i=0;i< storage.length;i++){
            for (int j=0;j<storage[0].length;j++){
                storage[i][j]=-1;
            }
        }
        return LCSM(s1,s2,storage);
    }

    private static int LCSM(String s1, String s2, int[][] storage) {
        //UNIQUE LOCATING THROUGH LENGTH OF TWO STRINGS.
        int m=s1.length();
        int n=s2.length();
                 // CHECKING REDUNDANCY
        if (storage[m][n]!=-1){
            return storage[m][n];
        }
        // BASE CASE
        if (m==0||n==0){
            storage[m][n]=0;
            return storage[m][n];
        }
           //RECURSIVE CONDITION
        if (s1.charAt(0)==s2.charAt(0)){
            storage[m][n]=1+LCSM(s1.substring(1),s2.substring(1),storage);
            return storage[m][n];
        }else {
            int opt1=LCS(s1.substring(1),s2.substring(1));
            int opt2=LCS(s1,s2.substring(1));
            int opt3=LCS(s1.substring(1),s2);
            storage[m][n]=Math.max(opt1,Math.max(opt2,opt3));
            return storage[m][n];
        }
    }
    //DYNAMIC PROGRAMMING (BOTTOM TO UP)


    public static void main(String[] args) {
        System.out.println(LCS("adgei","abegi"));
        System.out.println(LCSM("adgei","abegi"));

    }
}
