package Assignment;

public class LootHouses {
    public static int maxMoneyLooted(int[] houses,int i) {
        if (i>=houses.length){
            return 0;
        }
         int option2=Integer.MIN_VALUE;
        int option1=houses[i]+maxMoneyLooted(houses,i+2);
        if(i+1<houses.length){
            option2=houses[i+1]+maxMoneyLooted(houses,i+3);
        }


        return Math.max(option1,option2);
    }
    public static int maxMoneyLooted(int[] houses){
        return maxMoneyLooted(houses,0);
    }
    public static int maxMoneyLootedM(int[] houses){
        int storage[]=new int[houses.length+1];
        for (int i=0;i< storage.length;i++){
            storage[i]=-1;
        }
        return maxMoneyLootedM(houses,0,storage);
    }

    private static int maxMoneyLootedM(int[] houses, int i, int[] storage) {
        if (i>=houses.length){
            storage[i]=0;
            return storage[i];
        }
        if (storage[i]!=-1){
            return storage[i];
        }
        int option2=Integer.MIN_VALUE;
        int option1=houses[i]+maxMoneyLootedM(houses,i+2,storage);
        if(i+1<houses.length){
            option2=houses[i+1]+maxMoneyLootedM(houses,i+2,storage);
        }

storage[i]=Math.max(option1,option2);
        return storage[i];
    }

}
