public class GeometricSum {
   private static double findGeometricSum(int k,double start){
        if (start>k){
            return 0;
        }
        double n=Math.pow(0.5,start);
        double geometricsum=findGeometricSum(k,start+1);

        return n+geometricsum;
    }
    public static double findGeometricSum(int k){
        return findGeometricSum(k,0);
    }

    public static void main(String[] args) {
        System.out.print(findGeometricSum(3));
    }
}
