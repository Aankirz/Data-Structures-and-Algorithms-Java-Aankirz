package vehicle;

public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public Car(int numGears,int maxspeed){         //now since parent comstructor remains undefined so use super give input,or make another variable in child.
        super(maxspeed);
        this.numGears=numGears;
        System.out.println("Car Constructor");

    }

    public void print(){
        super.print();    //#both included.
//        System.out.println("Car colour :"+ colour);
//        System.out.println("Car maxSpeed :"+getMaxspeed());//now to access private data we need to use getters and setters.
        System.out.println("Car numGears :"+numGears);
        System.out.println("Car isconvertible :"+ isConvertible);
    }
}
