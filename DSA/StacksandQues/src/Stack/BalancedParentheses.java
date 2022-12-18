package Stack;

import java.util.*;

public class BalancedParentheses {
//    public static boolean isBalanced(String expression){
//        Stack<Character>stack=new Stack<>();   //creation of a stack and only character is getting added
//        for (int i=0;i<expression.length();i++){
//            if (expression.charAt(i)=='('){
//                stack.push(expression.charAt(i));
//            }else if(expression.charAt(i)==')'){
//                if (stack.isEmpty()){
//                    return false;
//                }
//                char topChar=stack.pop();
//                if (expression.charAt(i)==')'&& topChar=='('){
//                    continue;
//                }else{
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
public static boolean isBalanced(String expression) {
//  GOOD CODE DN.
    Stack<Character>balanced=new Stack<>();
    for(int i=0;i<expression.length();i++){
         if(expression.charAt(i)=='('){
             balanced.add(expression.charAt(i));
         }else{
             balanced.pop();
         }
    }
    if(balanced.isEmpty()){
        return true;
    }
    return false;
}
}
//    public static boolean isBalanced(String expression) {
//       if (expression.charAt(0) == ')'){
//           return false;
//       }
//int m = 0,n=0,k=0;
//     for (int i=0;i<expression.length();i++){
//         if (expression.charAt(i)=='('){
//             m++;
//         }else{
//             n++;
//         }
//     }
//      if (m==n){
//          return true;
//      }else {
//          return false;
//      }
//    }

