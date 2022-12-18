package com.company;

public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println(2&3);
        System.out.println(2|3);
        System.out.println(2^3);
        System.out.println(~999);
        int c=10,b=-20;
        System.out.println(c^b);//DOUBTTTTTTT
        int a=5;
        a+=5+(++a)+(a++);
        System.out.println(a);/*     a=a+5+(++a)+(a++).
                                            =5+5+6+6=22         */
    }

}
// CONCEPT 1: BINARY CONCEPT.(O&1)
//JUST WRITE IT FIRST :
//1 2 4 8 16 32 ........(POWERS OF 2).
// SO TO GET BINARY NO. OF ANY NUMBER,JUST SEE WHAT TO ADD TO GET THAT AND PLACE 1 FOR THOSE AND REST 0.(atleast write 4 values)(CHOOSE THAT 4 VALUES AND DEAL FURTHER IN  SUCH A WAY THAT IT'S IDENTITY REMAINS PRESERVED).(BUT USE FULL BINARY FOR NEGATION).

// CONCEPT 2:LOGICAL OPERATORS: &(AND(product)),|(OR(sum)),^(XOR(ExclusiveOr:Both 1or0=0,either value1=1)),~(negation)(~(VAR)=-(VAR)-1)

// CONCEPT 3:LEFT SHIFT(<<N)(N->nat no.)(MEANS SHIFT A NO.(binary form) LEFT  BY ADDING 0 BY N BITS)
//           RIGHT SHIFT(>>N)(")(MEANS SHIFT A NO.(") RIGHT BY DELETING IT.

// CONCEPT 4: INCREAMENT AND DECREAMENT OPERATORS.
//         PRE(++a,--a) AND POST (a++,a--) (IN PRE OUTPUT WILL BE a+1,a-1)(IN POST OUTPUT WILL BE a,a (IN NEXT TURN IT WILL INCREASE OR DECREASE))
