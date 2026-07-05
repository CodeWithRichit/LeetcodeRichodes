class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<=19;i++){
            if(n==Math.pow(3,i)){
                return true; 
            }
        }
        return false;
    //     if(n<=0){
    //         return false;
    //     }
    //     else if(1162261467%n==0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
}
}