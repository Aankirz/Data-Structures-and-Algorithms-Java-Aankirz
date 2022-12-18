package classes_and_objects;

public class Polynomial  {  //Creating dynamic array.
    DynamicArray coefficients;


    public Polynomial(){
    coefficients=new DynamicArray();
    }
    public void setCoefficients(int deg,int coeff) {
        coefficients.set(deg, coeff);
        if (deg>=coefficients.size()){
            coefficients.restructure();
        }

    }

    public int getCoefficients(int deg){
     return coefficients.get(deg);
    }
    public void print(){
        for (int i=0;i<coefficients.size();i++){
            if (coefficients.get(i)!=0){
                System.out.print(coefficients.get(i)+"x"+"^"+i);
            }
        }

    }
//    public Polynomial add(Polynomial p){
//
//
//    }

}
