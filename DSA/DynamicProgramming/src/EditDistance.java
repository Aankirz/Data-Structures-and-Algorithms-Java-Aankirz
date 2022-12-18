public class EditDistance {
    //Recursion
    public static int editDistance(String s1, String s2){
       if (s1.equals(s2)){ //BASE CASE
           return 0;
       }
       if (s1.length()==0){
           return s2.length();
       }
       if (s2.length()==0){
           return s1.length();
       }

          if (s1.charAt(0)==s2.charAt(0)){
              return editDistance(s1.substring(1),s2.substring(1));

          }else{
              int insert=1+editDistance(s1,s1.charAt(0)+s2);
              int delete=1+editDistance(s1,s2.substring(1));
              int substitute=1+editDistance(s1,s1.charAt(0)+s2.substring(1));
              return Math.min(insert,Math.min(delete,substitute));
          }

    }
    //Memoization
    public static int editDistanceM(String s, String t){
        int storage[][]=new int[s.length()+1][t.length()+1];
        for (int i=0;i<storage.length;i++){
            for (int j=0;j<storage[0].length;j++){
                storage[i][j]=-1;
            }
        }
        return editDistanceM(s,t,storage);
    }

    private static int editDistanceM(String s1, String s2, int[][] storage) {
        int m=s1.length();
        int n=s2.length();

        if (s1.equals(s2)){
            storage[m][n]=0;
            return 0;
        }
        if (s1.length()==0){
            storage[m][n]=s2.length();
            return s2.length();
        }
        if (s2.length()==0){
            storage[m][n]=s1.length();
            return s1.length();
        }
        if (s1.charAt(0)==s2.charAt(0)){
            storage[m][n]=editDistanceM(s1.substring(1),s2.substring(1),storage);
            return storage[m][n];

        }else{
            int insert=1+editDistanceM(s1,s1.charAt(0)+s2,storage);
            int delete=1+editDistanceM(s1,s2.substring(1),storage);
            int substitute=1+editDistanceM(s1,s1.charAt(0)+s2.substring(1),storage);
            storage[m][n]=Math.min(insert,Math.min(delete,substitute));
            return  storage[m][n];
        }

    }


}
