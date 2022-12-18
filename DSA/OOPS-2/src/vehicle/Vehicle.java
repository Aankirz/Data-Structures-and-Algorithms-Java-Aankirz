package vehicle;

public class  Vehicle {      //If p c final vehicle -> error in Car extends Vehicle.
   protected String colour;
   private int maxspeed;   // if max speed made private now extends will even can't help to access.
                                              // now you have to use getters and setters to access.
    public Vehicle(int maxspeed){
        this.maxspeed=maxspeed;
        System.out.println("Vehicle Constructor");
    }
    public void print() {
        System.out.println("Vehicle colour :" + colour);
        System.out.println("Vehicle maxspeed:"+maxspeed);
    }
    public int getMaxspeed(){
        return maxspeed;
    }
    public void setMaxspeed(int n){
        maxspeed=n;
    }
}
