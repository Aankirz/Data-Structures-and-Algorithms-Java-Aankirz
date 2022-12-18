package classes_and_objects;

public class student {
    String name;
   private final int rollno ;       //USING FINAL KEYWORD: CANNOT CHANGE VALUE ONCE INITIALISED,
                                                          //     INITIALISATION AT THE TIME OF DECLARATION,OR IN CUSTOM CONSTRUCTORS.
//   public student(String n){
//       name=n;  //not in use because of final keyword you have to give roll no a input you can't leave it null.
//   }
    private static  int numStudents;

   public student(String n,int rn){  // we could even set more than 1 custom constructors.
       System.out.println(this);
       name=n;
        rollno=rn;       //USING THIS KEYWORD: USE TO ACCESS DATATYPES IF BOTH ARE OF SAME NAME.
       numStudents++;  //Because of final keyword you can't set roll, once the input given.
   }
   public int getNumStudents(){
       return numStudents;
   }
//    public void setrollno(int rn){
//        if (rn<=0){
//            return;
//        }
//        rollno=rn;
//    }
    public int getRollno(){
        return rollno;
    }
    public void print(){
        System.out.println(name+":"+rollno);
    }
}
