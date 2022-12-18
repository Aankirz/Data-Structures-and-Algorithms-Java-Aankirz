package vehicle_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
         public Truck(int maxspeed){
             super(maxspeed);
         }
 int maxloadingCapacity;
 public void print(){
     System.out.println("Truck Capcity: "+maxloadingCapacity);
     System.out.println("Truck color: "+colour);//error because freindly/default so freindly within same package,
                                                //so has to be converted to protected.
 }

}
