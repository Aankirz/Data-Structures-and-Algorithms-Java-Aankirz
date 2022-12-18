package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        Stack<Integer> extra1 = new Stack<>();
        while(!input.isEmpty()){
            extra1.push(input.peek());
            input.pop();
        }
        while(!extra1.isEmpty()){
            extra.push(extra1.peek());
            extra1.pop();
        }
        while(!extra.isEmpty()){
            input.push(extra.peek());
            extra.pop();
        }
    }
}
