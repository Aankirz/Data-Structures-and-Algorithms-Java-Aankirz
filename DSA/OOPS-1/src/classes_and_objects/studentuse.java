package classes_and_objects;

import java.util.Scanner;
//use import package(name).class(name); if use of one class in another ,even without being in the same package.
public class studentuse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        student s1=new student("Ankit",3);
        System.out.println(s1.name);
        s1.print();
     //   System.out.println(s1);//output:- classes_and_objects.student@23fc625e
//        s1.name="Ankit";
//        s1.setrollno(3);
//
//        System.out.println(s1.name);
//        System.out.println(s1.getRollno());

    }
}
