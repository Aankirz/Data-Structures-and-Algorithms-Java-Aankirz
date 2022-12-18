package classes_and_objects;

public class Fraction {        //  #CREATING CONSTRUCTORS FOR FRACTIONS.(A CONSTRUCTOR USES CLASS NAME.)
    private int numerator;
    private int denominator;

    public Fraction(int num,int den){
         numerator=num;
         denominator=den;
         simplify();
    }
    private void simplify(){                 //SIMPLIFIERS.
        int gcd=1;
        int smallest=Math.min(numerator,denominator);
         for(int i=2;i<=smallest;i++){
             if (numerator%i==0&&denominator%i==0){
                 gcd=i;
             }
         }
         numerator=numerator/gcd;
         denominator=denominator/gcd;

    }                                       //GETTERS AND SETTERS.
    public void setNumerator(int n){
        numerator=n;
        simplify();
    }
    public void setDenominator(int n){
        if (n==0){
            return;
        }
       denominator=n;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
                       //  PRINT.
    public void print(){
        if (denominator==1){
            System.out.println(numerator);
        }
        System.out.println(numerator+"/"+denominator);
    }
                   //OPERATORS.
    public static Fraction add(Fraction f1,Fraction f2){//  HERE IN STATIC WE ARE ACTUALLY CREATING A NEW FRACTION AND THEN
        int newnum=f1.numerator* f2.denominator+f1.denominator*f2.numerator;               // GIVING ANSWERS.
        int newden=f1.denominator*f2.denominator;                   // WE NEED TO GIVE INPUT OF BOTH FRACTIONS.
        Fraction f=new Fraction(newnum,newden );
        return f;         //calling custom constructors.
    }
    public void add(Fraction f2){     //HERE IN NON STATIC, WE ARE ACTUALLY CHANGING ANY (GENERALISING)
        this.numerator=this.numerator* f2.denominator+this.denominator*f2.numerator; //Fraction fi:using reference,"fi.addf2".
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }
    public  void multiply(Fraction f2){
        this.numerator=this.numerator*f2.numerator;
        this.denominator=this.numerator*f2.denominator;
        simplify();
    }


}
