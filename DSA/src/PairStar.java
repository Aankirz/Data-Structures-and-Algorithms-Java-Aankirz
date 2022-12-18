public class PairStar {
    public static String addStars(String s){
     if (s.length()<=1){
       return s;                           //BASE CASE
     }

     if (s.charAt(0)==s.charAt(1)){
         return s.charAt(0)+"*"+addStars(s.substring(1));
     }
       return s.charAt(0)+addStars(s.substring(1));      //Breaking case.
    }

    public static void main(String[] args) {
        System.out.println(addStars("aabcd"));
    }

//    public static void main(String[] args) {
//        String str=
//    }
}
//        s.charAt(0)+"*"+s.charAt(1)+addStars(s.substring(1));