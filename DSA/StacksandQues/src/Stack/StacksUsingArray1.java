package Stack;

public class StacksUsingArray1 {
    private int data[];   //making the i/p as empty so that only we could access.
    private int top;
                      //Custom constructors.
    public StacksUsingArray1(){
        data=new int[10];
        top=-1;
    }

    public StacksUsingArray1(int capacity){
        data=new int[capacity];
        top=-1;
    }
                    //  Checking is empty.
    public boolean isEmpty(){
//        if (top==-1){
//            return true;
//        }else{
//            return false;
//        }  or better way.

        return (top==-1);

    }
                      // Checking size.
    public int size(){
        return top+1;
    }
    public int top() throws StackEmptyException {
        if (size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int elem) throws StackFullException {
        if (size()== data.length){
            StackFullException e=new StackFullException();
            throw e;
        }
        top++;
        data[top]=elem;
    }
    public int pop() throws StackEmptyException {
        if (size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        int temp=data[top];
        top--;
        return temp;
    }

}
