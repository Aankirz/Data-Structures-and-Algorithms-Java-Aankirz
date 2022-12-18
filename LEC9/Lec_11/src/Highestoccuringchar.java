public class Highestoccuringchar {
    public static char highestOccuringChar(String str){
        //APPROACH-1;
//        int arr[]=new int[str.length()];
//        int max=0;
//        char ch=(char) ' ';
//        for (int i=0;i<str.length();i++) {
//            int n = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    n++;
//                }
//            }
//            if (n > max) {     due to greater than no updation if value remains same.
//                max = n;
//                 ch = str.charAt(i);
//            }
//        }
//        return ch;
        //APPROACH-2(FREQUENCY ARRAY 256.

        int[] freq = new int[256];
        int lar = 0;
        int index = 0;

        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)] += 1;
        }

        for(int i = 0; i < 256; i++){
            if(freq[i] > lar){
                lar = freq[i];
                index = i;
            }
        }

        return (char)index;


    }



    public static void main(String[] args) {
        String str="xy";
        char ch=highestOccuringChar(str);
        System.out.println(ch);
    }
}
