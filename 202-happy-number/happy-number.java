class Solution {
    static int sq(int n){
     int s=0;
      while(n!=0){
          s=s+(n%10)*(n%10);
          n=n/10;
      }
      return s;
    } 
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        while(n!=1){
          if(set.contains(n)){
            return false;
          }
          set.add(n);
          n=sq(n);
        }
         return true;
    }
    
}