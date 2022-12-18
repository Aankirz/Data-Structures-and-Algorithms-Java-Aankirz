package classes_and_objects;

public class ComplexNumbers {
                 //ASSIGNING INPUTS.
    private int real;
    private int img;
                // MAKING CUSTOM CONSTRUCTORS(NAME SAME AS CLASS NAME).
    public ComplexNumbers(int real,int img){
        this.real=real;//colours
        this.img=img;
    }
    public void print(){  //print function
        System.out.println(real+" "+"+"+" "+"i"+img);
    }
              //MAKING SETTERS AND GETTERS TO MODIFY PRIVATE DATA IN OUR OWN TERMS.
    public void setReal(int n){
        real=n;
    }
    public void setImg(int n){
        img=n;
    }
    public int getReal(){
        return real;
    }
    public int getImg(){
        return img;
    }
            //OPERATORS  IF ONLY RESULT IS MANDATORY,IN TERMS OF CHANGING ORIGINAL COMPLEX NO.
    public void plus(ComplexNumbers c2){
        this.real=this.real+c2.real;
        this.img=this.img+c2.img;
    }
    public void multiply(ComplexNumbers c2){
        int n=this.real;
        this.real=(this.real*c2.real)-(this.img*c2.img);
        this.img=(n*c2.img)+(this.img*c2.real);
    }
          //CALLING CUSTOM CONSTRUCTORS TO GET RESULT BUT WITHOUT CHANGING THE ORIGINAL COMPLEX NO.
//    public ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2){
//       int r=c1.real+c2.real;
//       int i=c1.img+c2.img;
//       ComplexNumbers c=new ComplexNumbers(r,i);
//       return c;
//    }
//    public  void conjugate(ComplexNumbers c1){
//        int r=c1.real;
//        int im=c1.img;
//        System.out.println(r+"-"+"i"+im);
//    }
}
