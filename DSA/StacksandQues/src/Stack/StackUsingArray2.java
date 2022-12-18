package Stack;

public class StackUsingArray2 {
    private int data[];   // clearly two datas are needed array and element's index that will be added in stack manner.
    private int top;        //top is the index;      //and why to give element idiot array stores both.
                        //Now making custom constructors.
    public StackUsingArray2(){     //To define data.
           data=new int[10];
           top=-1;
    }
    public StackUsingArray2(int capacity){
        data=new int[capacity];
        top=-1;
    }

          // Now making of the different characteristics of STACKS.
    //1. To check whether it is empty or not. (boolean datatype).
    public boolean notEmpty(){
        return (top==-1);      //O(1) because just one comparison.
    }
    //2. To access the size of stack at present time.
    public  int size(){   // size variable
        return top+1;
    }
    //3. To access the element at the top.
    public int top() throws StackEmptyException {
        if (top==-1){
            StackEmptyException e=new StackEmptyException();
           throw e;
        }
        return data[top]; //O(1) because just one comparison. 
    }
//4. To Push the elements( adding the elements).
    public void push(int elem) throws StackFullException {
        if (size()== data.length){
           throw new StackFullException();
        }
        top++;
        data[top]=elem;
    }
//5. To pop out the elements.
    public int pop(){
        int temp=data[top];
        top--;
        return temp;
    }

    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray2 stack=new StackUsingArray2();
        for (int i=1;i<=5;i++){
            stack.push(i);
        }

        while(!stack.notEmpty()){
            System.out.println(stack.pop());

        }
    }
}
