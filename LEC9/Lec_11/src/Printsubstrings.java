public class Printsubstrings {
    public static void printSubstrings(String str){
        for (int i=0;i<str.length();i++){
            for (int j=0;j<=str.length();j++){
                if(i!=j&&j>i){
                    System.out.print(str.substring(i,j)+" ");
                }
            }

        }
    }

    public static void main(String[] args) {
        String str="coding";
        printSubstrings(str);
    }
}
