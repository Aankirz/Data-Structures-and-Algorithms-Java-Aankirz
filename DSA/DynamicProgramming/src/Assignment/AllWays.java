package Assignment;

public class AllWays {
    public static int allWays(int x, int n) {
    int storage[]=new int[x+1]; //extreme case (1+1+..xtimes)=x
       //Base Case
        if (n==0){
            return x;
        }
        storage[0]=0;
        storage[1]=1;
        int opt2=0,opt3=0;
int n1=(int)Math.pow(2,n);
        int n2=(int)Math.pow(3,n);
        for (int i=2;i< storage.length;i++){
            int opt1=storage[i-1];

            storage[i]=1+opt1;
        }
        for (int i=2;i< storage.length;i++){
//            if
        }
        return storage[x];
    }


    }
