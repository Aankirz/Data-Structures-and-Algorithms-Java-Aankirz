package classes_and_objects;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d=new DynamicArray();

        for (int i=0;i<100;i++){
            d.add(i+10);   // so nxtindex value:99 got ++ after it.
        }
        System.out.println(d.size());

        d.set(100,20);//now if the index provided is>next index then return,because data[nextindex] is unfilled.
        System.out.println(d.get(15));
        System.out.println(d.get(100));

        while (!d.isEmpty()){
            System.out.println(d.removeLast());
            System.out.println("size: "+d.size());
        }
    }
}
