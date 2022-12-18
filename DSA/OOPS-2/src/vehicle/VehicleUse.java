package vehicle;

import java.util.Scanner;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v=new Vehicle(120);
//       v.colour="Black";
//       v.setMaxspeed(120);
//        v.print();

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();          //POLYMORPHISM.:Parent could point to child,but can't be specific to it.
  Vehicle v;                                                   // but when both have same functions,
        if (n==0){                                                         //then at runtime child function would be chosen.
            v=new Car(10,200);
        }else{
            v=new Vehicle(250);
        }

        Car c=new Car(7,250);

        c.colour="Blue";
//        c.setMaxspeed(250);
//        c.numGears=7;
        c.isConvertible=true;
        c.print();     //BUT IF THEY HAVE SAME FUNCTION NAME THEN WILL GO UP THE HIERARCHY.

    }
}
