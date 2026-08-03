class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1)
        return 0;
        int c=0;
        int s=0,j=0;
        long prod=1;
        while(s<=j && j<nums.length){
            prod=prod*nums[j];
            while(prod>=k){
                prod=prod/nums[s];
                s++;
            }
            if(prod<k){
                c=c+j-s+1;
            }
            j++;
        }
        return c;
    }
}