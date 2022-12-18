import java.util.Scanner;
public class CharacterCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char ch=str.charAt(0);
        if (ch>='A'&& ch<='Z') {
            System.out.println(1);
        }else if(ch>='a'&&ch<='z'){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
        }
}
