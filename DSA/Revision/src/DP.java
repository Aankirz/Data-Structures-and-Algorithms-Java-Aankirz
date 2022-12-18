public class DP {
    //Fibonacci
 public static int fib(int n){ //Rec
  if (n==0||n==1){
   return n;
  }
  return fib(n-1)+fib(n-2);
 }
 public static int fibM(int n){ //Memoization
  //basically we are storing the output as well in an array so no need to calc every single time.
  int storage[]=new int[n+1];
  for (int i=0;i< storage.length;i++){
   storage[i]=-1; //initializing necessary to track it.
  }
  return fibM(n,storage);
 }
 private static int fibM(int n, int[] storage) {
  if (n==0||n==1){
   storage[n]=n;
   return n;  //only diff is that we are first storing output in an array.
  }
  if (storage[n]!=-1){
   return storage[n];
  }
  storage[n]=fibM(n-1,storage)+fibM(n-2,storage);
  return storage[n];
 }
 public static int fibDP(int n){ //Dynamic Programming
  //Bottom to UP ,storage array
  int storage[]=new int[n+1];

  storage[0]=0;  //similar to recursion : Base Case
  storage[1]=1;
  for (int i=2;i< storage.length;i++){ //buliding up further data with previous data or Base Case.
   storage[i]=storage[i-1]+storage[i-2];
  }
  return storage[n];
 }

    //MinSteps To ONE
 public static int minSteps(int n){ //Recursion.
  if (n==1)
   return 0; //base case: if already at one 0 steps reqd.

  int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE;
    if (n%2==0){ //calc small o/p.
     opt1=minSteps(n/2);
    }
  if (n%3==0){
   opt2=minSteps(n/3);
  }
  return 1+Math.min(minSteps(n-1),Math.min(opt1,opt2));//Rec calls.
 }
 public static int minStepsM(int n){//Memoization
  int storage[]=new int[n+1];
  for (int i=0;i< storage.length;i++){ //initialization to track only in memo.
   storage[i]=-1;
  }
   return minStepsM(n,storage);
 }
 private static int minStepsM(int n, int[] storage) {
  if (n==1){  //same base
   storage[n]=0;
   return storage[n];
  }
  if (storage[n]!=-1){
   return storage[n];  //an extra check is just added.
  }
  int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE;
  if (n%2==0){
   opt1=minStepsM(n/2,storage);
  }
  if (n%3==0){
   opt2=minStepsM(n/3,storage);
  }
  //NOTE: only store correct o/p in storage [n] not it's possibilities.
  storage[n]=1+Math.min(minStepsM(n-1,storage),Math.min(opt1,opt2));
  return storage[n];
 }
 public static int minStepsDP(int n){//Dynamic Programming
  int storage[]=new int[n+1];
  storage[1]=0;
  //here i is just building blocks of n.

  for (int i=2;i<storage.length;i++){
   int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE;
   if (i%2==0){
    opt1=storage[i/2];
   }
   if (i%3==0){
    opt2=storage[i/3];  //here pre data act as building blocks to shape upper data.
   }                  // So instead of making fn calls we take help of storage array.
   storage[i]=1+Math.min(storage[i-1],Math.min(opt1,opt2));
  }
  return storage[n];
   }

   //StairCase
 public static int staircase(int n){//Recursion
  if (n==1||n==2){
   return n;       //all possible ways.
  }
  if (n==0){
   return 1;
  }
  if (n<0){
   return 0;
  }
  return staircase(n-1)+staircase(n-2)+staircase(n-3);
 }
 public static int staircaseM(int n){//Memoization
  int storage[]=new int[n+1];
  for (int i=0;i<storage.length;i++){ //initialization necc to track only in memo
   storage[i]=-1;
  }
  return staircaseM(n,storage);
 }
 private static int staircaseM(int n, int[] storage) {
  if (n==1||n==2){ //base case
   storage[n]=n;  // just instead of dir returning o/p first store in array.
   return storage[n];
  }
  if (n==0){
   storage[0]=1;
   return storage[0];
  }
  if (n<0){
   return 0;
  }
       if (storage[n]!=-1){ //just an extra check
        return storage[n];
       }
       storage[n]=staircaseM(n-1,storage)+staircaseM(n-2,storage)+staircaseM(n-3,storage);
       return storage[n];
 }
 public static int staircaseDP(int n){//Dynamic Programming
  if(n==1){
   return 1;
  }
  int storage[]=new int[n+1];
  storage[0]=1;
  storage[1]=1;
  storage[2]=2;
  for (int i=3;i<storage.length;i++){
   storage[i]=storage[i-1]+storage[i-2]+ storage[i-3];
  }
  return storage[n];
 }

 //MinCount of Squares
 public static int minCount(int n) {//Recursion
  if(n==0){
   return 0;
  }
if(n==1||n==4||n==9){
 return 1;
}
int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE,opt3=Integer.MAX_VALUE;
if(n-1>0){
 opt1=minCount(n-1);
}
  if(n-4>0){
   opt2=minCount(n-4);
  }
  if(n-9>0){
   opt3=minCount(n-9);
  }
  return 1+Math.min(opt1,Math.min(opt2,opt3));
 }
public static int minCountM(int n){//Memoization
  int storage[]=new int[n+1];
  for(int i=0;i< storage.length;i++){
   storage[i]=-1; //Initialization in memo to keep a track.
  }
  return minCountM(n,storage);
}

 private static int minCountM(int n, int[] storage) {
  if(n==0){
   storage[0]=0;
   return storage[0];
  }
  if(n==1||n==4||n==9){
   storage[1]=1;
   storage[4]=1;
   storage[9]=1;
   return 1;
  }
  if(storage[n]!=-1){
   return storage[n];
  }
  int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE,opt3=Integer.MAX_VALUE;
  if(n-1>0){
   opt1=minCountM(n-1,storage);
  }
  if(n-4>0){
   opt2=minCountM(n-4,storage);
  }
  if(n-9>0){
   opt3=minCountM(n-9,storage);
  }
  return 1+Math.min(opt1,Math.min(opt2,opt3));
 }
 public static int minCountDP(int n){
  if(n==1||n==4||n==9){
   return 1;
  }
  if(n==0){
   return 0;
  }
  int storage[]=new int[n+1];
  storage[0]=0;
  storage[1]=1;
  storage[4]=1;
  storage[9]=1;

  for(int i=2;i< storage.length;i++){
   int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE,opt3=Integer.MAX_VALUE;
   if(i-1>0){
    opt1=storage[i-1];
   }
   if(i-4>0){
    opt2=storage[i-4];
   }
   if(i-9>0){
    opt3=storage[i-9];
   }
   storage[i]=1+Math.min(opt1,Math.min(opt2,opt3));
  }
  return storage[n];
 }

}
