class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        else if(Math.pow(3,30)%n==0){
            return true;
        }
        else{
            return false;
        }
    }
}