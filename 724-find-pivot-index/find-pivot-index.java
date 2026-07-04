class Solution {
    public int pivotIndex(int[] nums) {
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            int bsum=0;
            int fsum=0;
            for(int j=0;j<i;j++){
               bsum=bsum+nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
               fsum=fsum+nums[k];
            }
            if(fsum==bsum){
                idx=i;
                return idx;
            }
        }
        return idx;
    }
}