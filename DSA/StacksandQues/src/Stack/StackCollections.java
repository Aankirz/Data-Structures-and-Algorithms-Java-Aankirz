package Stack;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        int arr[]={1,4,7,0,1};
        for (int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()){
           // System.out.println(stack.pop());
            //or
            System.out.println(stack.peek());
            stack.pop();

        }
    }
}
