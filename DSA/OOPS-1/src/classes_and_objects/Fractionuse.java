package classes_and_objects;

public class Fractionuse {
    public static void main(String[] args) {
          Fraction f1=new Fraction(20,30);
          f1.print();
          f1.setNumerator(12);
          f1.setDenominator(6);//    This is to set values.
          int d= f1.getDenominator();
          System.out.println(d);     //   This is to access that value.

        Fraction f2=new Fraction(45,90);
        f2.print();
        f1.add(f2);
        f1.print();
        f1.multiply(f2);
        f1.print();

        Fraction f3=Fraction.add(f1,f2);
        f3.print();
    }
}
