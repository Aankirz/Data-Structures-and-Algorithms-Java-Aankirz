package Assignment;

public class MCM {
    public static int mcm(int[] p,int si,int ei,int storage[][]){
        if (si>=ei||si==ei-1){
            return 0;
        }
if (storage[si][ei]!=-1){
    return storage[si][ei];
}
        int min=Integer.MAX_VALUE;
            for (int i=si+1;i<=ei-1;i++){

                int output= mcm(p,si,i,storage)+mcm(p,i,ei,storage)+(p[si]*p[i]*p[ei]);

                if (output<min){
                    min=output;
                }
            }
              storage[si][ei]=min;
        return min;
    }
    public static int mcm(int[] p){
        int storage[][]=new int[p.length+1][p.length+1];
        for (int i=0;i<storage.length;i++){
            for (int j=0;j<storage.length;j++){
                storage[i][j]=-1;
            }
        }
        return mcm(p,0,p.length-1,storage);
    }

    }
