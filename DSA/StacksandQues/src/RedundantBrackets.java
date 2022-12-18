import java.util.Stack;

public class RedundantBrackets {
    public static boolean checkRedundantBrackets(String input) {
//      Simple Algo: if + not found when the search reaches ')' then the bracket is useless return false.
      Stack<Character>check=new Stack<>();
      Stack<Character>storeplus=new Stack<>();
      for(int i=0;i<input.length();i++){
          char c=input.charAt(i);
          if(c=='('){
              check.add('(');
          }else if(c==')'){
              if(!storeplus.contains('+')&&check.contains('(')){
                  return true;
              }
              check.pop();
              storeplus.pop();
          }
          if(c=='+'){
              storeplus.add('+');
          }
      }

       return false;
    }
    //        Stack<Character>redundant=new Stack<>();
//      int i=0;
//        int count=0;
//      while(i<expression.length()-1){
//           count=0;
//          while(expression.charAt(i)!=')'){
//              redundant.push(expression.charAt(i));
//              i++;
//              count++;
//          }
//          while(redundant.peek()!='('){
//              redundant.pop();
//          }
//          redundant.pop();
//      }
//if (count==0){
//    return true;
//}else{
//    return false;
//}
}
