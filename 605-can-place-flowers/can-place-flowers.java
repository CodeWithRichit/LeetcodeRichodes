class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int m=n;
        int count=0;
        if(arr.length==1){
            if(n==0) return true;
            if(arr[0]==1){
                return false;
            }
            else{
                return true;
            }
        }
        while(n-->0){
           for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
               if((i-1<0 || arr[i-1]==0) && (i+1==arr.length || arr[i+1]==0)){
                arr[i]=1;
                count++;
               }
            }
           }
        }
        if(count>=m){
            return true;
        }
        return false;
    }
}