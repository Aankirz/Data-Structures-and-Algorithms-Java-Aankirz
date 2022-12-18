package Stack;

import java.util.Stack;

public class MinimumBracketReversal {
    public static int countBracketReversals(String input) {
//       GOOD CODE DN
        Stack<Character>mincount=new Stack<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='{'){
                mincount.add(c);
            }else {
                if (!mincount.contains('{')){
                    mincount.add(c);
                }else{
                    mincount.pop();
                }

            }
        }
        int count=mincount.size();
        if(count%2==0){
            if(input.charAt(0)=='}'){
                return count/2+1;
            }
            return count/2;
        }
        return -1;
    }

}
