import java.util.ArrayList;

public class ArrayListdem {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();//we could insert any no. in the() to predefine a capacity , But size
                                                       // will still remain 0, otherwise default capacity is 10.
        System.out.println(list1.size());//o/p==0
        ArrayList<String> list2=new ArrayList<>();  //ONLY NON PRIMITIVES IN ARRAY LIST <   >;

          list1.add(15);  //random in the given order
          list1.add(20);
          list1.add(25); // Learn Generic
          list1.add(2,50); //fixed position.
        System.out.println(list1.size());
        // To Get one element.
        System.out.println(list1.get(2));
         //To Print every Element of List1, to access its length we use size.
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        //To remove an indexed element
        list1.remove(1); //now will contain 15 50 25 (0 Indexed List).

        //Now To Replace an element in the particular indexed list Use Set
        list1.set(1,100);

        //And to access an index that's not in range , Index Out oF Bound Exception error.

        //FOR EACH LOOP: Will not traverse the index , but instead it will travel from elements (But You cannot use it for making change)
        for(int elem: list1){
            System.out.print(elem+" ");//can also be used for array.
        }
    }
}
