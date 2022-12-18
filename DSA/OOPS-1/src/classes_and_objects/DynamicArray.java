package classes_and_objects;

public class DynamicArray {
              //ASSIGNING INPUTS.
    private int data[];
    private int nextIndex;

              //CREATING CUSTOM CONSTRUCTORS, AND IF IT'S AN OPERATOR IT HAS TO RETURN SOMETHING.
    public DynamicArray(){
        data=new int[5];
        nextIndex=0;
    }
    public int size(){
        return nextIndex;
    }
             // ADDING ELEMENTS.
    public void add(int element){
        if (nextIndex==data.length){
          restructure();
        }
        data[nextIndex]=element;
        nextIndex++;
    }
public void set(int index,int element){  //Setting or giving value to a ynamic array.
        if (index>nextIndex){
            return;
        }
        if (index<nextIndex){
            data[index]=element;
        }else{
            add(element);
        }
}
public int get(int index){
        if (index>=nextIndex){
            //error out.
            return -1;
        }
        return data[index];
}
public boolean isEmpty(){
        if (size()==0){
            return true;
        }else{
            return false;
        }

}
public int removeLast(){
        if (size()==0){
            return -1;
        }
        int value=data[nextIndex-1];
        data[nextIndex-1]=0;
        nextIndex--;            //making last value 0;
        return value;

}
public void restructure(){
        int temp[]=data;
        data=new int[data.length*2];
        for (int i=0;i< temp.length;i++){
            data[i]=temp[i];
        }
}

}
